package Collection.HashMap.codingbat;

import java.util.HashMap;
import java.util.Map;

public class Topping {
    public static void main(String[] args) {
/*

Given a map of food keys and topping values, modify and return the map as follows:
if the key "ice cream" is present, set its value to "cherry". In all cases, set the
key "bread" to have the value "butter".

topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
 */

        Map<String, String> mapBully1 = new HashMap<>();
        mapBully1.put("ice cream", "peanuts");
        topping1(mapBully1);
        System.out.println();
        Map<String, String> mapBully2 = new HashMap<>();
        mapBully2.put("bread", "butter");
        topping1(mapBully2);
        System.out.println();
        Map<String, String> mapBully3 = new HashMap<>();
        mapBully3.put("pancake", "syrup");
        topping1(mapBully3);
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");

        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        for (String i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));

        }
        return map;
    }
}

