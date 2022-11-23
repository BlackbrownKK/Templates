package Stream.StreamAPI.Lession18;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class STR {

    private static final String charsToRemove = "!?,.{}()";

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in); // choose book
        String patchPrefix = "src/Stream/StreamAPI/Lession18/text.txt";
        File file = new File(patchPrefix);


         // I will read from file. Close after finish. 2 works: fileReader+BufferedReader. Every method will be close
        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {


            bufferedReader.lines().map(line -> {     // I will have got all lines like streams.
                        for (Character str : charsToRemove.toCharArray()) {     // start to analise line by line
                            line = line.replace(str.toString(), "");

                        }
                        return line;
                    }).
                    // making new words using spaces
                    map(s -> s.split(" "))

                    // [hello, world, !], [I, am, happy, !] -> [hello] [world] [!] [I] [am] [happy] from Array to words.
                    .flatMap(Arrays::stream)

                    // filter word > 2 letters
                    .filter(word -> word.length() > 2)

                    // all words - > to lower case
                    .map(String::toLowerCase)

                    // return MAP collections, which identification every words and counting how many times is this word
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))

                    //  returns a set of key-value mappings < words, how many times >
                    .entrySet()

                    // create stream of < words, how many times >, < words, how many times >, < words, how many times >
                    .stream()

                    // sorted all collection Map
                    .sorted((Map.Entry<String, Long> first, Map.Entry<String, Long> second) -> (int) (second.getValue() - first.getValue()))

                    // max size of collection Map
                    .limit(10)

                    // print
                    .forEach(stringLongEntry -> System.out.println(stringLongEntry.getKey() + " - > " + stringLongEntry.getValue()));
        } catch (
                IOException e) {
            System.out.println("this book is not available");

        }
    }
}
