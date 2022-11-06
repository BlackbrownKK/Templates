package Stream.StreamAPI.Lession18;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BookParser {
    private final String charsToRemove = "!?,.{}()";

    public Map<String, Integer> countWords(File file) {
        Map<String, Integer> result = new HashMap<>();
        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = removeCaracter(line);
                for (String word : words) {
                    if (word.length() < 3) continue;
                    if (result.containsKey(word)) result.put(word, result.get(word) + 1);
                    else result.put(word, 1);
                }
            }


        } catch (IOException e) {
            System.out.println("this book is not available");
        }
        return result;
    }

    private String[] removeCaracter(String line) {
        for (Character c : charsToRemove.toCharArray()) {
            line = line.replace(c.toString(), "");

        }
        return line.toLowerCase().split(" ");
    }
}

