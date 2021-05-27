package com.zetcode;

/*Generated by MPS */

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import common.data.ApplicationState;
import common.ui.Board;
import javax.swing.JPanel;
import common.util.GameWindowListener;
import common.util.JSONPort;
import java.io.File;
import javax.swing.ImageIcon;
import common.util.ImageScaler;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.Box;
import common.data.GameConstants;
import common.data.LevelDescription;
import java.awt.BorderLayout;
import common.ui.LearningPortfolio;
import common.ui.LevelSelection;
import common.ui.editor.TopicEditor;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.BorderFactory;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import common.edu.Lesson;
import common.edu.Topic;
import java.util.ArrayList;
import common.edu.Question;
import common.edu.Fact;

public class MathSweeper extends JFrame implements ActionListener {
  private ApplicationState appState;
  public final String saveFileName = "minesweeper-save.ser";
  private String rootPath;

  private final int N_BUTTONS = 3;
  private final int BUTTON_WIDTH = 140;
  private final int BUTTON_HEIGHT = 40;
  private final int BUTTON_SPACING = 30;
  private final int TOP_PADDING = 50;
  private final int BOTTOM_PADDING = 50;
  private final int MENU_WIDTH = 400;
  private final int MENU_HEIGHT = TOP_PADDING + BOTTOM_PADDING + (BUTTON_SPACING + BUTTON_HEIGHT) * N_BUTTONS;

  private Board minesweeperBoard;
  private JPanel menu;
  private JPanel game;

  public MathSweeper() {
    setupPaths();
    setupAppState();
    addWindowListener(new GameWindowListener(appState, rootPath + saveFileName));
    showMenu();
  }
  public void setupAppState() {
    appState = ApplicationState.deserializeAppState(rootPath + saveFileName);
    if (appState == null) {
      setupDefaultGameSettings();
    }
    // Give JSONPort a reference to appState for default folder paths: 
    JSONPort.setApplicationState(appState);

  }


