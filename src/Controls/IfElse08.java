package Controls;

// Пример выбор расчета.
// Если переменная alfa <= 100,
// то beta = alfa * 0.1,
// иначе если alfa > 100 и alfa <= 300,
// то beta = alfa * 0.3,
// иначе beta = alfa * 0.5.
public class IfElse08 {

    public static void main(String[] args) {

        int alfa = 120;
        double beta;

        if (alfa <= 100) {
            beta = alfa * 0.1;
            System.out.println("Value is " + beta);
        } else if (alfa > 100 && alfa <= 300) {
            beta = alfa * 0.3;
            System.out.println("Value is " + beta);
        } else {
            beta = alfa * 0.5;
            System.out.println("Value is " + beta);
        }
    }
}
