package Collection.HashMap.codingbat;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapAB2 {
    public static void main(String[] args) {
        Map<String, String>  abc = new HashMap<>();
        abc.put("a", "");
        abc.put("b", "");
        abc.put("c", "ccc");
        mapAB2(abc);

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
}
