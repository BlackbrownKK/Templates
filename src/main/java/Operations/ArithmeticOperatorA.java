package Operations;

// Арифметические бинарные операторы
public class ArithmeticOperatorA {

    public static void main(String[] args) {

        // Объявление и инициализация переменных
        int num1 = 102;
        int num2 = 25;

        // Сложение
        int res1 = num1 + num2;
        System.out.println("operator +  " + res1);

        // Вычитание
        int res2 = num1 - num2;
        System.out.println("operator -  " + res2);

        // Умножение
        int res3 = num1 * num2;
        System.out.println("operator *  " + res3);

        // Деление
        double res4 = num1 / num2;
        System.out.println("operator /  " + res4);

        // Взятия остатка
        double res5 = num1 % num2;
        System.out.println("operator %  " + res5);
    }
}
