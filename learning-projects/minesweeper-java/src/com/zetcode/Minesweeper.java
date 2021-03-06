package com.zetcode;

import common.data.ApplicationState;
import common.data.GameConstants;
import common.data.LevelDescription;
import common.edu.Fact;
import common.edu.Lesson;
import common.edu.Question;
import common.edu.Topic;
import common.ui.Board;
import common.ui.LearningPortfolio;
import common.ui.LevelSelection;
import common.ui.editor.TopicEditor;
import common.util.GameWindowListener;
import common.util.ImageScaler;
import common.util.JSONPort;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

import static common.data.GameConstants.*;

// Application root container. Contains Minesweeper board.
public class Minesweeper extends JFrame implements ActionListener {

    // Application state:
    ApplicationState appState;
    final String saveFileName = "minesweeper-save.ser";
    private String rootPath;

    // Autosave:
    final int AUTO_SAVE_PERIOD = 60;

    // Menu parameters:
    final int N_BUTTONS = 4;
    final int BUTTON_WIDTH = 140;
    final int BUTTON_HEIGHT = 40;
    final int BUTTON_SPACING = 30;
    final int TOP_PADDING = 50;
    final int BOTTOM_PADDING = 50;
    final int MENU_WIDTH = 400;
    final int MENU_HEIGHT = TOP_PADDING + BOTTOM_PADDING + (BUTTON_SPACING + BUTTON_HEIGHT) * N_BUTTONS;

    Board minesweeperBoard;
    JPanel menu, game;

    public Minesweeper() {
        //System.out.println("Getting the flag image...");
        //ImageIcon img = new ImageIcon(ImageScaler.getImageResource("flag.png"));
        //System.out.println("Flag image size: " + img.getIconWidth() + "x" + img.getIconHeight());
        // Test getting topic from google drive:
        //Topic topic = JSONPort.getTopicFromGDrive("https://drive.google.com/file/d/1-89IlS7pse71Ffxsp5CR4lobH5-7D55Y/view?usp=sharing");

        setupPaths();
        setupAppState();
        addWindowListener(new GameWindowListener(appState, rootPath + saveFileName));
        showMenu();
    }

    public void setupAppState() {
        appState = ApplicationState.deserializeAppState(rootPath + saveFileName);
        if (appState == null) setupDefaultGameSettings();
        // Give JSONPort a reference to appState for default folder paths:
        JSONPort.setApplicationState(appState);
    }

    // To deprecate:
    public void setupPaths() {
        File sourceLocation = new File(Minesweeper.class.getProtectionDomain().getCodeSource().getLocation().getPath());
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
        if (menu == null) createMenu();
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
        addButton(PLAY, "Play in learning mode", menu);
        addButton(EDIT, "Create and edit topics, lessons, levels", menu);
        addButton(GameConstants.LESSONS, "View found lessons", menu);
        addButton(GameConstants.EXIT, "Close application", menu);
        menu.add(Box.createRigidArea(new Dimension(0, BOTTOM_PADDING)));
    }

    private void showGame(LevelDescription level) {
        createGame(level);
        //else minesweeperBoard.newGame(true, true);
        setContentPane(game);
        setResizable(false);
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
        } catch (NumberFormatException ignored) {}

