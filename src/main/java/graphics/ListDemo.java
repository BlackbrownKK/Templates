package graphics;

import java.awt.*;
import java.awt.event.*;

public class ListDemo extends Frame implements ActionListener {
    List os, browser;
    String msg = "";

    public ListDemo() {
        // использовать диспетчер поточной компоновки
        setLayout(new FlowLayout());

        //создать список с множественным выбором
        os = new List(4, true);

        // создать список с однократным выбором
        browser = new List(4);

        // ввести элементы в список os
        os. add ("Windows");
        os. add ( "Android");
        os.add("Solaris");
        os.add( "Мае OS");

        //ввести элементы в список browser
        browser.add("Internet Explorer");
        browser.add("Firefox");
        browser.add("Chrome");

        // сделать первоначальный выбор
        browser.select(1);
        os.select(0);

        //ввести раскрывающиеся списки в окно
        add(os);
        add(browser);

        //ввести приемники событий в отдельных элементах
        os.addActionListener(this);
        browser.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }

        });
    }

    public void actionPerformed(ActionEvent ае) {
        repaint();
    }

    //отобразить текущие варианты выбора
    public void paint(Graphics g) {
        int idx [];
        msg = "Current OS: ";
        idx = os.getSelectedIndexes();
        for(int i=0; i<idx.length; i++)  msg += os.getSelectedItem() + "   ";
        g.drawString(msg, 6, 120);
        msg = "Current Browser: ";
        msg += browser.getSelectedItem();
        g.drawString(msg, 6, 140);
    }

    public static void main(String[] args) {
        ListDemo appwin = new ListDemo();
        appwin.setSize(new Dimension(240, 220));
        appwin.setTitle("ListDemo\");");
        appwin.setVisible(true);

    }
}

