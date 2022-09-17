package Classes_Inner;

// Реализация анонимного класса
// чарез интерфейс.
public class OuterClassH {

    public static void main(String[] args) {

        IData obj = new IData() {
            @Override
            public void showData() {
                System.out.println("Super данные!!");
            }
        }; // <- наличие ; !!!

//         реализация через лямбду
//         IData obj = () -> System.out.println("Super данные!!");

        obj.showData();
    }
}
