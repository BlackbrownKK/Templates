package Stream.StreamAPI.Lession18;

import java.util.ArrayList;

public class Part02 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(41);
        num.add(5);
        num.add(6);

//        num.stream().map(s -> s*2).filter(s->s>5).forEach(System.out::println);

        num.stream() // создаём обьект Stream;
                .map(s -> s * 2) // что то делаем с каждым элементом
                .filter(s -> s > 5) // промежуточный оператор
                .forEach(System.out::println); // является терминальным (конечным) аналогом перебора for each

//        сокращенно от: x-> System.out.println(x)),
//        которое в свою очередь проходит по всем элементам переданной ему коллекции и выводит её)
    }
}

//    Операторы можно разделить на две группы:

//        Промежуточные (“intermediate”, ещё называют “lazy”) — обрабатывают поступающие элементы и возвращают стрим.
//        Промежуточных операторов в цепочке обработки элементов может быть много.

//        Терминальные (“terminal”, ещё называют “eager”) — обрабатывают элементы и завершают работу стрима,
//        так что терминальный оператор в цепочке может быть только один.