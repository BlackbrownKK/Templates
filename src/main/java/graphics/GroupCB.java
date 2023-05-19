package graphics;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GroupCB extends Frame implements ItemListener {
    String msg = "";
    Checkbox windows, android, solaris, mac;
    CheckboxGroup cbg;

    public GroupCB() {
        //использовать диспетчер поточной компоновки
        setLayout(new FlowLayout());
        //создать кнопки-переключатели
        cbg = new CheckboxGroup();
        // создать флажки и добавить их к кнопкам-переключателям
        windows = new Checkbox ("Windows" , cbg, true) ;
        android = new Checkbox("Android", cbg, false);
        solaris = new Checkbox("Solaris", cbg, false);
        mac = new Checkbox("Mac OS", cbg, false);

        //ввести флажки в фрейм
        add(windows);
        add(android);
        add(solaris);
        add(mac);
        //ввести приемники событий в отдельных элементах
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

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    //отобразить текущее состояние флажков
    public void paint(Graphics g) {
        msg = "Current selection: ";
        msg += cbg.getSelectedCheckbox() .getLabel();
        g.drawString(msg, 20, 120);

    }

    public static void main(String[] args) {
        GroupCB appwin = new GroupCB();
        appwin.setSize(new Dimension(240, 180));
        appwin.setTitle("GroupCB\");");
        appwin.setVisible(true);

    }

}

