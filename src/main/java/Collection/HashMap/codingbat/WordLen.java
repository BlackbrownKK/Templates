package Collection.HashMap.codingbat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordLen {
    public static void main(String[] args) {
        String[] in = new String[]{"this", "and", "that", "and"};

//        wordLen01(in).entrySet().forEach(entry -> {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        });
        System.out.println(Arrays.asList(wordLen01(in)));

    }
    public static Map<String, Integer> wordLen01(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s:strings) {
            map.put(s, s.length());
        }
        return map;
    }

}
