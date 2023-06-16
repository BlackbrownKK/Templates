package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo3 {
    public static void main(String[] args) {
        // Теперь это список числовых значений типа 'ctouЫe
        ArrayList<Double> rnyList = new ArrayList<>();
        rnyList.add(2.0);
        rnyList.add(18.0);
        rnyList.add(10.0);
        rnyList.add(24.0);
        rnyList.add(17.0);
        rnyList.add(3.0);
        /*
        We can achieve this by adding the parallel method to a sequential stream or by creating a stream using
        the parallelStream method of a collection:
         */
        rnyList.stream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );
        /*
        Parallel streams enable us to execute code in parallel on separate cores.
        The final result is the combination of each individual outcome.
         */
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);

        listOfNumbers.parallelStream().forEach(number ->
                System.out.println(number*2 + " " + Thread.currentThread().getName()  )
        );


//        double productOfSqrRoots = rnyList.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);
//        double productOfSqrRoots = rnyList.parallelStream().reduce(1.0, (a, b) -> a + 2*b, (a, b) -> a * b);
//        double productOfSqrRoots1 = rnyList.parallelStream().count(1.0, (a,b) -> a+b, (a, b) -> a * b);
//        System.out.println("Пpoизвeдeниe квадратных корней:  " + productOfSqrRoots);
    }
}
