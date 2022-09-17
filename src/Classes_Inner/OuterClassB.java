package Classes_Inner;

/*
Чтобы создать экземпляр внутреннего класса,
должен быть экземпляр внешнего класса.
Экземпляр внутреннего класса может быть создан только
из экземпляра внешнего класса.
*/

// Внешний/включающий класс
public class OuterClassB {

    private int x = 8;

    public static void main(String[] args) {
        OuterClassB outer = new OuterClassB();
        outer.handleInnerClass();
    }

    public void handleInnerClass() {
        InnerClassB inner = new InnerClassB();
        inner.showValue();
    }

    // Внутренний класс
    class InnerClassB {
        public void showValue() {
            System.out.println("Значение: " + x);
        }
    }
}
