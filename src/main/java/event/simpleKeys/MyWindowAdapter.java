package event.simpleKeys;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// закрыть окно и выйти из программы при нажатии экранной кнопки закрытия окна
public class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
    }