package Collection.HashMap;

import Multithreading.Deadlock.B;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example02 {
    public static void main(String[] args) {
        // create an ArrayList which going to
        // contains a list of Numbers
        ArrayList<Integer> Numbers = new ArrayList<Integer>();

        // Add Number to list
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);

        // forEach method of ArrayList and
        // print numbers
        Numbers.forEach((n) -> System.out.println(n));
    }

    // https://codingbat.com/prob/p152303
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        if (!(strings.length == 0)) {
            map.put(strings[0], 0);
            for (int i = 1; i < strings.length; i++) {
                if (!map.containsKey(strings[i])) {
                    map.put(strings[i], 0);
                }
            }
        }
        return map;
    }

    public Map<String, Integer> word1(String[] strings) {

        Map<String, Integer> map = new HashMap(); // она хранит унакальные ключи!!!!!!!
        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }


    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        if (!(strings.length == 0)) {
            for (String sKey : strings) {
                if (!map.containsKey(sKey)) {
                    map.put(sKey, 0);
                } else {
                    int num = map.get(sKey);
                    num++;
                    map.put(sKey, num);
                }
            }
        }
        return map;
    }
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        if (!(strings.length == 0)) {
            for (String sKey : strings) {
                if (!map.containsKey(sKey)) {
                    map.put(sKey, false);
                } else {
                    map.put(sKey, true);
                }
            }
        }
        return map;
    }
}
