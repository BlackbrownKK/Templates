package Classes;
// @autor Kostenyuk Konstantin
// @version 1.1.0

import java.util.Scanner;

public class ProductInfo {

    static String name; // наименование товара
    static int quantity; // количество товара
    static double price; // цена товара
    static double taxRate; // ставка налога, равна 5%
    static Product product; // переменная типа Product
    static double income; // доход
    static double tax; // налог


    public static void main(String[] args) {

        // вызвал метод инициализации переменных
        initVars();

        product = new Product();

        // установил значения через setters.
        product.setName(name);
        product.setQuantity(quantity);
        product.setPrice(price);

        // получил значения через getters*/);
        income = calculateIncome(product.getQuantity(),product.getPrice());

        tax = calculateTax(income, taxRate);

        // вывод данных сделал отдельным методом
        showData();
    }

    // Метод инициализации переменных через scanner
    private static void initVars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of unit: ");
        name = scanner.nextLine();
        System.out.print("Enter quantity of unit sold: ");
        quantity = scanner.nextInt();
        System.out.print("Enter price for one unit (USD): ");
        price = scanner.nextDouble();
        System.out.print("Enter tax rate (%): ");
        taxRate = scanner.nextDouble();
        System.out.print("---------------------------");
    }

    //  Метод рассчета дохода
    private static double calculateIncome(int qnty, double price) {
        return qnty * price;
    }

    // Метод рассчета налога
    private static double calculateTax(double income, double taxRate) {
        return income * taxRate / 100;
    }

    // Метод вывода данных
    private static void showData() {
        System.out.printf("%nUnit name: %s.%nSales: %d unit.%nIncome: %.2f USD.%nTax: %.2f USD.",
                product.getName(), product.getQuantity(), income, tax);
    }
}