        // Manage menu and navigation buttons:
        switch (e.getActionCommand()) {
            case PLAY:
                showLevelSelection();
                break;
            case TEST:
                JOptionPane.showMessageDialog(this, "This will turn on the 'test' game mode.");
                break;
            case EDIT:
                showTopicEditor();
                break;
            case LESSONS:
                showLearningPortfolio();
                break;
            case DOWNLOAD_TOPIC:
                downloadTopic();
                showLevelSelection(); // Update levels list.
                break;
            case EXIT:
                System.out.println("Application exiting");
                ApplicationState.serializeAppState(appState, rootPath + saveFileName);
                System.exit(0);
                break;
            case MENU:
                showMenu();
                break;
        }
    }

    public void downloadTopic() {
        String url = JOptionPane.showInputDialog(this, "Enter the download link:");
        if (url != null && !url.equals("")) {
            Topic topic = JSONPort.getTopicFromGDrive(url);
            appState.topics.add(topic);
            topic.lessons.forEach(lesson -> appState.levels.add(lesson.learningLevel));
            appState.levels.add(topic.testLevel);
            JOptionPane.showMessageDialog(this, "Topic downloaded successfully!");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new Minesweeper();
            ex.setVisible(true);
        });
    }

    public void setupDefaultGameSettings() {
        LevelDescription learningLevel;
        LevelDescription testLevel;
        Lesson lesson;
        Topic topic;
        ArrayList<Lesson> lessons;
        ArrayList<Question> questions;
        ArrayList<Fact> facts;
        ArrayList<LevelDescription> levels;
        ArrayList<Topic> topics = new ArrayList<>();
        levels = new ArrayList<>();

        System.out.println("Loading default game configuration.");

        int levelNo = 0;
        // Setup education part:
        lessons = new ArrayList<>();
        questions = new ArrayList<>();
        questions.add(new Question(
                "1. Is it okay to sweep mines?",
                new String[]{"Yes", "No", "I'm just borrowing them"},
                "Yes"
        ));
        questions.add(new Question(
                "Question?",
                new String[]{"1", "2", "3"},
                "1"
        ));

        facts = new ArrayList<>();
        facts.add(new Fact("Math 1: average",
                "Arithmetic average (mean) is the sum of each number in a collection, divided by the size of the collection."
                        + " For example, the average of 4 and 6 is 10 divided by 2, which equals 5."));
        facts.add(new Fact("Math 1: median", "The median is the middle value in the list of numbers." +
                " To find the median, your numbers have to be listed in numerical order from smallest to largest, " +
                "so you may have to rewrite your list before you can find the median."));
        for (int i = 2; i < 5; i++) facts.add(new Fact("Lesson " + i, "A Placeholder lesson, not informative"));


        // Set up learning levels:
        learningLevel = new LevelDescription();
        learningLevel.levelNo = levelNo++;
        learningLevel.setGameBase(8, 8, 5, 2);
        learningLevel.setItemCounts(1, 3, 4);
        learningLevel.startingReveals = 1;
        lesson = new Lesson("Statistics basics", facts, questions, learningLevel);
        lessons.add(lesson);
        levels.add(learningLevel);


        questions = new ArrayList<>();
        questions.add(new Question(
                "2. Is it okay to sweep mines?",
                new String[]{"Yes", "No", "I'm just borrowing them"},
                "Yes"
        ));
        questions.add(new Question(
                "Question?",
                new String[]{"1", "2", "3"},
                "1"
        ));

        learningLevel = new LevelDescription();
        learningLevel.levelNo = levelNo++;
        learningLevel.setGameBase(9, 9, 3, 2);
        learningLevel.setItemCounts(1, 3, 4);
        learningLevel.startingReveals = 1;
        facts = new ArrayList<>();
        facts.add(new Fact("Tables", "Visualising data in tables..."));
        facts.add(new Fact("Bar diagrams", "Represent data in rows or columns of comparable sizes."));
        facts.add(new Fact("Pie charts", "Represent data in to highlight distribution and proportions."));
        lesson = new Lesson("Visualising data", facts, questions, learningLevel);
        lessons.add(lesson);
        levels.add(learningLevel);


        questions = new ArrayList<>();
        questions.add(new Question(
                "3. Is it okay to sweep mines?",
                new String[]{"Yes", "No", "I'm just borrowing them"},
                "Yes"
        ));
        questions.add(new Question(
                "Question?",
                new String[]{"1", "2", "3"},
                "1"
        ));

        learningLevel = new LevelDescription();
        learningLevel.levelNo = levelNo++;
        learningLevel.setGameBase(10, 10, 10, 2);
        learningLevel.setItemCounts(1, 3, 4);
        learningLevel.startingReveals = 1;
        facts = new ArrayList<>();
        facts.add(new Fact("Combination", "nCm = ..."));
        facts.add(new Fact("Permutation", "nAm = ..."));
        lesson = new Lesson("Combinations and permutations", facts, questions, learningLevel);
        lessons.add(lesson);
        levels.add(learningLevel);

        questions = new ArrayList<>();
        questions.add(new Question(
                "4. Is it okay to sweep mines?",
                new String[]{"Yes", "No", "I'm just borrowing them"},
                "Yes"
        ));
        questions.add(new Question(
                "Question?",
                new String[]{"1", "2", "3"},
                "1"
        ));

        learningLevel = new LevelDescription();
        learningLevel.levelNo = levelNo++;
        learningLevel.setGameBase(11, 11, 5, 2);
        learningLevel.setItemCounts(1, 3, 4);
        learningLevel.startingReveals = 1;
        facts = new ArrayList<>();
        facts.add(new Fact("Events", "Event is ..."));
        facts.add(new Fact("Likelihood", "A numerical expression that shows how likely it is for an event to occur."));
        lesson = new Lesson("Probability basics", facts, questions, learningLevel);
        lessons.add(lesson);

        levels.add(learningLevel);


        // Setup test:
        testLevel = new LevelDescription();
        testLevel.levelNo = levelNo++;
        testLevel.setGameBase(8, 8, 10, 6);
        testLevel.setItemCounts(1, 0, 4);
        testLevel.startingReveals = 1;
        levels.add(testLevel);

        // Setup topic:
        topic = new Topic("Statistics", new ArrayList<Lesson>(lessons), new ArrayList<Question>(), testLevel);
        topics.add(topic);


        // Initialize application state:
        appState = new ApplicationState(topics, levels);
    }
}
