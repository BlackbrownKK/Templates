package Collection.HashMap.codingbat;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapAB2 {
    public static void main(String[] args) {
        Map<String, String> abc = new HashMap<>();
        abc.put("a", "");
        abc.put("b", "");
        abc.put("c", "ccc");
        mapAB2(abc);
    }

    public static Map<String, String> mapAB3(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            return map;
        } else if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        } else if (map.containsKey("b")) {
            map.put("a", map.get("b"));
        }
        return map;
    }

    public static Map<String, String> mapShare(Map<String, String> map) {

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.remove("c");
            return map;
        } else if (!map.containsKey("a")) {
            map.remove("c");
            return map;
        }
        return map;
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {

        if ((map.containsKey("a") && map.containsKey("b")) && (map.get("a") == map.get("b"))) {
            map.remove("a");
            map.remove("b");
            for (String i : map.keySet()) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        return map;
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {

        if ((map.containsKey("a") && map.containsKey("b")) && (map.get("a").length() > map.get("b").length())) {
            map.put("c", map.get("a"));
            return map;
        } else if ((map.containsKey("a") && map.containsKey("b")) && (map.get("a").length() < map.get("b").length())) {
            map.put("c", map.get("b"));
            return map;
        } else if ((map.containsKey("a") && map.containsKey("b")) && (map.get("a").length() == map.get("b").length())) {
            map.put("a", map.get(""));
            map.put("b", map.get(""));
            return map;
        } else {
            return map;
        }
    }
}
