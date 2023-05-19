package graphics.buttons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.awt.FlowLayout.*;

public class ButtonDemo extends Frame implements ActionListener {
    String msg = "";
    Button yes, no, maybe;

    public ButtonDemo() {
        // использовать диспетчер поточной компоновки

        setLayout(new FlowLayout());
        // создать экранные кнопки

        yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("Undecided");

        // создать экранные кнопки
        add(yes);
        add(no);
        add(maybe);
        // ввести приемники действий для кнопок

        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }

        });
    }

    //обработать события действия
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();

        if (str.equals("Yes")) {

            msg = "You pressed Yes.";
        } else if (str.equals("No")) {
            msg = "You pressed No.";

        } else {
            msg = "You pressed Undecided.";
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
    }

    public static void main(String[] args) {
        ButtonDemo appwin = new ButtonDemo();
        appwin.setSize(new Dimension(250, 150));
        appwin.setTitle("ButtonDemo");
        appwin.setVisible(true);
    }
}
