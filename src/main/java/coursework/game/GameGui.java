package coursework.game;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class GameGui {
    private JTextField answer;
    private JPanel panel1;
    private JLabel question;

    public GameGui(){

        answer.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();

                if (key == KeyEvent.VK_ENTER) {
                    question.setText(answer.getText());
                }

            }
        });
    }

    public static void main(String[] args) {
        GameGui gameGui = new GameGui();
        JFrame frame = new JFrame("GameGui");
        frame.setContentPane(gameGui.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }



}
