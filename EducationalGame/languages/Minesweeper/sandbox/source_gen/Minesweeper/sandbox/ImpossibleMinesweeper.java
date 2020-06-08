package Minesweeper.sandbox;

/*Generated by MPS */

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.EventQueue;

public class ImpossibleMinesweeper extends JFrame {
  private JLabel statusbar;
  public ArrayList<Question> questions;

  public ImpossibleMinesweeper() {
    questions = new ArrayList();
    questions.add(new Question("Is it okay to sweep mines?", new String[]{"Yes", "No", "I'm just borrowing them"}, "Yes"));
    questions.add(new Question("Question?", new String[]{"1", "2", "3"}, "1"));
    initUI();
  }

  private void initUI() {
    statusbar = new JLabel("");
    add(statusbar, BorderLayout.SOUTH);

    add(new ImpossibleMinesweeperBoard(statusbar, this, questions));

    setResizable(false);
    pack();

    setTitle("ImpossibleMinesweeper");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        ImpossibleMinesweeper ex = new ImpossibleMinesweeper();
        ex.setVisible(true);
      }
    });
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
