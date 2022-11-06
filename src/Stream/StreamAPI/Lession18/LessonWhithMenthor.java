package Stream.StreamAPI.Lession18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LessonWhithMenthor {

    public static void main(String[] args) {
        Integer[] numbers = {1, 5, 4, 7, 8, 22, 4, 5, 15, 9, 3, 1, 5};

        List<Integer> collect = Arrays
                .stream(numbers)
                .collect(Collectors.toList());

        System.out.println(collect);
//---------------------------------------------------------------
        List<String> listOfWords = new ArrayList<>();
        listOfWords.add("Dog");
        listOfWords.add("Cat");
        listOfWords.add("Cat");
        listOfWords.add("Cat");
        listOfWords.add("Car");
        listOfWords.add("House");
        long count = listOfWords
                .stream()
                .filter(p -> p.equals("Cat"))
                .count();

        System.out.println(count);
    }
}
