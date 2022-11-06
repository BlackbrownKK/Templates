import java.util.Scanner;

public class Calk {

        public static void main(String[] args) {
            double num1 = getNumber();
            double num2 = getNumber();
            char operation = getOperation();
            double result = calc(num1, num2, operation);
            System.out.println("Result: " + result);
        }

        public static double getNumber() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("Incorrect! Try again...");
                return getNumber();
            }
        }

        public static char getOperation() {
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                    Select operation number:
                    1 - add
                    2 - subtract
                    3 - multiply
                    4 - divide
                    """);

                int operationNumber = sc.nextInt();

            switch (operationNumber) {
                case 1:
                    return '+';
                case 2:
                    return '-';
                case 3:
                    return '*';
                case 4:
                    return '/';
                default:
                    System.out.println("Wrong operation! Try again...");
                    return getOperation();
            }
        }

        public static double add(double num1, double num2) {
            return num1 + num2;
        }

        public static double sub(double num1, double num2) {
            return num1 - num2;
        }

        public static double mul(double num1, double num2) {
            return num1 * num2;
        }

        public static double div(double num1, double num2) {
            if (num2 != 0.0) {
                return num1 / num2;
            } else {
                System.out.println("You can't divide by zero!");
                return Double.NaN;
            }
        }

        public static double calc(double num1, double num2, char operation) {
            return switch (operation) {
                case '+' -> add(num1, num2);
                case '-' -> sub(num1, num2);
                case '*' -> mul(num1, num2);
                case '/' -> div(num1, num2);
                default -> Double.NaN;
            };
        }
    }