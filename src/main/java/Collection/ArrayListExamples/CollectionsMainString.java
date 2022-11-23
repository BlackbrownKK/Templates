package Collection.ArrayListExamples;

import java.util.ArrayList;

public class CollectionsMainString {


    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        java.util.Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
