package Methods;

public class OverloadDemo {

    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }


    //Перегружаемый метод, проверяющий наличие двух целочисленных параметров
    void test(int а, int b) {
        System.out.println("a и Ь: " + а +  " " + b);
    }


    // Перегружаемый метод, проверяющий наличие параметра типа double
    void test(double а) {
        System.out.println("Bнyтpeннee преобразование при вызове" + "test(douЬle) а:" + а);


    }

    public static void main(String[] args) {


        OverloadDemo оЬ = new OverloadDemo();
        int i = 88;
        оЬ.test();
        оЬ.test(10, 20);
        оЬ.test(i); //здесь вызывается вариант метода test(double)
        оЬ.test(123.2); //и здесь вызывается вариа метода test (double)
    }
}
