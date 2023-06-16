package graphics;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
Продемонстрировать применение граничной компоновки со вставками
 */
public class InsetsDemo extends Frame {
    public InsetsDemo() {
        // в данном случае диспетчер граничной компоновки  используется по умолчанию задать цвет фона,
        // чтобы легче видеть вставки
        setBackground(Color.cyan);
        setLayout(new BorderLayout());
        add(new Button("This is across the top."),
                BorderLayout.NORTH);
        add(new Label("The footer message might go here."),
                BorderLayout.SOUTH);
        add(new Button("Right"), BorderLayout.EAST);
        add(new Button("Left"), BorderLayout.WEST);
        String msg = "The reasonaЫe man adapts "
                + "himself to the world;\n"
                + "the unreasonaЫe one persists in"
                + "trying to adapt the world to himself.\n"
                + "Therefore all progress depends "
                + "on the unreasonaЫe man.\n\n"
                + " - George Bernard Shaw\n \n";
        add(new TextArea(msg), BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
//переопределить метод getinsets(), чтобы ввести значения вставок

    public Insets getinsets() {
        return new Insets(40, 20, 10, 20);
    }

    public static void main(String[] args) {
        InsetsDemo appwin = new InsetsDemo();
        appwin.setSize(new Dimension(240, 220));
        appwin.setTitle("CheckboxDemo\");");
        appwin.setVisible(true);

    }

}