package Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
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
    }
}
