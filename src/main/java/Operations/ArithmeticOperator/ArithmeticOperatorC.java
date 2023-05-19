package Operations.ArithmeticOperator;

public class ArithmeticOperatorC {

    // Объявление переменных вне метода main.
    // Переменные этого класса.
    static double num1;
    static double num2;
    static double res;

    public static void main(String[] args) {

        // Инициализация переменных
        num1 = 102;
        num2 = 25;

        // Сложение
        res = num1 + num2;
        System.out.println("Оператор +  " + res);

        // Вычитание
        res = num1 - num2;
        System.out.println("Оператор -  " + res);

        // Умножение
        res = num1 * num2;
        System.out.println("Оператор *  " + res);

        // Деление.
        // NO WARNING
        // 'num1 / num2': integer division in floating-point context
        // Делим double на double
        res = num1 / num2;
        System.out.println("Оператор /  " + res);

        // Взятия остатка
        res = num1 % num2;
        System.out.println("Оператор %  " + res);
    }
}
