package Collection.HashMap;

import MultiServer.HW17.Client;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities);

//        capitalCities.remove("England");
//        capitalCities.get("England");
//        capitalCities.clear();

//        System.out.println( capitalCities.size());


        // Print keys// Use the keySet() method if you only want the keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

//        // use the values() method if you only want the values:
//        for (String i : capitalCities.values()) {
//            System.out.println(i);
//        }
//        // Print keys and values
//        for (String i : capitalCities.keySet()) {
//            System.out.println("key: " + i + " value: " + capitalCities.get(i));
//        }

        System.out.println(getKeys(capitalCities,"London"));
    }

    public static String getKeys(HashMap<String, String> capitalCities, String value) {
        for (String a : capitalCities.keySet())  {
            if (capitalCities.get(a).equals(value))
                return a;
        }
        return null;
    }
}

