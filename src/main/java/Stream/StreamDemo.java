package Stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[]args) {
        // создать списочный массив значений типа Integer
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Иcxoдный список: " + myList);
        //получить поток элементов списочного массива
        Stream<Integer> myStream = myList.stream();
        //получить минимальное и максимальное значения, вызвав методы min(), max(), isPresent() и get()
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) System.out.println("Минимальное значение: " + minVal.get());

        // непременно получить новый поток данных, поскольку предыдущий вызов метода min()
        // стал оконечной операцией, употребившей поток данных
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) System.out.println("Максимальное значение: " + maxVal.get());

        //отсортировать поток данных, вызвав метод sorted()
        Stream<Integer> sortedStream = myList.stream().sorted();
        // отобразить отсортированный поток данных, вызвав метод forEach()
        System.out.print("Oтcopтиpoвaнный поток данных: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        //вывести только нечетные целочисленные значения, вызвав метод filter()
        Stream<Integer> oddVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.print("Heчeтныe значения: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();


        // вывести только те нечетные целочисленные значения, которые больше 5. Обратите внимание
        // на конвейеризацию обеих операций фильтрации
        oddVals = myList.stream().filter((n) -> (n % 2) == 1).filter((n) -> n > 5);
        System.out.print("Heчeтныe значения больше 5: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();

    }
}