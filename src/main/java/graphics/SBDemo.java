package graphics;

import java.awt.*;
import java.awt.event.*;

public class SBDemo extends Frame implements AdjustmentListener {
    String msg = "";
    Scrollbar vertSB, horzSB;

    public SBDemo() {
        //использовать диспетчер поточной компоновки
        setLayout(new FlowLayout());
        //создать полосы прокрутки и задать их предпочтительные размеры
        vertSB = new Scrollbar(Scrollbar.VERTICAL, 1, 1, 1, 200);
        vertSB.setPreferredSize(new Dimension(20, 100));
        horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
        horzSB.setPreferredSize(new Dimension(100, 20));
        //ввести полосы прокрутки в фрейм
        add(vertSB);
        add(horzSB);
        //добавить приемники событий к полосам прокрутки
        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);
        //ввести приемник событий от мыши
        addMouseListener(new MouseAdapter() {
            //обновить полосы прокрутки для отражения перемещений мыши
            public void mouseDragged(MouseEvent me) {
                int x = me.getX();
                int y = me.getY();
                vertSB.setValue(y);
                horzSB.setValue(x);
                repaint();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void adjustmentValueChanged(AdjustmentEvent ае) {
        repaint();
    }

    //отобразить текущее состояние полос прокрутки
    public void paint(Graphics g) {
        msg = "Vertical: " + vertSB.getValue();
        msg += ", Horizontal: " + horzSB.getValue();
        g.drawString(msg, 20, 160);
        //показать текущее положение перемещаемой мыши
        g.drawString("*", horzSB.getValue(), vertSB.getValue());

    }

    public static void main(String[] args) {
        SBDemo appwin = new SBDemo();
        appwin.setSize(new Dimension(250, 150));
        appwin.setTitle("ButtonDemo");
        appwin.setVisible(true);
    }
}
