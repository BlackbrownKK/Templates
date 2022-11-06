package Collection.ArrayListExamples;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Ford");
        cars.add("Mazda");
        if (cars.get(2).equals(cars.get(3))) {
            cars.remove(3);
        }
        System.out.println(cars.size());
        System.out.println(cars);
        System.out.println();


        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println();
        for (String i : cars) {
            System.out.println(i);
        }


    }
}
