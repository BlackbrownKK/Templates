package event.eventsDemo;

import event.JFrameExp1.MyWindowAdapter;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventsDemo extends Frame implements KeyListener {
    String msg = "";
    String keyState = "";

    public KeyEventsDemo() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    // обработать событие от нажатия клавиши
    public void keyPressed(KeyEvent ke) {
        keyState = "Кеу Down";
        int key = ke.getKeyCode();
        switch (key) {
            case KeyEvent.VK_F1 -> msg += "<F1> ";
            case KeyEvent.VK_F2 -> msg += "<F2>";
            case KeyEvent.VK_F3 -> msg += "<F3>";
            case KeyEvent.VK_PAGE_DOWN -> msg += "<PgDn>";
            case KeyEvent.VK_PAGE_UP -> msg += "<PgUp>";
            case KeyEvent.VK_LEFT -> msg += "<Left Arrow>";
            case KeyEvent.VK_RIGHT -> msg += "<Right Arrow>";
        }
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
        KeyEventsDemo appwin = new KeyEventsDemo();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("KeyEventsDemo");
        appwin.setVisible(true);
    }
}

