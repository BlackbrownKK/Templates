package Operations;

// Логические операторы.
// Операторы сравнения
public class LogicalOperator {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 25;

        if (num1 == num2) {
            System.out.println("num1 and num2 equal");
        } else {
            System.out.println("num1 and num2 not equal");
        }

        if (num1 != num2) {
            System.out.println("num1 and num2 not equal");
        } else {
            System.out.println("num1 and num2 equal");
        }

        if (num1 > num2) {
            System.out.println("num1 more num2");
        } else {
            System.out.println("num1 not more num2");
        }

        if (num1 >= num2) {
            System.out.println("num1 more or equals num2");
        } else {
            System.out.println("num1 less num2");
        }

        if (num1 < num2) {
            System.out.println("num1 less num2");
        } else {
            System.out.println("num1 not less num2");
        }

        if (num1 <= num2) {
            System.out.println("num1 less or equals num2");
        } else {
            System.out.println("num1 more num2");
        }

    }
}
