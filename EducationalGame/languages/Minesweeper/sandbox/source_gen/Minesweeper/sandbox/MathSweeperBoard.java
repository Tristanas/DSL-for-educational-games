package Minesweeper.sandbox;

/*Generated by MPS */

import javax.swing.JPanel;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JFrame;
import com.edu.Lesson;
import java.awt.Dimension;
import com.edu.ImageScaler;
import javax.swing.ImageIcon;
import java.util.Random;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import java.awt.Point;

public class MathSweeperBoard extends JPanel {
  private final int NUM_IMAGES = 13;
  private final int NUM_EFFECTS = 3;
  public final int CELL_SIZE = 30;
  public final int IMAGE_SIZE = 15;

  private final int COVER_FOR_CELL = 10;
  private final int MARK_FOR_CELL = 10;
  private final int EMPTY_CELL = 0;
  private final int MINE_CELL = 9;
  private final int COVERED_MINE_CELL = MINE_CELL + COVER_FOR_CELL;
  private final int MARKED_MINE_CELL = COVERED_MINE_CELL + MARK_FOR_CELL;
  private final int CERTAIN_MINE_MARK = MARKED_MINE_CELL + MARK_FOR_CELL;

  private final int DRAW_MINE = 9;
  private final int DRAW_COVER = 10;
  private final int DRAW_MARK = 11;
  private final int DRAW_WRONG_MARK = 12;
  private final int DRAW_CERTAIN_MARK = 13;

  private final int NO_EFFECT_CELL = 0;
  private final int LESSON_CELL = 1;
  private final int HP_CELL = 2;
  private final int REVEAL_CELL = 3;

  private static final int CELL_UNCOVER_POINTS = 10;
  private static final int CORRECT_ANSWER_POINTS = 50;

  private final int N_MINES = 8;
  private final int N_LESSONS = 3;
  private final int N_EFFECTS = 1;
  private final int N_ROWS = 10;
  private final int N_COLS = 10;

  private final int BOARD_WIDTH = N_COLS * CELL_SIZE + 1;
  private final int BOARD_HEIGHT = N_ROWS * CELL_SIZE + 1;

  private int[] field;
  private Image[] img;

  private int[] effect;
  private Image[] effectImg;

  private boolean inGame;
  private boolean mineExploded;
  private int correctFlags;
  private int uncover;
  private int allCells;
  private boolean revealEnabled;

  private int flagsLeft;
  private int lives;
  private int reveals;
  private int lessonsFound;
  private int score;

  private int clickedMinePosition;
  private int questionsAnswered;
  private final int questionsCount;
  private final ArrayList<MathSweeper.Question> questions;

  private final JFrame parentWindow;
  private final ArrayList<Lesson> lessons;
  private final Dimension lessonWindowSize = new Dimension(350, 250);
  private JFrame lessonWindow;
  public final StatusBar statusbar;

  public MathSweeperBoard(JFrame fFrame, ArrayList<MathSweeper.Question> questions, ArrayList<Lesson> lessons) {
    this.parentWindow = fFrame;
    this.questions = questions;
    this.questionsCount = questions.size();
    this.statusbar = new StatusBar(this);
    this.lessons = lessons;
    initBoard();
  }

  private void initBoard() {
    setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
    img = new Image[NUM_IMAGES];
    effectImg = new Image[NUM_EFFECTS + 1];
    for (int i = 0; i < NUM_IMAGES; i++) {
      String path = "src/resources/" + i + ".png";
      img[i] = ImageScaler.createScaledImage((new ImageIcon(path)).getImage(), CELL_SIZE, CELL_SIZE);
    }
    for (int i = 1; i <= NUM_EFFECTS; i++) {
      String path = "src/resources/S" + i + ".png";
      effectImg[i] = ImageScaler.createScaledImage((new ImageIcon(path)).getImage(), CELL_SIZE, CELL_SIZE);
    }
    addMouseListener(new MinesAdapter());
    newGame(true, true);
    statusbar.???();
  }

