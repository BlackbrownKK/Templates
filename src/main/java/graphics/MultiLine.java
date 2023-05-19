package graphics;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MultiLine extends Frame {
    int curX = 20, curY = 40; //текущая позиция

    public MultiLine() {
        Font f = new Font("SansSerif", Font.PLAIN, 12);
        setFont(f);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        FontMetrics fm = g.getFontMetrics();

        nextLine("This is on line one.", g);
        nextLine("This is on line two.", g);
        sameLine(" This is on same line.", g);
        sameLine(" This, too.", g);
        nextLine("This is оп line three.", g);
        curX = 20;
        curY = 40; //установить координаты в исходное состояние перед повторным воспроизведением
    }


    void nextLine(String s, Graphics g) {        //перейти на следующую строку
        FontMetrics fm = g.getFontMetrics();
        curY += fm.getHeight();                 //перейти на следующую строку
        curX = 20;
        g.drawString(s, curX, curY);

        curX += fm.stringWidth(s);              // перейти в конец строки

    }

    void sameLine(String s, Graphics g) {  // отобразить текст в той же самой строке
        FontMetrics fm = g.getFontMetrics();
        g.drawString(s, curX, curY);
        curX += fm.stringWidth(s);          // перейти в конец строки

    }

    public static void main(String[] args) {
        MultiLine appwin = new MultiLine();
        appwin.setSize(new Dimension(300, 120));
        appwin.setTitle("Mul tiLine");
        appwin.setVisible(true);
    }
}
