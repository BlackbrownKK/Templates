package generic.Wildcard;

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

    public boolean equalsDiv(Div<?> data) {
        return (this.perform() == data.perform());
    }
}

