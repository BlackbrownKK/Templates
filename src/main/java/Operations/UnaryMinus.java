package Operations;

// Унарный минус (-). Для преобразования отрицательного
// значения в положительное.
// Унарный оператор.Требуется только один операнд.
public class UnaryMinus {

    public static void main(String[] args) {

        // объявление и инициализация переменной
        int a = 18;
        System.out.println("a = " + a);

        // применение унарного оператора
        a = -a;
        System.out.println("a = " + a);

    }
}
