package Collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MainIteratorString {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        // Make a collection
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Honda");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Suzuki");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        // System.out.println(it.next());
        // Print the next item
        //  System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
