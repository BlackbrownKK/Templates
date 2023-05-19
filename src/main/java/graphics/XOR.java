package graphics;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
Продемонстрировать применение режима рисования с объединением содержимого по исключающему ИЛИ
 */
public class XOR extends Frame {
    int chsX = 100, chsY = 100;

    public XOR() {
        addMouseListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent me) {
                int х = me.getX();
                int у = me.getY();
                chsX = х - 10;
                chsY = у - 10;
                repaint();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    private void addMouseListener(MouseMotionAdapter mouseMotionAdapter) {

    }

    // продемонстрировать рисование графики в режиме  ее объединения по исключающему ИЛИ
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(20, 40, 60, 70);
        g.setColor(Color.blue);
        g.fillRect(110, 40, 60, 70);
        g.setColor(Color.black);
        g.fillRect(200, 40, 60, 70);
        g.setColor(Color.red);
        g.fillRect(60, 120, 160, 110);
        // объеди нить черточки перекрестья по исключающему ИЛИ
        g.setXORMode(Color.black);
        g.drawLine(chsX - 10, chsY, chsX + 10, chsY);
        g.drawLine(chsX, chsY - 10, chsX, chsY + 10);
        g.setPaintMode();


    }

    public static void main(String[] args) {
        XOR appwin = new XOR();
        appwin.setSize(new Dimension(300, 260));
        appwin.setTitle("XOR Demo");
        appwin.setVisible(true);

    }
}


