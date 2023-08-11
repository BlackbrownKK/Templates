package generic.ex02;

public class Div<T extends Number> {
    private T x;
    private T y;

    Div(T a, T b) {
        x = a;
        y = b;
    }

    public int perform() {
        return (int) (x.doubleValue() / y.doubleValue());
    }
}