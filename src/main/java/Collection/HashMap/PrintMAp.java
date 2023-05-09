package Collection.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintMAp {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("MAP", 3);
        map.put("P", 1);
        map.put("DCFV", 4);
        map.put("FG", 2);


        map.forEach((key, value) -> System.out.println(key + ":" + value));
/*
        P 1
        DCFV 4
        FG 2
        MAP 3
 */
        System.out.println(map); // 2  --- {P=1, DCFV=4, FG=2, MAP=3}
        System.out.println(Arrays.asList(map)); // 3  --- {P=1, DCFV=4, FG=2, MAP=3}
        System.out.println();
        for (Object obj : map.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.print("Key: " + entry.getKey());
            System.out.println(", Value: " + entry.getValue());
        }
        /*
        Key: P, Value: 1
        Key: DCFV, Value: 4
        Key: FG, Value: 2
        Key: MAP, Value: 3
         */
        System.out.println();


    }
}
