import javax.swing.*;
import java.awt.*;

public class Ball extends JPanel {
    private int ballSize;
    int ballPosX;
    int ballPosY;


    public Ball() {
        this.setFocusable(true);
        this.setPreferredSize(new Dimension(20,20));
        repaint();
    }


@Override
    public void paint (Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(238, 240, 242));
        g.fillOval(0,0,getWidth(),getHeight());
    }


}
