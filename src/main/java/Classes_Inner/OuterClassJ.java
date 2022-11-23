package Classes_Inner;

// Если есть статический член внутри статического
// вложенного класса, не нужно создавать экземпляр
// статического вложенного класса.
public class OuterClassJ {

    static int value = 32;

    static class InnerClassJ {
        // статический член/метод
        static void showData() {
            System.out.println("Значение: " + value);
        }
    }

    public static void main(String[] args) {
        InnerClassJ.showData();
    }
}
