package Controls;

// Пример множественное условие "и"
// без альтернативы вывода.
// Вывода нет, т.к. &&.
// && — логическая операция сокращенного
// вычисления, сокращенная
// конъюнкция (conditional-AND).
public class IfElse04 {

    public static void main(String[] args) {

        int d = 5;
        int e = 4;

        if (d > e && d < 6) {
            System.out.println("d is greater than e and is greater than 6.");
        }
    }
}
