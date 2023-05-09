package event.JFrameExp1;

import javax.swing.*;

public class JFrameEx1 {


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setTitle("Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BlueCircComponent());
        frame .setVisible(true);
    }
}
