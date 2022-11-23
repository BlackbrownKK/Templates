package Stream.StreamAPI.Lession18;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Part04 {

    public static void main(String[] args) {

        IntStream.range(1,10)
                .peek(System.out::println)
                .filter(s->s<5)
                .peek(System.out::println)
                .forEach(System.out::println);

        IntStream.range(1,10)
                .peek(System.out::println)
                .filter(s->s<5)
                .peek(System.out::println)
                .forEach(s -> {});   // ничего не сделает над каждым елементом

        IntStream.range(1, 10)
                .filter(s -> s >= 7 && s <= 10)
                .forEach(System.out::println);

        IntStream.range(1, 10)
                .filter(s -> s >= 7 && s <= 10)
                .peek(System.out::println)
                .findFirst()
                .toString();

//                .forEach(System.out::println);
    }
}

//    IntStream peek() — это метод в java.util.stream.IntStream.
//        Функция возвращает поток, состоящий из элементов этого потока,
//        дополнительно выполняя предусмотренное действие над каждым элементом
//        по мере потребления элементов из результирующего потока.
