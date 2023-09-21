package Functions;

import java.util.function.BiFunction;

public class BiFunctiojnsEx02 {

    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x,y) -> {
            if (y==0f) {
                System.out.println("Error: can`t divide by zero");
                return 0f;
            }
            return x/y;
        };
    }
}