  /**
   * Resets game state and counters. New mines added, all cells covered, new effects, lessons.
   */
  public void newGame(boolean addLessons, boolean addEffects) {
    int cell;
    int i;
    Random random = new Random();
    // Reset state and counters: 
    inGame = true;
    mineExploded = false;
    revealEnabled = false;
    questionsAnswered = 0;
    correctFlags = 0;
    flagsLeft = N_MINES;
    lives = 2;
    lessonsFound = 0;
    reveals = 1;
    score = 0;
    allCells = N_ROWS * N_COLS;
    uncover = allCells;
    // Reset effects and fields: 
    effect = new int[allCells];
    field = new int[allCells];
    // converted:  for ( expr; ...) {}  ->  { expr; for ( ; ...) {} } 
    i = 0;
    for (; i < allCells; i++) {
      field[i] = COVER_FOR_CELL;
    }
    // Place mines: 
    i = 0;
    while (i < N_MINES) {
      int position = (int) (allCells * random.nextDouble());
      if ((position < allCells) && (field[position] != COVERED_MINE_CELL)) {
        modifySurroundings(1, true, position);
        field[position] = COVERED_MINE_CELL;
        i++;
      }
    }
    // Place lesson effects: 
    if (addLessons) {
      int lessonsCount = lessons.size();
      if (lessonsCount > N_LESSONS) {
        lessonsCount = N_LESSONS;
      }
      i = 0;
      while (i < lessonsCount) {
        int position = (int) (allCells * random.nextDouble());
        if (position < allCells && field[position] != COVERED_MINE_CELL) {
          effect[position] = LESSON_CELL;
          i++;
        }
      }
    }
    // Place other special effects: 
    if (addEffects) {
      i = 0;
      while (i < N_EFFECTS) {
        int position = (int) (allCells * random.nextDouble());
        int randomEffect = 2 + (int) ((NUM_EFFECTS - 1) * random.nextDouble());
        if (position < allCells && field[position] != COVERED_MINE_CELL && effect[position] == 0) {
          effect[position] = randomEffect;
          i++;
        }
      }
    }
  }

  /**
   * Recursive search to unveil all neighbouring empty cells. Also uncovers non-mine cells.
   * @param j - position of an empty cell.
   */
  private void findEmptyCells(int j) {
    int[] square = initSurroundingsRect(j);
    int currPos;
    for (int row = square[0]; row < square[2]; row++) {
      for (int col = square[1]; col < square[3]; col++) {
        currPos = j + col + row * N_COLS;
        if (currPos >= 0) {
          if (field[currPos] > MINE_CELL) {
            uncoverCell(currPos);
            if (field[currPos] == EMPTY_CELL) {
              findEmptyCells(currPos);
            }
          }
        }
      }
    }
  }

  @Override
  public void paintComponent(Graphics g) {
    for (int i = 0; i < N_ROWS; i++) {
      for (int j = 0; j < N_COLS; j++) {
        int position = (i * N_COLS) + j;
        int cell = field[position];
        // Draw game over board: 
        if (!(inGame)) {
          if (cell == COVERED_MINE_CELL) {
            cell = DRAW_MINE;
          } else
          if (cell == MARKED_MINE_CELL) {
            cell = DRAW_MARK;
          } else
          if (cell == CERTAIN_MINE_MARK) {
            cell = DRAW_CERTAIN_MARK;
          } else
          if (cell > COVERED_MINE_CELL) {
            cell = DRAW_WRONG_MARK;
          } else
          if (cell > MINE_CELL) {
            cell = DRAW_COVER;
          }
        } else {
          if (cell > MARKED_MINE_CELL) {
            // Mine cell marked by a special effect or correctly answered question: 
            cell = DRAW_CERTAIN_MARK;
          } else
          if (cell > COVERED_MINE_CELL) {
            cell = DRAW_MARK;
          } else
          if (cell > MINE_CELL) {
            cell = DRAW_COVER;
          }
        }
        // Draw effects and cells: 
        if (effect[position] != 0 && field[position] < COVER_FOR_CELL) {
          cell = effect[position];
          g.drawImage(effectImg[cell], (j * CELL_SIZE), (i * CELL_SIZE), this);
        } else
        g.drawImage(img[cell], (j * CELL_SIZE), (i * CELL_SIZE), this);
      }
    }
    statusbar.???();
  }

