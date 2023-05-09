package AppExamples.BookAnalisWords;


import Stream.StreamAPI.Lession18.Pair;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunApp {

    public static void main(String[] args) {
        String path1 = "JavaPro13.09.2022/src/MyBooks/BremenMusic.txt";
        String path2 = "JavaPro13.09.2022/src/MyBooks/Gruffalo.txt";
        String path3 = "JavaPro13.09.2022/src/MyBooks/Pinocchio.txt";

        Map<String, String> myBooks = new HashMap<>();

        myBooks.put("BremenMusic.txt", path1);
        myBooks.put("Gruffalo.txt", path2);
        myBooks.put("Pinocchio.txt", path3);


    }
}
//
//
//    public static String openBook() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter book name: ");
//        String bookName = scanner.nextLine();
//        scanner.close();
//        return bookName;
//    }
//
//    public static void wordsCalk(File file) {
//        Map<String, Integer> map = new HashMap<>();
//        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
//
//            String wordsInLine;
//            while ((wordsInLine = bufferedReader.readLine()) != null) {
//                String[] goodWords = removeBadSymbols(wordsInLine);
//                for (String word : goodWords) {
//                    if (word.length() < 3) continue;
//                    if (map.containsKey(word)) map.put(word, map.get(word) + 1);
//                    else map.put(word, 1);
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("111");
//        }
//    }
//
//
//
//        public static String[] removeBadSymbols(String wordiInTextLine) {
//        String symbolsToRemove = "!?,.{}()[]:;";
//        for (Character c : symbolsToRemove.toCharArray()) {
//            wordiInTextLine = wordiInTextLine.replace(c.toString(), "");
//        }
//        return wordiInTextLine.toLowerCase().split(" ");
//    }
//
//
//    public static void app(Map<String, Integer> map) {
//        PriorityQueue<Pair<String, Integer>> pairs = new PriorityQueue<>((Pair<String, Integer> first, Pair<String,
//                Integer> second) -> second.getRight() - first.getRight());
//
//        map.forEach((String key, Integer value) -> pairs.add(new Pair<>(key, value)));
//
//        for (int i = 0; i < 10 && i < pairs.size(); i++) {
//            Pair<String, Integer> peek = pairs.poll();
//            System.out.println(peek.getLeft() + " -> " + peek.getRight());
//
//        }
//    }
//
//
//    public int countUniqueWords( Map<String,Integer> uniqueWord) {
//         uniqueWord = new HashMap<>();
//        for (String word:words){
//            word = word.toUpperCase();
//            if(!uniqueWord.containsKey(word) && word.length() > 2){
//                uniqueWord.put(word,1);
//            } else {
//                uniqueWord.remove(word);
//            }
//        }
//        return uniqueWord.size();
//    }




