import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MovementPlayer extends JPanel implements KeyListener {
    Timer movementTimer;

    final int playerWidth = 110;
    final int playerHeight = 20;
    final int playerPosY = 600;
    int playerPosX = (500 - playerWidth) / 2;

    boolean movingLeft = false;
    boolean movingRight = false;


    public MovementPlayer() {
        this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocusInWindow();

        movementTimer = new Timer(20, e -> {
            if(movingLeft && playerPosX > 00) {
                playerPosX -= 5;
            }
            if(movingRight && playerPosX + playerWidth < getWidth()) {
                playerPosX += 5;
            }
            repaint();
        });
        movementTimer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;


        g2D.setColor(new Color(20, 20, 20));
        g2D.fillRect(0, 0, getWidth(), getHeight());

        g2D.setColor(new Color(238,198,67));
        g2D.fillRect(playerPosX, playerPosY, playerWidth, playerHeight);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
            movingRight = true;
            System.out.println("Works");
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
            movingLeft = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
            movingRight = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
            movingLeft = false;
        }
    }
}
