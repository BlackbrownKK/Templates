package Interfaces.app_Broker;
import java.util.Scanner;
// Исправьте ошибки компиляции.
public class App {

    static String brokerName;
    static String email;
    static String phone;
    static String productName;
    static int quantity;
    static double price;
    static String roundBonus;
    static ProductA product;
    static BrokerA broker;
    static String infoBroker;
    static String infoProduct;



    public static void main(String[] args) {
        doInputs();
        showData(processData());
    }

    private static void doInputs() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter name: ");
        brokerName = validate(scan);
        System.out.println("Please enter email: ");
        email = validate(scan);
        System.out.println("Please enter phone: ");
        phone = validate(scan);
        System.out.println("Please enter productName: ");
        productName = validate(scan);
        System.out.println("Please enter quantity: ");
        quantity = validateQuantityInput(scan);
        System.out.println("Please enter price: ");
        price =  validatePriceQuantityInput(scan);
        // Релизуйте ввод значений через Scanner
    }


    private static String processData() {
        broker = new BrokerA(brokerName, phone, email);
        infoBroker = broker.infoBroker();
        product = new ProductA(productName, quantity, price);
        infoProduct = product.infoProduct();
        double sales = product.calcSales(quantity, price);
        roundBonus = Rounder.roundValue(broker.calcCommission(sales));
        return infoBroker + infoProduct + "\nBonus (USD.): " + roundBonus;
    }

    private static void showData(String output) {
        System.out.println(output);
    }
    //   вализация вводимых значений через Scanner
    private static String validate(Scanner scan) {
        String str = scan.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println("Empty, enter product name: ");
            str = scan.nextLine().trim();
        }
        return str;
    }
    private static int validateQuantityInput(Scanner scan) {
        while (!scan.hasNextInt()) {
            String str = scan.nextLine().trim();
            System.out.printf("\"%s\" -it is not a number\n", str);
            System.out.println("Enter quantity of units: ");
        }
        int quantity = scan.nextInt();
        while (quantity <= 0) {
            System.out.println("Incorrect value, enter quantity: ");
            while (!scan.hasNextInt()) {
                String str = scan.next().trim();
                System.out.printf("\"%s\" - not a number\n", str);
                System.out.println("Enter quantity: ");
            }
            quantity = scan.nextInt();
        }
        return quantity;
    }

    // валидация ввода цены

    private static float validatePriceQuantityInput(Scanner scan) {
        while (!scan.hasNextFloat()) {
            String str = scan.nextLine().trim();
            System.out.printf("\"%s\" - not a number!\n", str);
            System.out.println("Enter price: ");
        }
        float price = scan.nextFloat();
        while (price <= 0) {
            System.out.println("Incorrect value, enter price: ");
            while (!scan.hasNextFloat()) {
                String str = scan.nextLine().trim();
                System.out.printf("\"%s\" - not a number!\n", str);
                System.out.println("Enter price: ");
            }
            price = scan.nextFloat();
        }
        return price;
    }
}
