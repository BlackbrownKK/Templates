package swing.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.Key;

public class MenuDemo_01 implements ActionListener {
    JLabel jlab;

    MenuDemo_01() {


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
        JMenuItem jmiOpen = new JMenuItem("Open", KeyEvent.VK_O); //Открыть

        jmiOpen.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));//с мнемоникой и оперативными клавишами

        JMenuItem jmiClose = new JMenuItem("Close"); // Закрыть


        JMenuItem jmiSave = new JMenuItem("Save"); //Сохранить


        JMenuItem jmiExit = new JMenuItem("Exit"); // Выход


        /*
        JMenultem jmiOpen = new JMenuitem ( "Open", KeyEvent. VK_O);
jmiOpen.setAccelerator(KeyStroke.getKeyStroke(
KeyEvent.VK_O, InputEvent.CTRL_DOWN_МASK));
JMenuitem jmiClose = пеw JMenuitem("Close•, KeyEveпt.VK_C);
jmiClose.setAccelerator(KeyStroke.getKeyStroke(
KeyEvent.VK_C, InputEvent.CTRL_DOWN_МASK));
JMenuitem jmiSave = new JMenuitem("Save", KeyEvent.VK_S);
jmiSave.setAccelerator(KeyStroke.getKeyStroke(
KeyEvent.VK_S, InputEvent.CTRL_DOWN_МASK));
JMenuitem jmiExi t = new JMenuitem ( "Exi t", KeyEvent. VK_E);
jmiExit.setAccelerator(KeyStroke.getKeyStroke(
KeyEvent.VK_E, IпputEvent.CTRL_DOWN_МASK));
         */
        jmFile.setMnemonic(KeyEvent.VK_F);
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jmb.add(jmFile);

        // создать меню Options
        JMenu jmOptions = new JMenu("Options");
        // создать подменю Colors
        JMenu jmColors = new JMenu("Colors"); //Цвета
        JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red", true); //Красный
        JMenuItem jmiGreen = new JMenuItem("Green"); // Зеленый
        JMenuItem jmiBlue = new JMenuItem("Blue"); // Синий
        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);
        // создать подменю Priority
        /*
// Использовать кнопки-переключатели для установки
// приоритета. Благодаря этому в меню не только
// отображается установленный приоритет, но и
// гарантируется установка одного и только одного
//приоритета. Исходно выбирается кнопка-переключатель
// в пункте меню High
         */
        JMenu jmPriority = new JMenu("Priority"); //Приоритет
        JCheckBoxMenuItem jmiHigh = new JCheckBoxMenuItem("High", false); //Высокий
        JCheckBoxMenuItem jmiLow = new JCheckBoxMenuItem("Low"); //Низкий

        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);
        jmOptions.add(jmPriority);
        // создать группу кнопок-переключателей в пунктах подменю Priority
        ButtonGroup bg = new ButtonGroup();
        bg.add(jmiHigh);
        bg.add(jmiLow);

        // создать пункт меню Reset
        JMenuItem jmiReset = new JMenuItem("Reset"); // Сбросить
        jmOptions.addSeparator();
        jmOptions.add(jmiReset);
        //И наконец, ввести все выбираемые меню в строку меню
        jmb.add(jmOptions);
        //создать меню Help
        JMenu jmHelp = new JMenu("Help"); //Справка
        ImageIcon icon = new ImageIcon("src/main/java/swing/menu/AboutIcon.png");
        JMenuItem jmiAbout = new JMenuItem("About", icon); // О программе
        jmiAbout.setToolTipText("Info about the MenuDemo program."); //создается всплывающая подсказка

        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);

        //ввести приемники действий от пунктов меню

        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);

        jmiRed.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);
        jmiAbout.addActionListener(this);


        //ввести метку на панели содержимого
        jfrm.add(jlab);
        //ввести строку меню во фрейм
        jfrm.setJMenuBar(jmb);
        //отобразить фрейм
        jfrm.setVisible(true);


        JPopupMenu jpu;
        // Create an Edit popup menu.
        jpu = new JPopupMenu();

        // Create the popup menu items.
        JMenuItem jmiCut = new JMenuItem("Cut");
        JMenuItem jmiCopy = new JMenuItem("Copy");
        JMenuItem jmiPaste = new JMenuItem("Paste");

        // Add the menu items to the popup menu.
        jpu.add(jmiCut);
        jpu.add(jmiCopy);
        jpu.add(jmiPaste);
        //ввести приемник событий запуска всплывающего ме
        jfrm.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                if (me.isPopupTrigger())
                    jpu.show(me.getComponent(), me.getX(), me.getY());
            }

            public void mouseReleased(MouseEvent me) {
                if (me.isPopupTrigger())
                    jpu.show(me.getComponent(), me.getX(), me.getY());
            }
        });

        /*
        обрабатывают события действия, наступающие в тот момент,
когда пользователь выбирает пункт из всплывающего меню.
         */
        jmiCut.addActionListener(this);
        jmiCopy.addActionListener(this);
        jmiPaste.addActionListener(this);


        // создать панель инструментов Debug
        JToolBar jtb = new JToolBar("Debug");
        //загрузить изображения значков экранных кнопок
        ImageIcon set = new ImageIcon("src/main/java/swing/menu/setBP.png");
        ImageIcon clear = new ImageIcon("src/main/java/swing/menu/clearBP.png");
        ImageIcon resume = new ImageIcon("src/main/java/swing/menu/resume.png");
        //создать кнопки для панели инструментов
        JButton jbtnSet = new JButton(set);
        jbtnSet.setActionCommand("Set Breakpoint");
        jbtnSet.setToolTipText("Set Breakpoint");
        //Установить точку прерывания
        JButton jbtnClear = new JButton(clear);
        jbtnClear.setActionCommand("Clear Breakpoint");
        jbtnClear.setToolTipText("Clear Breakpoint");
        //Очистить точку прерывания
        JButton jbtnResume = new JButton(resume);
        jbtnResume.setActionCommand("Resume");
        jbtnResume.setToolTipText("Resume");
        //Возобновить выполнение программы
        //ввести экранные кнопки на панели инструментов
        jtb.add(jbtnSet);
        jtb.add(jbtnClear);
        jtb.add(jbtnResume);
        //ввести панель инструментов в северном расположении на панели содержимого
        jfrm.add(jtb, BorderLayout.WEST);
        //ввести приемники действий для панели инструментов
        jbtnSet.addActionListener(this);
        jbtnClear.addActionListener(this);
        jbtnResume.addActionListener(this);


