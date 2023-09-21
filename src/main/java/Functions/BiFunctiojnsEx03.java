package Functions;

import java.util.function.BiFunction;
import java.util.function.Function;
public class BiFunctiojnsEx03 {
    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;
        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondIsntZeroCheck =
                (funk) -> (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Error");
                        return 0f;
                    }
                    return (funk).apply(x, y);
                };
        BiFunction<Float, Float, Float> divideSafe = secondIsntZeroCheck.apply(divide);
        System.out.println(divideSafe.apply(10f, 0f));
    }
}
