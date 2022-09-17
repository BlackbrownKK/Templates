package Controls;

import java.util.Scanner;

// Проверка количества доставки.
public class CheckDelivery {

    static Scanner scanner;
    static int quotaPlan;
    static int quotaFact;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.print("Enter delivery plan (pcs): ");
        quotaPlan = scanner.nextInt();
        System.out.print("Enter delivery fact (pcs): ");
        quotaFact = scanner.nextInt();
        scanner.close();

        System.out.println("Result:");
        if (quotaFact < quotaPlan)
            System.out.println("Less delivered. " + quotaFact + " items");
        else if (quotaFact > quotaPlan)
            System.out.println("More delivered. " + quotaFact + " items");
        else
            System.out.println("Exact delivery. " + quotaFact + " items");
    }
}
