package Classes_Inner;

// Реализация расчета во внутреннем классе
public class OuterClassC {

    private int x;
    private int y;
    private int z;

    public static void main(String[] args) {
        OuterClassC outer = new OuterClassC();
        outer.handleInnerClass();
    }

    public void handleInnerClass() {
        InnerClassC inner = new InnerClassC();
        inner.showValue();
    }

    // Внутренний класс
    class InnerClassC {
        public void showValue() {
            x = 8;
            y = 15;
            z = x + y;
            System.out.println("Значение: " + z);
        }
    }
}
