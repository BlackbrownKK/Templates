package graphics;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceDemo extends Frame implements ItemListener {
    Choice os, browser;
    String msg = "";

    public ChoiceDemo() {
        // использовать диспетчер поточной компоновки
        setLayout(new FlowLayout());

        //создать раскрывающиеся списки
        os = new Choice();
        browser = new Choice();

        // ввести элементы в список os
        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("Mac OS");

        //ввести элементы в список browser
        browser.add("Internet Explorer");
        browser.add("Firefox");
        browser.add("Chrome");

        //ввести раскрывающиеся списки в окно
        add(os);
        add(browser);

        //ввести приемники событий в отдельных элементах
        os.addItemListener(this);
        browser.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }

        });
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    //отобразить текущие варианты выбора
    public void paint(Graphics g) {
        msg = "Current OS: ";
        msg += os.getSelectedItem();
        g.drawString(msg, 20, 120);
        msg = "Current Browser: ";
        msg += browser.getSelectedItem();
        g.drawString(msg, 20, 140);
    }

    public static void main(String[] args) {
        ChoiceDemo appwin = new ChoiceDemo();
        appwin.setSize(new Dimension(240, 220));
        appwin.setTitle("ChoiceDemo\");");
        appwin.setVisible(true);

    }
}

