package Minesweeper.sandbox;

/*Generated by MPS */

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import common.Lesson;
import javax.swing.JPanel;
import java.io.File;
import common.ImageScaler;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.Box;
import common.GameConstants;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import common.LearningPortfolio;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import javax.swing.ImageIcon;

public class MathSweeper extends JFrame implements ActionListener {
  public ArrayList<Question> questions;
  public ArrayList<Lesson> lessons;
  private JPanel menu;
  private JPanel game;
  private final int N_BUTTONS = 4;
  private final int BUTTON_WIDTH = 140;
  private final int BUTTON_HEIGHT = 40;
  private final int BUTTON_SPACING = 30;
  private final int TOP_PADDING = 50;
  private final int BOTTOM_PADDING = 50;
  private final int MENU_WIDTH = 400;
  private final int MENU_HEIGHT = TOP_PADDING + BOTTOM_PADDING + (BUTTON_SPACING + BUTTON_HEIGHT) * N_BUTTONS;
  public final String PLAY = "Play";
  public final String TEST = "Take test";
  public final String LESSONS = "Check lessons";
  public final String EXIT = "Exit";
  public final String MENU = "Menu";
  private MathSweeperBoard minesweeperBoard;

  public MathSweeper() {
    questions = new ArrayList();
    questions.add(new Question("Am I a question?", new String[]{"False", "True"}, "True"));
    questions.add(new Question("How many countries will be in the world in 10 years?", new String[]{"2", "255", "190", "1", "Nobody can know for sure."}, "Nobody can know for sure."));

    lessons = new ArrayList();
    lessons.add(new Lesson("Math 1: average", "Arithmetic average (mean) is the sum of each number in a collection, divided by the size of the collection. For example, the average of 4 and 6 is 10 divided by 2, which equals 5."));
    lessons.add(new Lesson("Math 1: median", "The median is the middle value in the list of numbers. To find the median, your numbers have to be listed in numerical order from smallest to largest, so you may have to rewrite your list before you can find the median."));
    for (int i = 2; i < 8; i++) {
      lessons.add(new Lesson("Lesson " + i, "A Placeholder lesson, not informative"));
    }

    File sourceLocation = new File(ImageScaler.class.getProtectionDomain().getCodeSource().getLocation().getPath());
    String path1 = sourceLocation + "/resources/" + 1 + ".png";
    String path2 = sourceLocation.getParent() + "/resources/" + 1 + ".png";
    System.out.println(" Path1: " + path1 + "\n Path 2: " + path2);

    sourceLocation = new File(ImageScaler.class.getProtectionDomain().getCodeSource().getLocation().getPath());
    String path3 = sourceLocation + "/resources/" + 1 + ".png";
    String path4 = sourceLocation.getParent() + "/resources/" + 1 + ".png";
    System.out.println(" Path3: " + path3 + "\n Path 4: " + path4);

    setupResourcesPath();
    showMenu();
  }

  public void showMenu() {
    if (menu == null) {
      createMenu();
    }
    setContentPane(menu);
    setResizable(false);
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
    addButton(GameConstants.TEST, "Play an evaluation game", menu);
    addButton(GameConstants.LESSONS, "View found lessons", menu);
    addButton(GameConstants.EXIT, "Close application", menu);
    menu.add(Box.createRigidArea(new Dimension(0, BOTTOM_PADDING)));
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

  private void showGame() {
    if (game == null) {
      createGame();
    } else
    minesweeperBoard.newGame(true, true);
    setContentPane(game);
    setResizable(false);
    pack();
    setTitle("Minesweeper");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  private void createGame() {
    game = new JPanel();
    game.setLayout(new BorderLayout());
    minesweeperBoard = new MathSweeperBoard(this, questions, lessons);
    game.add(minesweeperBoard);
    game.add(minesweeperBoard.statusbar, BorderLayout.SOUTH);
  }

  private void showLearningPortfolio() {
    LearningPortfolio portfolio = new LearningPortfolio(lessons, this);
    setTitle("Learning Portfolio");
    setContentPane(portfolio);
    pack();
  }

  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
      case PLAY:
        showGame();
        break;
      case TEST:
        JOptionPane.showMessageDialog(this, "This will turn on the 'test' game mode.");
        break;
      case LESSONS:
        showLearningPortfolio();
        break;
      case EXIT:
        System.out.println("Application exiting");
        System.exit(0);
        break;
      case MENU:
        showMenu();
        break;
      default:
    }
    if ("play".equals(e.getActionCommand())) {
      showGame();
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

  public void setupResourcesPath() {
    File sourceLocation = new File(MathSweeper.class.getProtectionDomain().getCodeSource().getLocation().getPath());
    ImageIcon img;
    String imageName = "0.png";
    // Path for the IntelliJ minesweeper project's resources folder: 
    String path = sourceLocation + "/resources/";
    img = new ImageIcon(path + imageName);
    // If the load fails, look for resources in parent folder: 
    if (img.getIconHeight() == -1 || img.getIconWidth() == -1) {
      path = sourceLocation.getParent() + "/resources/";
    }

    ImageScaler.ResourcesPath = path;
  }


  public class Question {
    public String correctAnswer;
    public String[] answers;
    public String question;
    public Question(String question, String[] answers, String correctAnswer) {
      this.question = question;
      this.answers = answers;
      this.correctAnswer = correctAnswer;
    }
  }

}
