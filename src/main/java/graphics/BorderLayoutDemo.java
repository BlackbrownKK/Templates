package graphics;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutDemo extends Frame {

    public BorderLayoutDemo() {
        // в данном случае диспетчер граничной компоновки  используется по умолчанию
        add(new Button("This is across the top."),
                BorderLayout.NORTH);
        add(new Label("The footer message might go here."),
                BorderLayout.SOUTH);
        add(new Button("Right"), BorderLayout.EAST);
        add(new Button("Left"), BorderLayout.WEST);
        String msg = "The reasonaЬle man adapts "
                + "himself to the world;\n"
                + "the unreasonaЫe one persists in "
                + "trying to adapt the world to himself.\n"
                + "Therefore all progress depends "
                + "оп the unreasonaЬle man.\n\n"
                + " - George Ber·nard Shaw\n \n";
        add(new TextArea(msg), BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        BorderLayoutDemo appwin = new BorderLayoutDemo();
        appwin.setSize(new Dimension(240, 220));
        appwin.setTitle("CheckboxDemo\");");
        appwin.setVisible(true);

    }
}