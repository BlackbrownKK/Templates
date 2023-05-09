package event;

import javax.swing.*;
import java.awt.*;

public class MyForm2 extends JFrame {

    private JTextField pol1;
    private JTextField pol2;

    public MyForm2(String name) {
        super(name);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pol1 = new JTextField(10);
        pol1 = new JTextField(12);
        add(pol1);
        add(pol2);
        pack();
        setVisible(true);
    }

}
