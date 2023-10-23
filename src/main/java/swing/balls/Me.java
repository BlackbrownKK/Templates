package swing.balls;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

public class Me  extends JComponent implements Moving {

    @Setter
    @Getter
    private int x = 100;
    @Setter
    @Getter
    private int y = 100;

    @Getter
    private int xSpeed = 5;
    @Getter
    private int ySpeed = 5;
    private final int length = 20;

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x,y,length,length);
    }
    public void move() {
        x += xSpeed;
        y += ySpeed;
    }

    public int getLeftX(){
        return x;
    }

    public int getRightX(){
        return x+length;
    }
    public int getLeftY(){
        return y;
    }
    public int getRightY(){
        return y+length;
    }
    public void setXSpeed(int speed) {
        xSpeed = speed;
    }

    public void setYSpeed(int speed) {
        ySpeed = speed;
    }
}
