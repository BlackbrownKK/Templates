package Controls;

import java.util.Scanner;

// hasNextInt() проверяет является ли введеный тип int.
// hasNextFloat(), hasNextDouble() - можно проверить на float и double,
// соответственно.
public class CheckNumberInput {

    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("The number is " + number);
        } else {
            System.out.println("Invalid input. You need a number. " +
                    "Restart the program and try again!");
        }
    }
}
