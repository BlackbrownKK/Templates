package Functions;

import java.util.function.Function;

public class FictionsFictions {


    public static Integer timesTwo(Integer x) {
        return x * 2;
    }

    public static Integer timesThree(Integer x) {
        return x * 3;
    }

    public static Integer timesFour(Integer x) {
        return x * 4;
    }


    public static Function<Integer, Integer> createmultipleir(Integer y) {
        return (Integer x) -> x * y;

    }

    public static void main(String[] args) {
        NoArgFunctions<NoArgFunctions<String>> createPrinter = () -> {
            return () -> "hello functions";
        };
        NoArgFunctions<String> printer = createPrinter.apply();

        System.out.println(printer.apply());


        Function<Integer, Integer> tomesWro = FictionsFictions.createmultipleir(2);
        Function<Integer, Integer> tomesThree = FictionsFictions.createmultipleir(3);
        Function<Integer, Integer> tomesFour = FictionsFictions.createmultipleir(4);

        System.out.println(tomesWro.apply(7));
        System.out.println(tomesThree.apply(7));
        System.out.println(tomesFour.apply(7));
    }
}
