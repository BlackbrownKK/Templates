package Classes_Inner;

// Реализация анонимного класса
// чарез абстрактный.
public class OuterClassG {

    public static void main(String[] args) {

        SomeClassG obj = new SomeClassG() {
            public void showData() {
                System.out.println("Секретные данные!!");
            }
        }; // <- наличие ; !!!

        obj.showData();
    }
}
