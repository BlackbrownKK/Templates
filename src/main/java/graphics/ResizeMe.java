package graphics;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ResizeMe extends Frame {
    final int inc = 25;
    int max = 500;
    int min = 200;
    Dimension d;

    public ResizeMe() {
    //Анонимный внутренний класс для обработки событий отпускания кнопок мыши
        addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                int w = (d.width + inc) > max ? min : (d.width + inc);
                int h = (d.height + inc) > max ? min : (d.height + inc);
                setSize(new Dimension(w, h));
            }
        });

        // Анонимный внутренний класс для обработки событий закрытия окна
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics gr) {
        Insets i = getInsets();
        d = getSize();
        gr.drawLine(i.left, i.top, d.width - i.right, d.height - i.bottom);
        gr.drawLine(i.left, d.height - i.bottom, d.width - i.right, i.top);
    }


    public static void main(String[] args) {
        ResizeMe appwin = new ResizeMe();
        appwin.setSize(new Dimension(200, 200));
        appwin.setTitle("ResizeMe");
        appwin.setVisible(true);
    }
}
