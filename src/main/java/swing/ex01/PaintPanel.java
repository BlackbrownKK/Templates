package swing.ex01;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PaintPanel extends JPanel {
    //Этот кла сс ра сширяет клас с JPanel В нем п ереопределя ет с я мет од paintComponen t( ) ,
// чтобы произвольно ри совать линии на панели

    Insets ins; // служит для хранения размеров границ панели
    Random rand; // служит для генерирования слу чайных чисел

    // создать панель
    PaintPanel() {
        // раз местить рамку вокруг панели,
        // опред е ли в ее г ра ницы
        setBorder(BorderFactory.createLineBorder(Color.RED.RED, 5));
        rand = new Random();
    }


    // п е р ео пр е д ел и т ь мето д pa i n t Comp o n e nt()
    protected void paintComponent(Graphics g) {
// вы з ыв ать в с ег да перв ым м е то д и з су пе ркл а с са
        super.paintComponent(g);
        int x, y, x2, y2;
        //получить высоту и ширину компонента
        int height = getHeight();
        int width = getWidth();
//получить размеры границ панели
        ins = getInsets();
//нарисовать десять линий, конечные точки
        // которых формируются произвольно
        for (int i = 0; i < 10; i++) {
            // получить произвольные координаты,
            // определяющие конечные точки каждой линии
            x = rand.nextInt(width - ins.left);
            y = rand.nextInt(height - ins.bottom);
            x2 = rand.nextInt(width - ins.left);
            y2 = rand.nextInt(height - ins.bottom);
//нарисовать линию
            g.drawLine(x, y, x2, y2);
        }
    }
}


