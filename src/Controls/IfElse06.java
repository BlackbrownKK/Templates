package Controls;

// Пример множественное условие "и"
// с альтернативой вывода
public class IfElse06 {

    public static void main(String[] args) {

        int h = 9;
        int i = 5;

        if (h > i && h > 6) {
            System.out.println("h is greater than i and is greater than 6.");
        } else System.out.println("h is less than i and is less than 6.");
    }
}
