package Functions;

import java.util.function.Function;

public class FunctionsExamples {

    protected static class myMath {
        public static Integer triple(Integer x) {
            return x * 3;
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer> myTriple = myMath::triple;
        Integer res = myTriple.apply(5);
        System.out.println(res);

        Function<Integer, Integer> abcValue = (x) -> x < 0 ? - x : x;
        System.out.println(abcValue.apply(-6));
    }


}
