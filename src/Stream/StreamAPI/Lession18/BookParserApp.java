package Stream.StreamAPI.Lession18;

import java.io.File;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BookParserApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String patchPrefix = "src/Stream/StreamAPI/Lession18/text.txt";

        String fileName = "";

        BookParser bookParser = new BookParser();

        while (!fileName.equals("exit")) {
            System.out.println("Please enter the books name or exit to exit ");

            File file = new File(patchPrefix);

            PriorityQueue<Pair<String, Integer>> pairs = new PriorityQueue<>((Pair<String, Integer> first, Pair<String,
                    Integer> second) -> second.getRight() - first.getRight());
            Map<String, Integer> map = bookParser.countWords(file);
            map.forEach((String key, Integer value) -> pairs.add(new Pair<>(key, value)));

            for (int i = 0; i < 10 && i < pairs.size(); i++) {
                Pair<String, Integer> peek = pairs.poll();
                System.out.println(peek.getLeft() + " -> " + peek.getRight());

            }
            fileName = "exit";
        }
    }
}
//}

