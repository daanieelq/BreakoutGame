import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    MovementPlayer movementPlayer;
    Ball ball;
    JPanel panel;

    final int windowHeight = 700;
    final int windowWidth = 500;

    public Window() {
        this.setTitle("Breakout");
        this.setSize(windowWidth,windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(20,20,20));


        panel = new JPanel();
        panel.setBackground(new Color(20, 20, 20));
        this.add(panel);


        movementPlayer = new MovementPlayer();
        panel.add(movementPlayer);
        movementPlayer.setBounds(20, 20, windowWidth, 20);

        ball = new Ball();
        panel.add(ball);

        ball.setBounds(50,50, 200,200);

        movementPlayer.requestFocusInWindow();
        ball.requestFocusInWindow();

        this.setVisible(true);
    }
}
