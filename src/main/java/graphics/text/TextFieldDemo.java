package graphics.text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldDemo extends Frame implements ActionListener {

    TextField name, pass;

    public TextFieldDemo() {
        //использовать диспетчер поточной компоновки
        setLayout(new FlowLayout());
        //создать элементы управления
        Label namep = new Label("Name: " , Label.RIGHT);
        Label passp = new Label("Password: ", Label.RIGHT);
        name = new TextField(12);
        pass = new TextField(8);
        pass.setEchoChar('?');
        //ввести элементы управления в фрейм
        add(namep);
        add(name);
        add(passp);
        add(pass);
        //ввести обработчики событий действия
        name.addActionListener(this);
        pass.addActionListener(this);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    //пользователь нажал клавишу <Enter>
    public void actionPerformed(ActionEvent ае) {
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Name: " + name.getText(), 20, 100);
        g.drawString("Selected text in name: "
                + name.getSelectedText(), 20, 120);
        g.drawString("Password: " + pass.getText(), 20, 140);
    }


    public static void main(String[] args) {
        TextFieldDemo appwin = new TextFieldDemo();
        appwin.setSize(new Dimension(370, 700));
        appwin.setTitle("GraphicsDemo");
        appwin.setVisible(true);


    }

}

