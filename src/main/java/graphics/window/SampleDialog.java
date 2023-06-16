package graphics.window;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//создать подкласс, производный от класса Dialog
class SampleDialog extends Dialog {
    SampleDialog(Frame parent, String title) {
        super(parent, title, false);
        setLayout(new FlowLayout());
        setSize(300, 200);
        add(new Label("Press this button:"));
        Button b;
        add(b = new Button("Cancel"));
        b.addActionListener((ae) -> dispose());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString("This is in the dialog Ьох", 20, 80);

    }
}
