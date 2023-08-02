package swing.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo implements ActionListener {
    JLabel jlab;

    MenuDemo() {
        //создать новый контейнер типа JFrame
        JFrame jfrm = new JFrame("Menu Demo"); //Демонстрация меню
        //указать диспетчер поточной компоновки типа FlowLayout
        jfrm.setLayout(new FlowLayout());
        //задать исходные размеры фрейма
        jfrm.setSize(360, 200);
        //завершить прикладную программу, как только пользователь закроет ее окно
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //создать метку для отображения результатов выбора из меню
        jlab = new JLabel();
        //создать строку меню
        JMenuBar jmb = new JMenuBar();
        //создать меню File
        JMenu jmFile = new JMenu("File"); //Файл
        JMenuItem jmiOpen = new JMenuItem("Open"); //Открыть
        JMenuItem jmiClose = new JMenuItem("Close"); // Закрыть
        JMenuItem jmiSave = new JMenuItem("Save"); //Сохранить
        JMenuItem jmiExit = new JMenuItem("Exit"); // Выход
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jmb.add(jmFile);

        // создать меню Options
        JMenu jmOptions = new JMenu("Options");

        //ввести приемники действий от пунктов меню

        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);

        //ввести метку на панели содержимого
        jfrm.add(jlab);
        //ввести строку меню во фрейм
        jfrm.setJMenuBar(jmb);
        //отобразить фрейм
        jfrm.setVisible(true);
    }

    //обработать события действия от пунктов меню
    public void actionPerformed(ActionEvent ае) {
        //получить команду действия из выбранного меню
        String comStr = ае.getActionCommand();
        //выйти из программы, если пользователь выберет пункт меню Exit
        if (comStr.equals("Exit")) System.exit(0);
        //в противном случае отобразить результат выбора из меню
        jlab.setText(comStr + " Selected"); // Выбрано указанное
    }

    public static void main(String args[]) {
        //создать фрейм в потоке диспетчеризации
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuDemo();
            }
        });
    }
}

