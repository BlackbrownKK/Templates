package ArithmeticOperator;

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
        System.out.println("Оператор +  " + res);

        // Вычитание
        res = num1 - num2;
        System.out.println("Оператор -  " + res);

        // Умножение
        res = num1 * num2;
        System.out.println("Оператор *  " + res);

        // Деление.
        //
        // WARNING
        // 'num1 / num2': integer division in floating-point context
        //
        // Объяснение:
        // https://stackoverflow.com/questions/30343408/integer-division-to-float-result
        // Когда вы делите два целых числа, вы выполняете
        // целочисленное деление, что в данном случае даст 22/64 = 0.
        // Только после этого вы создаете число с плавающей запятой.
        // И представление с плавающей запятой 0 равно 0,0.
        res = num1 / num2;
        System.out.println("Оператор /  " + res);
        // Если вы хотите выполнить деление с плавающей запятой,
        // вы должны перед делением привести int num1 ко float
        res = ((float) num1) / num2;
        System.out.println("Оператор /  (приведение) " + res);

        // Взятия остатка
        res = num1 % num2;
        System.out.println("Оператор %  " + res);
    }
}
