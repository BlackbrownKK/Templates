package Enums.demo_02;

// Калькулятор с использованием enum
public class Result {

    static Actions action;
    static double num1;
    static double num2;
    static double result;

    public static void main(String[] args) {

        num1 = 6;
        num2 = 2;
        action = Actions.ADD;

        switch (action) {
            case ADD -> {
                result = num1 + num2;
                System.out.println(result);
            }
            case SUBTRACT -> {
                result = num1 - num2;
                System.out.println(result);
            }
            case MULTIPLY -> {
                result = num1 * num2;
                System.out.println(result);
            }
            case DIVIDE -> {
                result = num1 / num2;
                System.out.println(result);
            }
            default -> System.out.println("Неопределено!");
        }
    }
}
