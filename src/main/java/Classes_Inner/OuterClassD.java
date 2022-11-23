package Classes_Inner;

// Создание внутреннего класса извне включающего класса.
// Вызов метода внутреннего класса.
public class OuterClassD {

    public static void main(String[] args) {

        OuterClassC.InnerClassC inner = new OuterClassC().new InnerClassC();
        inner.showValue();
    }
}
