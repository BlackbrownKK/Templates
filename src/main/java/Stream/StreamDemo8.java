package Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 { // Применение итератора в потоке данных
    public static void main(String[] args) {
        //   создать список символьных строк
        ArrayList<String> myList = new ArrayList<>( );
        myList. add ("Альфа");
        myList.add("Бeтa");
        myList. add ("Гамма");
        myList. add ("Дельта");
        myList .add( "Кси");
        myList. add ("Омега");
        // получить поток данных для списочного массива
        Stream<String> myStream = myList.stream();
        // получить итератор для потока данных
        Iterator<String> itr = myStream.iterator();
        //перебрать элементы в потоке данных
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
