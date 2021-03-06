package common.data;

import java.awt.*;

/**
 Constants for button text and action strings, minesweeper cell state and drawing logic.
 */
public class GameConstants {
    // Button text and action strings:
    public static final String MENU = "Menu";
    public static final String PLAY = "Play";
    public static final String TEST = "Take test";
    public static final String EDIT = "Edit";
    public static final String LESSONS = "Check lessons";
    public static final String EXIT = "Exit";
    public static final String REVEAL = "Reveal";
    public static final String DOWNLOAD_TOPIC = "DownloadTopic";

    // Action strings for editing:
    public static final String UPDATE = "Update";
    public static final String REFRESH = "Refresh";
    public static final String EDIT_LESSON = "EditLesson";
    public static final String SAVE_LESSON = "SaveLesson";
    public static final String UPDATE_UI = "UpdateUI";

    // Images/cell type counts:
    public static final int NUM_IMAGES = 14;
    public static final int NUM_EFFECTS = 3;  // implemented effects.

    // Minesweeper state:
    public static final int COVER_FOR_CELL = 10;
    public static final int MARK_FOR_CELL = 10;
    public static final int EMPTY_CELL = 0;
    public static final int MINE_CELL = 9;
    public static final int COVERED_MINE_CELL = MINE_CELL + COVER_FOR_CELL;
    public static final int MARKED_MINE_CELL = COVERED_MINE_CELL + MARK_FOR_CELL;
    public static final int CERTAIN_MINE_MARK = MARKED_MINE_CELL + MARK_FOR_CELL;

    // Drawing cells: (images naming is "x.png", where x stands for number of nearby mines or one of below constants)
    public static final int DRAW_MINE = 9;
    public static final int DRAW_COVER = 10;
    public static final int DRAW_MARK = 11;
    public static final int DRAW_WRONG_MARK = 12;
    public static final int DRAW_CERTAIN_MARK = 13;

    /**
     * UI:
     */
    // Learning portfolio:
    public static final int LESSON_TOP_PADDING = 20;
    public static final int LESSON_BOT_PADDING = 20;
    public static final int TOPIC_FONT_SIZE = 18;
    public static final Dimension LEARNING_PORTFOLIO_SIZE = new Dimension(500,600);

    public static final String NEXT_TOPIC = "Next topic";
    public static final String PREVIOUS_TOPIC = "Previous topic";

    /**
     * TOPIC AND LESSON EDITOR LAYOUT:
     */
    // Question:
    public static final int QUESTION_WIDTH = 300;
    public static final int QUESTION_HEIGHT = 250;

    // Section layout:
    public static final int SECTION_HEIGHT = 500;
    public static final int SECTION_PADDING = 10;
    public static final int SECTION_FONT_SIZE = 24;
    public static Font SECTION_FONT = new Font(Font.SANS_SERIF, Font.PLAIN, SECTION_FONT_SIZE);

    // Specific sections:
    public static final int LEVEL_EDITOR_WIDTH = 250;
    public static final int LESSON_LIST_WIDTH = 250;
    public static final int FACT_LIST_WIDTH = 350;
    public static final int QUESTION_LIST_WIDTH = QUESTION_WIDTH + 50;

    // Editor title and navigation sections:
    public static final int NAV_BAR_HEIGHT = 50;
    public static final int TITLE_BAR_HEIGHT = 40;
    public static final int TITLE_FONT_SIZE = 32;

    // Top level UI:
    public static final Font EDITOR_TITLE_FONT = new Font(Font.SANS_SERIF, Font.BOLD, TITLE_FONT_SIZE);
    public static final int TOPIC_EDITOR_HEIGHT = SECTION_HEIGHT + TITLE_BAR_HEIGHT + NAV_BAR_HEIGHT;
    public static final int TOPIC_EDITOR_WIDTH = QUESTION_LIST_WIDTH + LEVEL_EDITOR_WIDTH + LESSON_LIST_WIDTH + SECTION_PADDING * 4;
    public static Dimension TOPIC_EDITOR_SIZE = new Dimension(TOPIC_EDITOR_WIDTH, TOPIC_EDITOR_HEIGHT);

    public static final int LESSON_EDITOR_HEIGHT = SECTION_HEIGHT + TITLE_BAR_HEIGHT + NAV_BAR_HEIGHT;
    public static final int LESSON_EDITOR_WIDTH = QUESTION_LIST_WIDTH + LEVEL_EDITOR_WIDTH + FACT_LIST_WIDTH + SECTION_PADDING * 4;
    public static Dimension LESSON_EDITOR_SIZE = new Dimension(LESSON_EDITOR_WIDTH, LESSON_EDITOR_HEIGHT);

//    public enum Draw {
//        Empty, One, Two, Three, Four, Five, Six, Seven, Eight, Mine, Cover
//    }

    // Special effects: (related images are named "Sx.png", where x is equal to below constants)
    public static final int NO_EFFECT_CELL = 0;   // In case of this effect, cell is drawn according to constants above.
    public static final int FACT_CELL = 1;
    public static final int HP_CELL = 2;
    public static final int REVEAL_CELL = 3;
}
