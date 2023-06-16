package Stream;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 { // Применить итератор-разделитель в потоке данных
    public static void main(String[] args) {
        // создать список символьных строк
        ArrayList<String> myList = new ArrayList<>( ) ;

        myList. add ("Альфа");
        myList. add ( "Бета" ) ;
        myList. add ("Гамма");
        myList. add ("Дельта");
        myList.add("Kcи");
        myList. add ("Омега");

        // получить поток данных для списочного массива
        Stream<String> myStream = myList.stream();
        // получить итератор-разделитель
        Spliterator<String> splitltr = myStream.spliterator();
        // перебрать элементы в потоке данных
        while(splitltr.tryAdvance((n) -> System.out.println(n)));

    }
}