  private class MinesAdapter extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      int cCol = x / CELL_SIZE;
      int cRow = y / CELL_SIZE;
      int cellNo = (cRow * N_COLS) + cCol;
      boolean doRepaint = false;
      boolean clickedOnBoard = (x < N_COLS * CELL_SIZE) && (y < N_ROWS * CELL_SIZE);
      if (clickedOnBoard) {
        // Marking cell with right click: 
        if (e.getButton() == MouseEvent.BUTTON3) {
          if (field[cellNo] > MINE_CELL) {
            doRepaint = true;
            if (field[cellNo] <= COVERED_MINE_CELL) {
              if (flagsLeft > 0) {
                flagCell(cellNo, true);
              }
            } else
            if (field[cellNo] < CERTAIN_MINE_MARK) {
              flagCell(cellNo, false);
            }
          }
          // Uncovering click on left click or middle click: 
        } else {
          // Pressed on a flagged cell: 
          if (field[cellNo] > COVERED_MINE_CELL) {
            return;
          }
          // Clicked on an uncovered cell with an effect: 
          if (field[cellNo] < COVER_FOR_CELL && effect[cellNo] > 0) {
            switch (effect[cellNo]) {
              case LESSON_CELL:
                manageLessonWindow(lessons.get(lessonsFound));
                lessonsFound++;
                break;
              case HP_CELL:
                lives++;
                break;
              case REVEAL_CELL:
                reveals++;
                break;
              default:
            }
            // Remove used-up effect: 
            effect[cellNo] = 0;
            doRepaint = true;
          }
          // Pressed on covered cell 
          if ((field[cellNo] > MINE_CELL) && (field[cellNo] < MARKED_MINE_CELL)) {
            doRepaint = true;
            if (revealEnabled) {
              // Uncovering cell with the "Reveal" effect: 
              revealEnabled = false;
              revealRectangle(cellNo);
            } else {
              // Regular cell uncovering: 
              uncoverCell(cellNo);
              if (field[cellNo] == MINE_CELL) {
                // Showing the mine player clicked on 
                clickedMinePosition = cellNo;
                repaint();
                if (questionsAnswered < questionsCount) {
                  boolean answeredCorrectly = askQuestion(questions.get(questionsAnswered));
                  if (answeredCorrectly) {
                    handleCorrectAnswer();
                  } else
                  handleIncorrectAnswer();
                } else
                lives--;
                if (lives == 0) {
                  inGame = false;
                  mineExploded = true;
                }
              }
            }
            // Clicked on an empty cell: 
            if (field[cellNo] == EMPTY_CELL) {
              findEmptyCells(cellNo);
            }
          }
        }
        System.out.println("Mines left: " + Integer.toString(flagsLeft) + " Flagged correctly: " + Integer.toString(correctFlags) + " Covered: " + Integer.toString(uncover));
        if (doRepaint) {
          repaint();
        }
        // Manage win-loss conditions: 
        // To do: repaint last clicked cell, as currently it is not always updated and immediately a message shows. 
        if (!(inGame) && mineExploded) {
          handleGameOver(false);
        }
        if (isGameWon()) {
          handleGameOver(true);
        }
      }
    }

  }


  /**
   * Adds or removes a flag on the selected cell.
   * @param cellNo the cell to be marked.
   * @param addFlag true adds flag, false removes it.
   */
  public void flagCell(int cellNo, boolean addFlag) {
    int direction = (addFlag ? 1 : -1);
    // ADD : REMOVE 
    field[cellNo] += MARK_FOR_CELL * direction;
    flagsLeft -= direction;
    uncover -= direction;
    if (field[cellNo] == COVERED_MINE_CELL || field[cellNo] == MARKED_MINE_CELL) {
      correctFlags += direction;
    }
  }

  public void uncoverCell(int cellNo) {
    field[cellNo] -= COVER_FOR_CELL;
    uncover--;
    if (field[cellNo] != MINE_CELL) {
      score += MathSweeperBoard.CELL_UNCOVER_POINTS;
    }
  }

  public boolean askQuestion(MathSweeper.Question q) {
    // If player closes question window or clicks cancel, selectedOption becomes null. 
    String selectedOption = (String) JOptionPane.showInputDialog(parentWindow, "You have clicked on a mine. It will explode unless you answer correctly.\n\nQuestion: " + q.question, "Question time", JOptionPane.QUESTION_MESSAGE, null, q.answers, q.correctAnswer);
    // Do not use a custom icon 
    // Possible answers 
    return selectedOption != null && selectedOption.equals(q.correctAnswer);
  }

  private void handleCorrectAnswer() {
    JOptionPane.showMessageDialog(parentWindow, "You have answered the question correctly. The mine is flagged for your convenience.", "Correct answer", JOptionPane.INFORMATION_MESSAGE);
    field[clickedMinePosition] += COVER_FOR_CELL;
    // Add cover 
    flagCell(clickedMinePosition, true);
    // Add flag 
    field[clickedMinePosition] = CERTAIN_MINE_MARK;
    // Fixating the flag since it is known to mark a mine. 
    uncover++;
    // Compensating double cell reveal (on click and on flag) 
    questionsAnswered++;
    score += MathSweeperBoard.CORRECT_ANSWER_POINTS;
  }

  private void handleIncorrectAnswer() {
    lives--;
    statusbar.???();
    // Make sure the status bar updates. 
    JOptionPane.showMessageDialog(parentWindow, "You did not answer the question correctly. \nThe mine exploded.", "Incorrect answer - you lose a life", JOptionPane.ERROR_MESSAGE);
  }

  private void manageLessonWindow(Lesson newLesson) {
    if (lessonWindow == null) {
      lessonWindow = displayFoundLesson(newLesson);
    } else {
      lessonWindow.setContentPane(newLesson.createLessonPanel());
      // lessonWindow.pack(); 
      lessonWindow.setVisible(true);
    }
  }

  private JFrame displayFoundLesson(Lesson lesson) {
    JFrame frame = new JFrame("New lesson found");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.add(lesson.createLessonPanel());
    frame.setSize(lessonWindowSize);
    Point location = parentWindow.getLocation();
    location.translate(-lessonWindowSize.width, 0);
    frame.setLocation(location);
    frame.setVisible(true);
    return frame;
  }

  /**
   * Adds or removes an amount from all the surrounding cells. Respects game board borders.
   * @param amount - how much the surroundings are modified,
   * @param addition - true to add, false to subtract,
   * @param startPos - the position in the field array of a given cell. The middle of the affected rectangle.
   */
  private void modifySurroundings(int amount, boolean addition, int startPos) {
    // Set subtraction: 
    if (!(addition)) {
      amount *= -1;
    }
    // Circle around starting position: 
    int[] square = initSurroundingsRect(startPos);
    for (int row = square[0]; row < square[2]; row++) {
      for (int col = square[1]; col < square[3]; col++) {
        int currPos = startPos + col + row * N_COLS;
        // Modify only if: 
        if (currPos < allCells && currPos >= 0 && currPos != startPos && field[currPos] != COVERED_MINE_CELL) {
          // Cell is in bounds, 
          // Position is not the starting position, 
          // Cell is empty. 
          field[currPos] += amount;
        }
      }
    }
  }

  /**
   * Creates a rectangle within which search or field modification can occur.
   * @return coordinates in respect of the square center: square[0] and [1] -
   * row and col of the top left corner, square[2] and [3] - bottom right corner
   */
  private int[] initSurroundingsRect(int position) {
    int[] square = {-1, -1, 2, 2};
    int col = position % N_COLS;
    int row = position / N_COLS;
    if (row == 0) {
      square[0] = 0;
    }
    if (row == N_ROWS - 1) {
      square[2] = 1;
    }
    if (col == 0) {
      square[1] = 0;
    }
    if (col == N_COLS - 1) {
      square[3] = 1;
    }
    return square;
  }

  private void revealRectangle(int position) {
    int[] square = initSurroundingsRect(position);
    for (int row = square[0]; row < square[2]; row++) {
      for (int col = square[1]; col < square[3]; col++) {
        int currPos = position + col + row * N_COLS;
        safelyReveal(currPos);
      }
    }
  }

  private void safelyReveal(int position) {
    if (field[position] < COVER_FOR_CELL || field[position] == CERTAIN_MINE_MARK) {
      return;
    }
    if (field[position] == COVERED_MINE_CELL) {
      flagCell(position, true);
      field[position] = CERTAIN_MINE_MARK;
    } else
    uncoverCell(position);
    // If an empty cell is revealed, reveal all connected non-mine cells: 
    if (field[position] == EMPTY_CELL) {
      findEmptyCells(position);
    }
  }

  /**
   * Shows a confirmation message, prompting the player to play again or to return to menu.
   * @return true - replay game, false - go to menu.
   */
  private void handleGameOver(boolean won) {
    String title = ((won == true) ? "Game won" : "Game lost");
    // flagsLabel.setText(title); 
    int selection = JOptionPane.showConfirmDialog(this, "Would you like to play again?", title, JOptionPane.YES_NO_OPTION);
    if (selection == JOptionPane.NO_OPTION) {
      ((MathSweeper) parentWindow).showMenu();
    } else {
      newGame(true, true);
      repaint();
    }
  }

  private boolean isGameWon() {
    int incorrectFlags = N_MINES - flagsLeft - correctFlags;
    boolean onlyMinesCovered = (uncover == N_MINES - correctFlags);
    boolean noIncorrectFlags = (incorrectFlags == 0);
    if (onlyMinesCovered && noIncorrectFlags) {
      return true;
    } else
    return false;
    // return onlyMinesCovered && noIncorrectFlags; 
  }

  public void enableReveal() {
    if (reveals > 0 && !(revealEnabled)) {
      reveals--;
      revealEnabled = true;
    }
  }

  public int getFlagsLeft() {
    return flagsLeft;
  }
  public int getLives() {
    return lives;
  }
  public int getReveals() {
    return reveals;
  }
  public int getLessonsFound() {
    return lessonsFound;
  }
  public int getLessonsCount() {
    return lessons.size();
  }
  public int getScore() {
    return score;
  }
  public int getQuestionsCount() {
    return questionsCount;
  }
  public int getQuestionsAnswered() {
    return questionsAnswered;
  }
}
