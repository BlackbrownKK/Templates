package ArithmeticOperator;

// Арифметические бинарные операторы
public class ArithmeticOperatorA {

    public static void main(String[] args) {

        // Объявление и инициализация переменных
        int num1 = 102;
        int num2 = 25;

        // Сложение
        int res1 = num1 + num2;
        System.out.println("Оператор +  " + res1);

        // Вычитание
        int res2 = num1 - num2;
        System.out.println("Оператор -  " + res2);

        // Умножение
        int res3 = num1 * num2;
        System.out.println("Оператор *  " + res3);

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
        double res4 = num1 / num2;
        System.out.println("Оператор /  " + res4);
        // Если вы хотите выполнить деление с плавающей запятой,
        // вы должны перед делением привести int num1 ко float
        double res41 = ((float) num1) / num2;
        System.out.println("Оператор /  (приведение) " + res41);

        // Взятия остатка
        double res5 = num1 % num2;
        System.out.println("Оператор %  " + res5);
    }
}
