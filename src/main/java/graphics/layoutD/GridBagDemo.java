package graphics.layoutD;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridBagDemo extends Frame implements ItemListener {
    String msg = "";
    Checkbox windows, android, solaris, mac;

    public GridBagDemo() {

        // использовать диспетчер сеточно-контейнерной компоновки
        GridBagLayout gbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbag);
        //определить флажки
        windows = new Checkbox("Windows ", true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");
        //определить сеточный контейнер использовать нулевой вес по умолчанию для первой строки
        gbc.weightx = 1.0;
        // использовать единичный вес для столбца
        gbc.ipadx = 200; // заполнить на 200 единиц
        gbc.insets = new Insets(0, 6, 0, 0);
        // сделать небольшую вставку относительно
        // левого верхнего угла
        gbc.anchor = GridBagConstraints.NORTHEAST;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(windows, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(android, gbc);
        // придать второй строке единичный вес
        gbc.weighty = 1.0;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(solaris, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(mac, gbc);
        //ввести компоненты
        add(windows);
        add(android);
        add(solaris);
        add(mac);
        //зарегистрировать приемники событий в элементах
        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    // воспроизвести повторно, когда изменится состояние флажка
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
    //отобразить текущее состояние флажков
    public void paint(Graphics g) {
        msg = "Current state: ";
        g.drawString(msg, 20, 100);
        msg = " Windows: " + windows.getState();
        g.drawString(msg, 30, 120);
        msg = " Android: " + android.getState();
        g.drawString(msg, 30, 140);
        msg = " Solaris: " + solaris.getState();
        g.drawString(msg, 30, 160);
        msg = " Мае: " + mac.getState();
        g.drawString(msg, 30, 180);
    }

    public static void main(String[] args) {
        GridBagDemo appwin = new GridBagDemo();
        appwin.setSize(new Dimension(300, 220));
        appwin.setTitle("CardLayoutDemo");
        appwin.setVisible(true);
    }
}


