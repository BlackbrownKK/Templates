package Controls;

// Конструкция if - else (с альтернативой).
// Состоит из логического выражения, после которого следует
// один или более операторов, а также выполнения альтернативных
// операторов.
public class IfElse02 {

    public static void main(String[] args) {

        int b = 95;

        if (b < 25) {
            System.out.println("The value is less.");
        } else {
            System.out.println("The value is greater.");
        }

        // Если в блоке после if или else всего
        // одна команда, заключать
        // ее в блок из фигурных скобок
        // необязательно.
        int x = 15;

        if (x < 25) System.out.print("The value is less.");
        else System.out.print("The value is greater.");
    }
}
