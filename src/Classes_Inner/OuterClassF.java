package Classes_Inner;

// Реализация анонимного класса
public class OuterClassF {

    public static void main(String[] args) {

        // Класс создается, но его имя определяется компилятором,
        // который расширяет класс SomeClassF и обеспечивает реализацию
        // метода showData().
        // Создается объект анонимного класса, на который ссылается
        // ссылочная переменная obj типа SomeClassF.
        SomeClassF obj = new SomeClassF() {
            public void showData() {
                System.out.println("Не просто данные");
            }
        }; // <- наличие ; !!!

        obj.showData();
    }
}
