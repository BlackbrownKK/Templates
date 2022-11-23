package Operations;

// Арифметические бинарные операторы
public class ArithmeticOperatorB {

    // Объявление переменных вне метода main.
    // Переменные этого класса.
    static int num1;
    static int num2;
    static double res;

    public static void main(String[] args) {

        // Инициализация переменных
        num1 = 102;
        num2 = 25;

        // Сложение
        res = num1 + num2;
        System.out.println("operator +  " + res);

        // Вычитание
        res = num1 - num2;
        System.out.println("operator -  " + res);

        // Умножение
        res = num1 * num2;
        System.out.println("operator *  " + res);

        // Деление
        res = num1 / num2;
        System.out.println("operator /  " + res);

        // Взятия остатка
        res = num1 % num2;
        System.out.println("operator %  " + res);
    }
}
