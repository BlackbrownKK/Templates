package event.simpleKeys;

import event.JFrameExp1.MyWindowAdapter;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleKey extends Frame implements KeyListener {

    String msg = "";
    String keyState = "";

    public SimpleKey() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    // обработать событие от нажатия клавиши
    public void keyPressed(KeyEvent ke) {
        keyState = "Кеу Down";
        repaint();
    }

    // обработать событие от отпускания клавиши
    public void keyReleased(KeyEvent ke) {
        keyState = "Кеу Up";
        repaint();
    }

    // обработать событие от ввода с клавиатуры
    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    // отобразить нажатия клавиш
    public void paint(Graphics g) {

        g.drawString(msg, 20, 100);
        g.drawString(keyState, 20, 50);
    }

    public static void main(String[] args) {
        SimpleKey appwin = new SimpleKey();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("SimpleKey");
        appwin.setVisible(true);
    }
}
