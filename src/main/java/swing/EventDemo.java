package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    JLabel jlab;

    EventDemo() {
        // создать новый контейнер типа JFrame
        JFrame jfrm = new JFrame("An Event Example");
        // Пример обработки событий
        // определить диспетчер поточной компоновки типа FlowLayout
        jfrm.setLayout(new FlowLayout());
        //установить исходные размеры фрейма
        jfrm.setSize(220, 90);
        // завершить работу приложения, если пользователь закрывает его окно
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //создать две кнопки
        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta = new JButton("Beta");
        //ввести приемник действий от кнопки Alpha
        jbtnAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ае) {
                jlab.setText("Alpha was pressed.");
                // Нажата кнопка Alpha
            }
        });
        //ввести приемник действий от кнопки Beta
        jbtnBeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ае) {
                jlab.setText("Beta was pressed.");
                // Нажата кнопка Beta
            }
        });
        //ввести кнопки на панели содержимого
        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);
        //создать текстовую метку
        jlab = new JLabel("Press а button.");
        //Метка "Нажмите кнопку."
        //ввести метку на панели содержимого
            jfrm.add(jlab);
            //отобразить фрейм
        jfrm.setVisible(true);

    }
    public static void main(String args[]) {
        // создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EventDemo();
            }
        });
    }
}
