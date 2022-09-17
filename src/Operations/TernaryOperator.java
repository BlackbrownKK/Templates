package Operations;

// Тернарный оператор.
// Синтаксис:
// variable num1 = (expression) ? value if true : value if false
public class TernaryOperator {

    public static void main(String[] args) {
        int num1;
        int num2;
        num1 = 25;

        // num1 не равно 10, то num2 присваивается 950
        num2 = (num1 == 10) ? 500 : 950;
        System.out.println("num2: " + num2);

        // num1 равно 25, то num2 присваивается 500
        num2 = (num1 == 25) ? 500 : 950;
            System.out.println("num2: " + num2);
    }
}
