package Functions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
public class ReduceEx {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfInt = new ArrayList<>(Arrays.asList(intArray));

        BinaryOperator<Integer> getSum = (i, x) -> {
            Integer res = i + x;
            System.out.println(res);
            return res;
        };

        Integer sum = listOfInt.stream().reduce(0, getSum);
        System.out.println(sum);
    }

     // return intStream.sum(); - so good!
}
