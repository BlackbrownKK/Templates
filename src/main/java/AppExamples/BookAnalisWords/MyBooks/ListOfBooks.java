package AppExamples.BookAnalisWords.MyBooks;

import java.util.HashMap;
import java.util.Map;

public class ListOfBooks {
    public static Map<String, String> myBooks() {

        String path1 = "JavaPro13.09.2022/src/MyBooks/BremenMusic.txt";
        String path2 = "JavaPro13.09.2022/src/MyBooks/Gruffalo.txt";
        String path3 = "JavaPro13.09.2022/src/MyBooks/Pinocchio.txt";

        Map<String, String> myBooks = new HashMap<>();

        myBooks.put("BremenMusic.txt", path1);
        myBooks.put("Gruffalo.txt", path2);
        myBooks.put("Pinocchio.txt", path3);

        return myBooks;
    }
}
