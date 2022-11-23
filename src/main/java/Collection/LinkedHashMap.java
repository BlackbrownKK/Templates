package Collection;

import java.util.Map;

public class LinkedHashMap {


    public static void main(String[] args) {

        java.util.LinkedHashMap<String, Integer> map = new java.util.LinkedHashMap<>();

        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);

        StringBuilder result = new StringBuilder();
        int number = 1822;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            int quantity = number / value;
            number -= quantity * value;
            result.append(key.repeat(quantity));
        }

        System.out.println(result.toString()); // MDCCCXXII
        }
    }

