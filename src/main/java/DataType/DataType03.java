package DataType;

// Продвижение типа в выражениях
public class DataType03 {

    public static void main(String[] args) {

        // Одновременное декларирование и
        // инициализация переменных
        byte b = 23;
        char c = 'g';
        short s = 1019;
        int i = 30000;
        float f = 6.57f;
        double d = .1299;

        // Предварительно, для наглядности, выведем значения переменных
        // до преобразования в арифметическом выражении. Должны получить
        // те значения, которые присвоили этим переменным.
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("d = " + d);

        // Просто заглушка-разделитель, для читабельности вывода
        System.out.println("----------------------------");

        // Запишем выражение, результат которого будет присвоен
        // переменной result типа double.
        double result = (f * b) + (i / c) - (d * s);

        // Вывод результата вычислений в арифметическом
        // выражении. В выводе должны получить значение
        // типа double (здесь, это тип переменной result), со
        // множеством цифр после десятичного разделителя.
        System.out.println("result = " + result);

        // ОДНАКО. Если с числовыми переменными должно быть
        // понятно как же они участвовали в арифметическом выражении,
        // то с участием переменной с, которая - символьная (тип char),
        // не все так очевидно. Но дело в том, что в арифметическом выражении
        // произошло преобразование типа char до типа int, а именно до числового
        // значения кода символа. Чтобы выполнить арифметические операции,
        // символ 'g' был преобразован в его значение ASCII, которое равно 103.

        // ASCII - American Standard Code for Information Interchange.
        // Это 7-битный набор символов, содержащий 128 (от 0 до 127) символов.
        // Представляет собой числовое значение символа.

        // Просто заглушка-разделитель, для читабельности вывода
        System.out.println("----------------------------");

        // Для проверки, выведем код символа, который присвоен переменной с.
        // Но вывод сделаем уже приведенной к типу int переменной с,
        System.out.println("character code g this is " + (int) c);
        // иначе выведется просто символ, а не код.
        System.out.println("variable with is a symbol " + c);
    }
}