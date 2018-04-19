package coursework.game;

import javax.swing.*;

public class GameGui {
    private JTextField answer;
    private JPanel panel1;
    private JLabel question;

    public GameGui(){

    }

    public static void main(String[] args) {
        GameGui gameGui = new GameGui();
        JFrame frame = new JFrame("GameGui");
        frame.setContentPane(gameGui.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        gameGui.question.setText("abc");
        frame.setVisible(true);
        int i = 0;
        while (true) {
            gameGui.question.setText("abc" + i);
            i = i + 1;
        }
    }
}
