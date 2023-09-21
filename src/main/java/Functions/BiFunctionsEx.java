package Functions;

import java.util.function.BiFunction;

public class BiFunctionsEx {

    public static Integer combinet(BiFunction<Integer, Integer, Integer> comb) {
        return comb.apply(2, 2);
    }

    public static void main(String[] args) {

        System.out.println(BiFunctionsEx.combinet((x, y) -> 2 * x + 2 * y));

        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(35235, 532352));

        TriFunctions<Integer, Integer, Integer, Integer> addTree = (x, y, z) -> x + y + z;
        System.out.println(addTree.apply(2, 5, 7));

        NoArgFunctions<String> sayHello = () -> "Hello";
        System.out.println(sayHello.apply());


    }
}
