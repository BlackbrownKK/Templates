package event.adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
/*
Как видите, благодаря тому, что отпадает необходимость реализовывать все методы,
определенные в интерфейсах MouseMotionListener и MouseListener,
экономится немало труда, а прикладной код избавляется от нагромождения пустых
методов. В качестве упражнения можете попробовать переписать один из
приведенных ранее примеров, где обрабатываются события от ввода с клавиатуры,
воспользовавшись классом KeyAdapter.
 */
    AdapterDemo adapterDemo;
    public MyMouseAdapter(AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    // обработать событие от щелчка кнопкой мыши
    public void mouseClicked(MouseEvent me) {
        adapterDemo.msg = "Mouse clicked";
        adapterDemo.repaint();
    }

    // обработать событие от перемещения мыши
    public void mouseDragged(MouseEvent me) {
        adapterDemo.msg = "Mouse dragged";
        adapterDemo.repaint();
    }
}