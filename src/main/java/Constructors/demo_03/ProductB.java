package Constructors.demo_03;

import java.text.DecimalFormat;
import java.util.Scanner;

// Ввод через Scanner и некоторая валидация значений.
// Не решено: пустота ввода количества и цены.

public class ProductB {

    static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("Введите наименование товара: ");
        String name = validateName(scanner);

        System.out.println("Введите количество: ");
        int quantity = validateQuantityInput(scanner);

        scanner = new Scanner(System.in);
        System.out.println("Введите цену: ");
        float price = validatePriceInput(scanner);



        float taxRate = 0.15f;
        double tax = calculateTax(quantity, price, taxRate);
        double profit = calculateProfitNetto(quantity, price, tax);

        // округление денежных выражений
        String taxResult = roundValue(tax);
        String profitResult = roundValue(profit);

        // создаём экземпляр класса-конструктора
        Product product = new Product();

        // Так как применяется конструктор по умолчанию,
        // устанавливаем значения через setters.
        product.setName(name);
        product.setQnty(quantity);
        product.setPrice(price);

        // Получение значения через getters.
        String nameOutput = product.getName();
        int qntyOutput = product.getQnty();

        // вывод результатов в консоль
        System.out.println(
                "Наименование товара: " + nameOutput + '\n' +
                "Товара продано: " + qntyOutput + " шт." + '\n' +
                "Чистая прибыль: " + profitResult + " грн." + '\n' +
                "Сумма налога: " + taxResult + " грн."
        );
    }

// расчёт суммы налога
    private static double calculateTax(int sold, double price, double taxRate) {
        return sold * price * taxRate;
    }

// расчёт суммы чистой прибыли (после уплаты налога)
    private static double calculateProfitNetto(int sold, double price, double tax) {
        return sold * price - tax;
    }

// округление суммы
    private static String roundValue(double value) {
        return new DecimalFormat("#.00").format(value);
    }

// валидация ввода наименования
    private static String validateName(Scanner scanner){
        String str = scanner.nextLine().trim();
        while (str.isEmpty()){
            System.out.println("Пусто!! Введите наименование товара: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

// валидация ввода количества
    private static int validateQuantityInput(Scanner scanner){
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите количество !!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0){
            System.out.println("Неверное значение!! Введите количество: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество !!: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

// валидация ввода цены
    private static float validatePriceInput(Scanner scanner){
        while (!scanner.hasNextFloat()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите цену !!: ");
        }
        float price = scanner.nextFloat();
        while (price <= 0){
            System.out.println("Неверное значение!! Введите цену: ");
            while (!scanner.hasNextFloat()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите цену !!: ");
            }
            price = scanner.nextFloat();
        }
        return price;
    }
}
