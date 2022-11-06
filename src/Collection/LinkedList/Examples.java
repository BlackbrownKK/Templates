package Collection.LinkedList;

import java.util.LinkedList;

public class Examples {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.addFirst("Reno");
        cars.addLast("Pego");
//        cars.removeFirst();
//        cars.removeLast();

        System.out.println(cars);

        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

    }


}

