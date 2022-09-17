package Controls;

// Пример с альтернативой.
// Состоит из логических выражений (ЛВ)
// со своим вариантом
// исполнения операторов.
public class IfElse03 {

    public static void main(String[] args) {

        int c = 95;

        if (c < 25) { // в () ЛВ1
            // Операторы выполняются, если ЛВ1 - true
            System.out.println("Value " + c + " is less.");
        } else if (c > 25) { // в () ЛВ2
            // Выполнение, если ЛВ1 - false, ЛВ2 - true
            System.out.println("Value " + c + " is greater.");
        } else {
            // Выполнение, если ЛВ1 – false, ЛВ2 - false
            System.out.println("Values are equal.");
        }
    }
}
