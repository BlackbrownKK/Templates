package swing;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo {
    public JLabelDemo() {
        //установить фрейм средствами класса JFrame
        JFrame jfrm = new JFrame("JLabelDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(500, 500);
        //создать значок
        ImageIcon ii = new ImageIcon("src/main/java/swing/clock.jpg");
        //создать метку
        JLabel jl = new JLabel("Hourglass", ii, JLabel.CENTER);
        // ввести метку на панели содержимого
        jfrm.add(jl);
        //отобразить фрейм
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        //создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        new JLabelDemo();
                    }
                }
        );
    }
}

