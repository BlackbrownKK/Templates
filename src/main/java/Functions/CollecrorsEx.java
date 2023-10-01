package Functions;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class CollecrorsEx {

    public static void main(String[] args) {
        String[] wordsArray = {"qq", "ww", "eee", "eee", "rrr", "ttt", "yy", "uu"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArray));

        Set<String> lingWords = words
                .stream()
                .filter((word) -> word.length() > 2)
                .collect(Collectors.toSet());

        String lingWord = words
                .stream()
                .filter((word) -> word.length() > 2)
                .collect(Collectors.joining(","));

        System.out.println(lingWord);

        Long lingWordHowMany = words
                .stream()
                .filter((word) -> word.length() > 2)
                .collect(Collectors.counting());

        System.out.println(lingWordHowMany);


        Map<Integer, List<String>> resultMap = words
                .stream()
                .collect(Collectors.groupingBy(
                        (word) -> word.length()
                ));
        System.out.println();
        System.out.println(resultMap);

        Map<Boolean, List<String>> resultMap2 = words
                .stream()
                .collect(Collectors.partitioningBy(
                        (word) -> word.length()>4
                ));
        System.out.println();
        System.out.println(resultMap2);

    }
}
