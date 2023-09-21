package Stream.streamPlusLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        Integer[] intArray ={1,2,3,4,5,6,7,8,9 };
        List<Integer> listOfInt = new ArrayList<>(Arrays.asList(intArray));

        Function<Integer, Integer> timesTwo = (x) -> x*2;

        List<Integer> result  = listOfInt.stream().map(timesTwo).collect(Collectors.toList());

        System.out.println(result);
    }
}
