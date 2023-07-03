package swing;

import javax.swing.*;
import java.awt.*;

public class SwingDemo1 {

    SwingDemo1() {
        // создать новый контейнер типа JFrame Простое Swing-приложение
        JFrame jfrm = new JFrame("A Simple Swing Application");
        //Простое Swing-приложение
        // задать исходные размеры фрейма
        jfrm.setSize(275, 100);
        //завершить работу, если пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //создать метку с текстом сообщения
        JLabel jLabel = new JLabel("Swing means powerful GUis");
        //Swing - это мощные ГПИ
        // ввести метку на панели содержимого
        jfrm.add(jLabel);
        //отобразить фрейм
        jfrm.setVisible(true);

    }

    public static void main(String args[]) {
        // создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo1();
            }
        });
    }
}
