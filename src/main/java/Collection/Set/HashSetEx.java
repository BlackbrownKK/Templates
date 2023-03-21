package Collection.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        HashSet<String> carsSorted = new HashSet<String>();
        System.out.println(cars); // []
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars); // [Volvo, Mazda, Ford, BMW]

        TreeSet myTreeSet = new TreeSet();
        myTreeSet.addAll(cars);
        System.out.println(myTreeSet); //   [BMW, Ford, Mazda, Volvo]

        carsSorted.stream()
                .sorted() //comparator - how you want to sort it
                .collect(Collectors.toList()); //collector - what you want to collect it to
        System.out.println(carsSorted);
    }
}