  /**
   * To deprecate:
   */
  public void setupPaths() {
    File sourceLocation = new File(MathSweeper.class.getProtectionDomain().getCodeSource().getLocation().getPath());
    ImageIcon img;
    String imageName = "0.png";
    // Path for the IntelliJ minesweeper project's resources folder: 
    rootPath = sourceLocation.getPath() + "/";
    String path = rootPath + "resources/";
    img = new ImageIcon(path + imageName);
    // If the load fails, look for resources in parent folder: 
    if (img.getIconHeight() == -1 || img.getIconWidth() == -1) {
      rootPath = sourceLocation.getParent() + "/";
      path = rootPath + "resources/";
    }
    ImageScaler.ResourcesPath = path;
  }
  public void showMenu() {
    if (menu == null) {
      createMenu();
    }
    setContentPane(menu);
    setResizable(true);
    pack();
    setTitle("Minesweeper Menu");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  private void createMenu() {
    menu = new JPanel();
    menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
    menu.setPreferredSize(new Dimension(MENU_WIDTH, MENU_HEIGHT));
    menu.add(Box.createRigidArea(new Dimension(0, TOP_PADDING)));
    addButton(GameConstants.PLAY, "Play in learning mode", menu);
    
    addButton(GameConstants.LESSONS, "View learning portfolio", menu);;

    addButton(GameConstants.EXIT, "Close application", menu);
    menu.add(Box.createRigidArea(new Dimension(0, BOTTOM_PADDING)));
  }
  private void showGame(LevelDescription level) {
    createGame(level);
    // else minesweeperBoard.newGame(true, true); 
    setContentPane(game);
    setResizable(true);
    pack();
    setTitle("Minesweeper");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  private void createGame(LevelDescription level) {
    game = new JPanel();
    game.setLayout(new BorderLayout());
    minesweeperBoard = new Board(this, level, this);
    game.add(minesweeperBoard);
    game.add(minesweeperBoard.statusbar, BorderLayout.SOUTH);
  }
  private void showLearningPortfolio() {
    LearningPortfolio portfolio = new LearningPortfolio(appState.topics, this);
    setTitle("Learning Portfolio");
    setContentPane(portfolio);
    pack();
  }
  private void showLevelSelection() {
    LevelSelection levelSelection = new LevelSelection(appState.levels, this);
    setContentPane(levelSelection);
    pack();
  }
  private void showTopicEditor() {
    TopicEditor topicEditor = new TopicEditor(appState, this, this);
    setContentPane(topicEditor);
    pack();
  }

  private void addButton(String text, String toolTip, Container container) {
    JButton button = new JButton(text);
    button.setAlignmentX(Component.CENTER_ALIGNMENT);
    button.setActionCommand(text);
    button.addActionListener(this);
    button.setToolTipText(toolTip);
    // Adding the button to a JPanel with a border layout so that all buttons are stretched to the same size. 
    JPanel borderPane = new JPanel(new BorderLayout());
    int sidePad = (MENU_WIDTH - BUTTON_WIDTH) / 2;
    borderPane.setBorder(BorderFactory.createEmptyBorder(0, sidePad, 0, sidePad));
    borderPane.add(button, BorderLayout.CENTER);
    container.add(borderPane);
    // Add bottom padding: 
    container.add(Box.createRigidArea(new Dimension(0, BUTTON_SPACING)));
  }
  public void actionPerformed(ActionEvent e) {
    // Manage level selection button presses: 
    try {
      int levelNo = Integer.parseInt(e.getActionCommand());
      showGame(appState.levels.get(levelNo));
      return;
    } catch (NumberFormatException ignored) {
    }
    // Manage menu and navigation buttons: 
    switch (e.getActionCommand()) {
      case GameConstants.PLAY:
        showLevelSelection();
        break;
      case GameConstants.TEST:
        JOptionPane.showMessageDialog(this, "This will turn on the 'test' game mode.");
        break;
      case GameConstants.LESSONS:
        showLearningPortfolio();
        break;
      case GameConstants.EXIT:
        System.out.println("Application exiting");
        ApplicationState.serializeAppState(appState, rootPath + saveFileName);
        System.exit(0);
        break;
      case GameConstants.MENU:
        showMenu();
        break;
      case GameConstants.EDIT:
        showTopicEditor();
        break;
      default:
    }
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        {
          MathSweeper ex = new MathSweeper();
          ex.setVisible(true);
        }
      }
    });
  }
  public void setupDefaultGameSettings() {
    LevelDescription learningLevel;
    LevelDescription testLevel;
    Lesson lesson;
    Topic topic;
    ArrayList<Lesson> lessons;
    ArrayList<Topic> topics = new ArrayList();
    ArrayList<Question> questions;
    ArrayList<Fact> facts;
    ArrayList<LevelDescription> levels;

    System.out.println("Loading default game configuration.");

    levels = new ArrayList();
    int levelNo = 0;

    // Set up levels: 
    lessons = new ArrayList();
    // Lesson " Statistics introduction " and its level: 
    questions = new ArrayList();
    questions.add(new Question("What is the median of the following list? 6, 7, 1, 4, 9, 6, 3, 6.", new String[]{"3.5", "6.5", "5", "6"}, "6"));
    questions.add(new Question("What is the Range of the following list? 6, 7, 1, 4, 9, 6, 3, 6.", new String[]{"2", "6", "5", "8"}, "8"));
    questions.add(new Question("A student has the following grades: 5, 6, 7, ..., 10, 10. One grade is omitted. The median is 8. What grade was omitted?", new String[]{"7", "8", "10", "9"}, "9"));
    questions.add(new Question("A student has the following grades: .., 6, 7, 8, 10, 10. One grade is omitted. The range is 6. What grade was omitted?", new String[]{"2", "3", "5", "4"}, "4"));
    questions.add(new Question("A student has the following grades: 5, 6, 7, ..., 10, 10. One grade is omitted. The average is 7.5. What grade was omitted?", new String[]{"8", "9", "10", "7"}, "7"));
    questions.add(new Question("What is an arithmetic average?", new String[]{"The most frequent value from a list of numbers.", "The most likely sum of two numbers.", "The sum of the largest and the smallest numbers of a list divided by two.", "The sum of each number in a collection, divided by the size of the collection."}, "The sum of each number in a collection, divided by the size of the collection."));

    facts = new ArrayList();
    facts.add(new Fact("Arithmetic average", "Arithmetic average (mean) is the sum of each number in a collection, divided by the size of the collection. For example, the average of 4 and 6 is 10 divided by 2, which equals 5."));
    facts.add(new Fact("Median", "The median is the middle value in the list of numbers. To find the median, your numbers have to be listed in numerical order from smallest to largest, so you may have to rewrite your list before you can find the median."));
    facts.add(new Fact("Range", "The range of a list of numbers is just the difference between the largest and smallest values."));
    facts.add(new Fact("Mode", "The mode is the value that occurs most often. If no number in the list is repeated, then there is no mode for the list."));
    facts.add(new Fact("Calculating a Mode", "There are a few approaches to calculating a mode. One is rewriting the list in an ordered manner and then counting number appearances. This is useful as you may also easily find the median and the range of such a list. Another way is to create a table, write values on the first line and their occurrences on the second. You may add more lines to the table to further analyze each value."));


    learningLevel = new LevelDescription();
    learningLevel.levelNo = levelNo++;
    learningLevel.setGameBase(9, 9, 10, 1);
    learningLevel.setItemCounts(1, 3, 3);
    learningLevel.startingReveals = 1;
    levels.add(learningLevel);

    lesson = new Lesson("Statistics introduction", facts, questions, learningLevel);
    lessons.add(lesson);
    // Lesson " Combinatorics basics " and its level: 
    questions = new ArrayList();
    questions.add(new Question("There is a class of 18 students: 10 girls, 8 boys. A team of 2 girls and 1 boy is being selected. In how many ways can the team be selected?", new String[]{"720", "816", "560", "360"}, "360"));
    questions.add(new Question("6! = ?", new String[]{"120", "5040", "360", "720"}, "720"));
    questions.add(new Question("There is a class of 15 students: 10 girls, 8 boys. A team of 4 students is being selected. In how many ways can the team be selected?", new String[]{"1560", "8190", "2016", "1365"}, "1365"));
    questions.add(new Question("8 students are participating in a race. In how many ways can the top 3 places be distributed?", new String[]{"56", "168", "1680", "336"}, "336"));
    questions.add(new Question("What is the expression 5P4 (P = permutation ) equal to?", new String[]{"20", "60", "120", "5"}, "5"));
    questions.add(new Question("Jane is attempting to unlock her locker but has forgotten her locker combination. The lock uses 3 numbers and includes only the numbers 1 to 9. Each of the digits also can not be repeated in the combination. How many possible locker combinations can be formed?", new String[]{"729", "27", "252", "504 "}, "504 "));
    questions.add(new Question("What is the expression 7P2 (P = permutation ) equal to?", new String[]{"120", "2640", "5040", "42"}, "42"));

    facts = new ArrayList();
    facts.add(new Fact("Combination", "A selection of items from a collection, such that the order of selection does not matter (unlike permutations). "));
    facts.add(new Fact("Factorial", " The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n: n! = n·(n - 1)·(n - 2)·(n - 3)· ... ·3·2·1. For example, 5! = 5·4·3·2·1 = 120."));
    facts.add(new Fact("Factorial division", "Due to definition of factorials, it is convenient to divide factorials of larger numbers by those of smaller. For example, 10! / 8! = (10·9·8·7·...·2·1)/(8·7·6·...·2·1) = 10·9 = 90."));
    facts.add(new Fact("Calculating combinations", "If the set has n elements, the number of k-combinations is equal to the binomial coefficient C(n, k) = n! / (k!·(n - k)!). For example, a pair of students from a class of 20 students is a 2-combination from 20 elements, denoted by C(20, 2). The amount of such combinations is C(20, 2) = 20! / (2!·(20-2)!) = 20! / (2!·18!) = 20·19/2 = 10·19 = 190."));
    facts.add(new Fact("Permutation", "An arrangement of a set's members into a sequence or linear order, or if the set is already ordered, a rearrangement of its elements. Order matters."));
    facts.add(new Fact("Partial permutation", "The number of arrangements of r items from n objects is consider a partial permutation. It is written as nPr (which reads \"n permute r\"), and is equal to the number n·(n-1)···(n-r+1)  (also written as n!/((n-r)!). For example, 10 cars are racing and we need to calculate all the possible top 5's. This can be expressed as 10P5 and calculated with 10!/((10-5)!) = 10!/5! = 10·9·8·7·6."));


    learningLevel = new LevelDescription();
    learningLevel.levelNo = levelNo++;
    learningLevel.setGameBase(16, 16, 40, 1);
    learningLevel.setItemCounts(3, 2, 4);
    learningLevel.startingReveals = 1;
    levels.add(learningLevel);

    lesson = new Lesson("Combinatorics basics", facts, questions, learningLevel);
    lessons.add(lesson);
    // Lesson " Probability basics " and its level: 
    questions = new ArrayList();
    questions.add(new Question("What is the likelihood of tossing a coin and getting tails each time?", new String[]{"0.0625", "0.25", "0.75", "0.125"}, "0.125"));
    questions.add(new Question("What is the probability of rolling an even number with a six-sided dice?", new String[]{"0.25", "0.166", "0.33", "0.5"}, "0.5"));
    questions.add(new Question("There is a class of 18 students: 10 girls, 8 boys. A class representative is being selected. What is the probability that a girl will be elected?", new String[]{"1", "0.44", "0.5", "0.55"}, "0.55"));
    questions.add(new Question("Which one is NOT an event?", new String[]{"Tom scored 10 from the test.", "Julia received 7 flowers.", "Scott won the game.", "Rolling 6 is good."}, "Rolling 6 is good."));
    questions.add(new Question("Which pair of events are mutually exclusive?", new String[]{"Rolling a dice to get 2 and an even number.", "Scoring 7 from a maths test and 10 from history.", "Tossing a coin to get a tail and a head."}, "Tossing a coin to get a tail and a head."));
    questions.add(new Question("What is the probability of rolling a dice once and getting less than 3?", new String[]{"0.5", "0.66", "0.16", "0.33"}, "0.33"));
    questions.add(new Question("There is a standard deck of 52 cards. One card is drawn. How many outcomes satisfy the event \"Hearts will be drawn\"?", new String[]{"26", "4", "13"}, "13"));

    facts = new ArrayList();
    facts.add(new Fact("Event", "An occurrance that might happen if certain conditions are satisfied."));
    facts.add(new Fact("Probability", "A numerical expression that shows how likely it is for an event to occur. To calculate the probability one needs to calculate the amount of all possible outcomes and of those that satisfy the conditions of the event. To calculate the probability divide desirable outcomes by all possible outcomes. For example, a coin toss has two outcomes: heads or tails. If an event is getting tails, then the probability is 1 divided by 2, which is equal to 0.5."));
    facts.add(new Fact("Independent events", "A pair of events (or a bigger collection), where each one is not affected by the other. For example, a coin toss is not dependent from earlier tosses."));
    facts.add(new Fact("Dependent events", "A collection of events (also called \"Conditional\"), where an event is affected by other events. For example, when taking cards from a deck, the second and further draws depend on what cards were taken previously. As there are 52 cards, the probability of drawing a King is 4 out of 52 for the first draw. If the first card was not a king, the second draw is more likely with a 4 out of 51 chance. If it was a king, the second draw's chance is reduced to 3 out of 51. Note that if you return the card to the deck, the chances do not change and the events become independent."));
    facts.add(new Fact("Mutually exclusive events", "A collection of events that cannot happen at the same time. Examples of such events are: two students becoming the student president, passing and failing the test, drawing a card that is a king and an ace, turning left and right."));


    learningLevel = new LevelDescription();
    learningLevel.levelNo = levelNo++;
    learningLevel.setGameBase(16, 16, 40, 1);
    learningLevel.setItemCounts(3, 3, 4);
    learningLevel.startingReveals = 1;
    levels.add(learningLevel);

    lesson = new Lesson("Probability basics", facts, questions, learningLevel);
    lessons.add(lesson);

    // Test for the topic: Statistics  
    questions = new ArrayList();
    questions.add(new Question("A canteen requires 112 kgs of wheat for one week. How many kgs of wheat will it require for 69 days?", new String[]{"1203 kgs", "1401 kgs", "1014 kgs", "1104 kgs"}, "1104 kgs"));
    questions.add(new Question("If an amount of Rs 41,910 is distributed equally amongst 22 persons, how much amount would each person get?", new String[]{"2000", "745", "765", "1905"}, "1905"));
    questions.add(new Question("How many pieces of 8.6 metres length cloth can be cut out of a length of 455.8 metres cloth?", new String[]{"43", "48", "55", "53"}, "53"));
    questions.add(new Question("If an amount of Rs 15,487 is divided equally among 76 students, approximately how much amount will each student get?", new String[]{"206", "210", "218", "204"}, "204"));
    questions.add(new Question("There are 12 dozen mangoes in a box. If there are 43 such boxes, how many mangoes are there in all the boxes together?", new String[]{"516", "3096", "628", "6192"}, "6192"));
    questions.add(new Question("A canteen requires 13 dozen bananas per day. How many bananas will it require for 9 weeks?", new String[]{"1404", "9882", "728", "9828"}, "9828"));
    questions.add(new Question("The cost of 3 chairs and 10 tables is Rs 9856. What is the cost of 6 chairs and 20 tables?", new String[]{"17227", "18712", "19172", "19712"}, "19712"));
    questions.add(new Question("A, B, C, D and E are five consecutive odd numbers The sum of A and C is 146. What is the value of E?", new String[]{"73", "81", "71", "79"}, "79"));
    questions.add(new Question("The product of two consecutive even numbers is 582168. Which is the smaller number?", new String[]{"760", "764", "766", "762"}, "762"));
    questions.add(new Question("The sum of the squares of two consecutive even numbers is 6500. Which is the smaller number?", new String[]{"54", "52", "48", "56"}, "56"));
    questions.add(new Question("The product of two consecutive odd numbers is 19043. Which is the smaller number?", new String[]{"131", "133", "123", "137"}, "137"));
    questions.add(new Question("The product of two successive numbers is 8556. What is the smaller number?", new String[]{"89", "94", "90", "92"}, "92"));
    questions.add(new Question("The product of two consecutive even numbers is 4488. Which is the smaller number?", new String[]{"62", "71", "65", "66"}, "66"));
    questions.add(new Question("The sum of three consecutive integers is 39. Which of the following is the largest among the three?", new String[]{"12", "13", "15", "14"}, "14"));
    questions.add(new Question("The sum of three consecutive integers is 165. Which of the following is the largest among the three?", new String[]{"58", "57", "59", "56"}, "56"));
    questions.add(new Question("The product of two consecutive even numbers is 16128. Which is the larger number?", new String[]{"132", "124", "126", "128"}, "128"));
    questions.add(new Question("The sum of a set of  five consecutive even numbers is 140. What is the sum of the next set of five consecutive even numbers?", new String[]{"180", "200", "160", "190"}, "190"));
    questions.add(new Question("The product of two consecutive odd numbers is 1763. What is the larger number?", new String[]{"39", "41", "37", "43"}, "43"));
    questions.add(new Question("The product of two consecutive even numbers is 5328. What is the smaller number?", new String[]{"70", "68", "74", "72"}, "72"));
    questions.add(new Question("The average of four consecutive even numbers is 27. What is the highest number?", new String[]{"32", "28", "34", "30"}, "30"));
    questions.add(new Question("If the difference between a number and two fifths of the number is 30, find the number.", new String[]{"75", "57", "60", "50"}, "50"));
    questions.add(new Question("The difference between a number and one fifth of it is 84. What is the number?", new String[]{"95", "100", "108", "105"}, "105"));
    questions.add(new Question("The sum of five consecutive even numbers of set A is 280. What is the sum of a different set B of five consecutive numbers whose lowest number is 71 less than double the lowest number of set A?", new String[]{"182", "165", "172", "175"}, "175"));


    testLevel = new LevelDescription();
    testLevel.levelNo = levelNo++;
    testLevel.setGameBase(9, 9, 25, 4);
    testLevel.setItemCounts(1, 0, 10);
    testLevel.startingReveals = 0;
    levels.add(testLevel);

    topic = new Topic("Statistics", lessons, questions, testLevel);
    topics.add(topic);


    // Initialize application state: 
    appState = new ApplicationState(topics, levels);
  }

}
