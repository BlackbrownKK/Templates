package graphics;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ShowFonts extends Frame {
    String msg = "First five fonts: ";
    GraphicsEnvironment ge;


    public ShowFonts() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        // получить графическую среду
        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

    //получить список шрифтов
        String[] fontList = ge.getAvailableFontFamilyNames();

        // создать символьную строку с первыми 5 шрифтами
        for (int i = 0; (i < 50) && (i < fontList.length); i++)
            msg += fontList[i] + " ";
    }

    // отобразить шрифты
    public void paint(Graphics g) {
        g.drawString(msg, 10, 60);
    }

    public static void main(String[] args) {
        ShowFonts appwin = new ShowFonts();
        appwin.setSize(new Dimension(500, 100));
        appwin.setTitle("ShowFonts");
        appwin.setVisible(true);
    }
}
