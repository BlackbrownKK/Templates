package event.JFrameExp1;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
    String msg = "";

    int mouseX = 0, mouseY = 0; // координаты положения курсора мыши

    public static void main(String[] args) {

        MouseEventsDemo appwin = new MouseEventsDemo();
        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("Mo u seEvent sDemo");
        appwin.setVisible(true);

    }


    public MouseEventsDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());

    }
    // обработать событие от щелчка кнопкой мыши

    public void mouseClicked(MouseEvent me) {
        msg = msg + " -- click received";
        repaint();
    }
    // обработать события наведения курсора мыши

    public void mouseEntered(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse entered.";
        repaint();
    }
    //обработать событие отведения курсора мыши

    public void mouseExited(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse exited.";
        repaint();
    }
    // обработать событие нажатия кнопки мыши

    public void mousePressed(MouseEvent me) {
        // сохранить координаты
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button down";
        repaint();
    }
    // обработать событие отпускания кнопки мыши

    public void mouseReleased(MouseEvent me) {
        // сохранить координаты
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button Released";
        repaint();
    }
    //обработать событие перетаскивания курсора мыши

    public void mouseDragged(MouseEvent me) {
// save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*" + " mouse at " + mouseX + ", " + mouseY;
        repaint();
    }
    // обработать событие перемещения мыши
    public void mouseMoved(MouseEvent me) {
        msg = "Moving mouse at " + me.getX() + ", " + me.getY();
        repaint();
    }

// вывести сообщение в окне на текущей позиции с координатами Х,У

    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
}

//    // обработать событие от щелчка кнопкой мыши
//    public void keyPressed(KeyEvent ke) {
//        keyState() = "Кеу Down";
//        repaint();
//    }
//
//    // обработать событие от щелчка кнопкой мыши
//    public void keyReleased(KeyEvent ke) {
//        keyState = "Кеу Up";
//        repaint();
//    }
//
//    // обработать событие от ввода с клавиатуры
//    public void keyТyped(KeyEvent ke) {
//        msg += ke.getKeyChar();
//        repaint();
//    }
//    // отобразить нажатия клавиш
//
//    public void paint(Graphics g) {
//        g.drawString(msg, 20, 100);
//        g.drawString(keyState, 20, 50);
//    }
//
//    public static void main(String[] args) {
//        SimpleKey appwin new SimpleKey();
//        appwin.setSize(new Dimension(200, 150));
//        appwin.setтi t le("SimpleKey");
//        appwin.setVisiЬle(true);
//    }
