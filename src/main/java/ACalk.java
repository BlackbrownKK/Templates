import java.util.InputMismatchException;
import java.util.Scanner;

public class ACalk {

    static int x;
    static int y;
    static String action;

    public static void main(String[] args) {
        inputValid();
        switch (action) {
            case "+":
                System.out.println("result " + plus(x, y));
                break;
            case "-":
                System.out.println("result " + minus(x, y));
                break;
            case "*":
                System.out.println("result " + multi(x, y));
                break;
            case "/":
                System.out.println("result " + dev(x, y));
                break;
            default:
                System.out.println("falschre input");
        }
    }

    private static void inputValid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one");

        try {
             x = sc.nextInt();
            System.out.println("Enter number two");
             y = sc.nextInt();
            sc.close();

            System.out.println("Enter action +   -   *   /   ");
            Scanner sc2 = new Scanner(System.in);
            action = sc2.nextLine();
            sc2.close();

        } catch (InputMismatchException exception) {
            System.out.println("incorrect input");
            inputValid();
        }

    }

    private static int plus(int x, int y) {
        return x + y;
    }

    private static int minus(int x, int y) {
        return x - y;
    }

    private static int multi(int x, int y) {
        return x * y;
    }

    private static int dev(int x, int y) {
        if (y == 0) return 0;
        return x / y;
    }




}
