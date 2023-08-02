package Classes_Inner;

public class OuterClassK {
    // статический вложенный класс
    static class NestClass     {
        void showData() {
            System.out.println("Тайная информация...");
        }

        public static void main(String[] args) {
            OuterClassK f = new OuterClassK();
            OuterClassK.NestClass nestClass = new OuterClassK.NestClass();
            nestClass.showData();

        }
    }
}
