package coursework.game;

import javax.swing.*;

public class GameGui {
    private JTextField textField1;
    private JPanel panel1;
    private JLabel questiondisplay;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GameGui");
        frame.setContentPane(new GameGui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
