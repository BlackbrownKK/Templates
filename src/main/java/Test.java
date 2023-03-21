import java.util.*;

public class Test {
//    Create a method that takes a Map<String,
//    String> and return the values as a
//    separate array. Return the keys sorted
//    alphabetically, and their corresponding values in the same order.

    public static void main(String[] args) {

        Map<String, String> states = new HashMap<String, String>();
        states.put("a", "Germany");
        states.put("b", "Spain");
        states.put("c", "France");
        states.put("d", "Italy");
        for (String k : states.values()) {
            System.out.println(k);
        }
        Arrays.stream(getValues(states)).forEach(System.out::println);
        Arrays.stream(getValues2(states)).forEach(System.out::println);
    }

    public static String[] getValues2(Map<String, String> map) {
        ArrayList<String> csca= new ArrayList<>(map.values());
        return csca.toArray(new String[0]);
    }



    public static String[] getValues(Map<String, String> map) {
        int i = map.size();
        String[] newResult = new String[i];
        for (int j = 0; j < newResult.length; j++) {
            for (String k : map.values()) {
                newResult[j] = k;
                j++;
            }
        }
        return newResult;
    }
}
