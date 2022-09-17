package Controls;

// Оператор if.
// Состоит из логического выражения, после которого
// следует один или более операторов.
public class IfElse01 {

    public static void main(String[] args) {

        int a = 15;

        // Всегда истинно, без альтернативы.
        if (a < 25) { // в () логическое выражение
            // Операторы в {} выполняются, если истинно
            System.out.println("Operator if.");
        }
    }
}
