package swing.ex01;

import swing.EventDemo;

import javax.swing.*;

public class PaintDemo {
    JLabel jlab;
    PaintPanel рр;

    PaintDemo() {
        //создать новый контейнер типа JFrame
        JFrame jfrm = new JFrame("Paint Demo");
        //задать исходные размеры фрейма
        jfrm.setSize(200, 150);
        //завершить приложение, если пользователь закроет его окно
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //создать панель для рисования
        рр = new PaintPanel();
        /*
  Ввести эту панель на панели содержимого.
  В данном случае применяется граничная
 компоновка, поэтому размеры панели будут
 автоматически подгоняться таким образом,
 чтобы она заняла центральную область
         */
        jfrm.add(рр);
        //отобразить фрейм
        jfrm.setVisible(true);
    }


    //создать новый контейнер типа JFrame
    public static void main(String args[]) {
        // создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PaintDemo();
            }
        });
    }
}
