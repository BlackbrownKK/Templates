package graphics.buttons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonList extends Frame implements ActionListener {
    String msg = "";
    Button bList[] = new Button[3];

    public ButtonList() {
// использовать диспетчер поточной компоновки
        setLayout(new FlowLayout());
        // создать экранные кнопки
        Button yes = new Button("Yes");
        Button no = new Button("No");
        Button maybe = new Button("Undecided");
        // сохранить ссылки на экранные кнопки
        //по мере их ввода в фрейм
        bList[0] = (Button) add(yes);
        bList[1] = (Button) add(no);
        bList[2] = (Button) add(maybe);

        // зарегистрировать приемник событий действия
        for (int i = 0; i < 3; i++) {
            bList[i].addActionListener(this);
        }

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    //обработать события действия экранных кнопок
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < 3; i++) {
            if (ae.getSource() == bList[i]) {
                msg = "You pressed " + bList[i].getLabel();
            }
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
