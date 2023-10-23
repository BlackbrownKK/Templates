package swing.balls;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ball extends JComponent implements Moving {
    @Setter
    @Getter
    private int x = 25;
    @Setter
    @Getter
    private int y = 25;
    int diameter = 25; // The diameter of the circle
    @Getter
    private int xSpeed = 1;
    @Getter
    private int ySpeed = 1;

    private Random random = new Random();


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, diameter, diameter);
    }


    public void move() {
        x += xSpeed;
        y += ySpeed;
    }

    public int getLeftX(){
        return x;
    }

    public int getRightX(){
        return x+diameter;
    }
    public int getLeftY(){
        return y;
    }
    public int getRightY(){
        return y+diameter;
    }
    public void setXSpeed(int speed) {
        xSpeed = speed;
    }

    public void setYSpeed(int speed) {
        ySpeed = speed;
    }
}
