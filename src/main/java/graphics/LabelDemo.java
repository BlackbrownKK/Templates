package graphics;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelDemo extends Frame {
    public LabelDemo() {
        //использовать диспетчер поточной компоновки
        setLayout(new FlowLayout()); // используется устанавливаемая по умолчанию конфигурация
        // , в которой компоненты располагаются построчно, - слева направо, сверху вниз и по центру.
        Label one = new Label("One");
        Label two = new Label("Two");
        Label three = new Label("Three");
        //ввести метки в фрейм
        add(one);
        add(two);
        add(three);
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        LabelDemo appwin = new LabelDemo();
        appwin.setSize(new Dimension(500, 100));
        appwin.setTitle("LabelDemo");
        appwin.setVisible(true);
    }
}

