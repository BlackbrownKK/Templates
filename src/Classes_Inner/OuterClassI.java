package Classes_Inner;

// Статический класс, созданный внутри класса,
// называется статическим вложенным классом.
// Он не может получить доступ к нестатическим
// элементам данных и методам.
// Доступ к нему можно получить по имени внешнего класса.
// Он может получить доступ к статическим элементам данных
// внешнего класса, включая private.
// Статический вложенный класс не может получить доступ к
// нестатическому (экземпляру) элементу данных или методу.
public class OuterClassI {

    static int value = 24;

    static class InnerClassI {
        void showData() {
            System.out.println("Значение: " + value);
        }
    }

    public static void main(String[] args) {
        InnerClassI obj = new InnerClassI();
        obj.showData();
    }
}
