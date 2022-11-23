package Classes_Inner;

/*
Класс, созданный внутри метода, называется
локальным внутренним классом.

Локальный внутренний класс не может быть вызван
извне метода.

Локальный внутренний класс не может получить доступ к
non-final локальной переменной до JDK 1.7.
Начиная с JDK 1.8, можно получить доступ к non-final
локальной переменной в локальном внутреннем классе.
*/


public class OuterClassE {

    private static int x;

    public static void main(String[] args) {
        OuterClassE outer = new OuterClassE();
        outer.handleData();
    }

    public void handleData() {

        // Локальная переменная.
        String name = "Tom";

        // Локальный внутренний класс.
        // Внутренний класс, определенный внутри
        // метода внешнего класса.
        class InnerClassE {
            public void showData() {
                x = 8;
                System.out.println("Value: " + x);
                System.out.println("Name: " + name);
            }
        }

        // Если хотите вызвать методы локального внутреннего
        // класса, необходимо создать экземпляр этого класса
        // внутри метода.
        InnerClassE inner = new InnerClassE();
        inner.showData();
    }
}
