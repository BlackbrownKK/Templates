package Controls;

// Пример № 5 (множественное условие "или"
// без альтернативы вывода)
// Вывод есть, т.к. ||.
// || — логическая операция сокращенного вычисления,
// сокращенная дизъюнкция (conditional-OR).
public class IfElse05 {

    public static void main(String[] args) {

        int f = 9;
        int g = 5;

        if (f > g || f < 6) {
            System.out.println("f is greater than t or is greater than 6.");
        }
    }
}