//        DebugAction setAct;
//        DebugAction clearAct;
//        DebugAction resumeAct;
//        //загрузить изображения для обозначения действий при отладке
//        ImageIcon seticon = new ImageIcon("setBP.gif");
//        ImageIcon clearIcon = new ImageIcon("clearBP.gif");
//        ImageIcon resumeicon = new ImageIcon("resume.gif");
//        //создать действия
//        setAct = new DebugAction("Set Breakpoint",
//                seticon, KeyEvent.VK_S,
//                KeyEvent.VK_B,
//                "Set а break poiпt.");
////Установить точку прерывания
//        clearAct = new DebugAction("Clear Breakpoint",
//                clearIcon, KeyEvent.VK_C,
//                KeyEvent.VK_L,
//                "Clear а break point.");
//        //Очистить точку прерывания
//        resumeAct = new DebugAction("Resume", resumeicon,
//                KeyEvent.VK_R, KeyEvent.VK_R,
//                "Resume execution after breakpoint.");
//// Возобновить выполнение после точки прерывания
//        // сделать первоначально недоступным вариант выбора Clear Breakpoint
//        clearAct.setEnabled(false);
////  создать кнопки для панели инструментов, используя соответствующие действия
//        JButton jbtnSet = new JButton(setAct);
//        JButton jbtnClear = new JButton(clearAct);
//        JButton jbtnResume = new JButton(resumeAct);
//
//        // создать панель инструментов Debug
//        JToolBar jtb = new JToolBar("Breakpoints");
//
//        //ввести кнопки на панели инструментов
//
//        jtb.add(jbtnSet);
//        jtb.add(jbtnClear);
//        jtb.add(jbtnResume);
////ввести панель инструментов в северном расположении панели содержимого
//        jfrm.add(jtb, BorderLayout.NORTH);

//создать подменю Debug, входящее в меню Options,
////используя действия для создания пунктов этого подменю
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
                new MenuDemo_01();
            }
        });
    }

//    class DebugAction extends AbstractAction {
//        public DebugAction(String name, Icon image, int mnem, int accel, String tTip) {
//            super(name, image);
//            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
//                    accel, InputEvent.CTRL_DOWN_MASK));
//            putValue(MNEMONIC_KEY, new Integer(mnem));
//            putValue(SHORT_DESCRIPTION, tTip);
//
//        }
//    }

//    public void actionPerformed(ActionEvent ae) {
//
//        String comStr = ae.getActionCommand();
//        jlab.setText(comStr + " Selected");
//        // Выбрано указанное изменить разрешенное состояние вариантов выбора режимов установки и очистки точек прерывания
//        if (comStr.equals("Set Breakpoint")) {
//            clearAct.setEnabled(true);
//            setAct.setEnabled(false);
//        } else if (comStr.equals("Clear Breakpoint")) {
//            clearAct.setEnabled(false);
//            setAct.setEnabled(true);
//        }
//    }
}


