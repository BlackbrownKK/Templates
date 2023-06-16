package Stream;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StrearnDerno10 { // Продемонстрировать применение метода trySplit()
    //создать список символьных строк
    public static void main(String[] args) {


        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Kcи");
        myList.add("Омега");
//получить поток данных для списочного массива
        Stream<String> myStrearn = myList.stream();
//получить итератор-разделитель
        Spliterator<String> splititr = myStrearn.spliterator();
//а теперь разделить первый итератор
        Spliterator<String> splititr2 = splititr.trySplit();
//использовать сначала итератор splititr2, если нельзя разделить итератор splititr
        if (splititr2 != null) {
            System.out.println("Результат, выводимый итератором splititr2: ");
            splititr2.forEachRemaining(System.out::println);
// а теперь воспользоваться итератором splititr
            System.out.println(
                    "\nРезультат, выводимый итератором splititr: ");
            splititr.forEachRemaining(System.out::println);
        }
    }
}