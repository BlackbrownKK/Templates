package Controls;

import java.util.Scanner;

// Фильтруем наименования товаров.
public class FilterProducts {

    static Scanner scanner;
    static String productName;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        productName = scanner.nextLine().trim();

        switch (productName) {
            case "apple", "pear", "plum" -> System.out.println("Fruits");
            case "orange", "lemon" -> System.out.println("Citrus");
            default -> System.out.println("Undefined");
        }
    }
}
