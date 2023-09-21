package Stream.streamPlusLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx01 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfInt = new ArrayList<>(Arrays.asList(intArray));
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        List<Integer> events = listOfInt.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(events);
    }
}
