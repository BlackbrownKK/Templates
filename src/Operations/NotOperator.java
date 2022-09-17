package Operations;

// NOT-оператор (!).
// Используется для преобразования истины в ложь
// или наоборот. По сути, он меняет логическое
// состояние операнда на противоположное.
public class NotOperator {

    public static void main(String[] args) {

        // объявление и инициализация переменных
        boolean cond = true;
        int a = 12;
        int b = 5;

        // до применения NOT-оператора
        System.out.println("cond : " + cond);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // после применения NOT-оператора
        System.out.println("Теперь cond : " + !cond);
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
    }
}
