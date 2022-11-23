package Methods;

// применение форматирования через
// BigDecimal и RoundingMode
// https://docs.oracle.com/javase/10/docs/api/java/math/RoundingMode.html

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Method06 {

    static long position;
    static String name;
    static String type;
    static double quantity;
    static double price;
    static double cost;
    static double costRounded;

    public static void main(String[] args) {
        showTitle();
        showProductOne();
        showProductTwo();
    }

    private static void showTitle() {
        System.out.println("GOODS" +
                "\n----------------------");
    }

    private static void showProductOne() {
        position = 1;
        name = "Apples";
        type = "red";
        quantity = 6;
        price = 5.99;
        cost = calculateProductCost(quantity, price);

        // округляем значение
        costRounded = roundCost(cost);

        printInfo();
    }

    private static void showProductTwo() {
        position = 2;
        name = "Milk";
        type = "\"Extra\"";
        quantity = 7.051;
        price = 8.79;
        cost = calculateProductCost(quantity, price);

        // округляем значение
        costRounded = roundCost(cost);

        printInfo();
    }

    // метод вывода данных
    private static void printInfo() {
        System.out.println(position + ") " + name + " " + type + "\n"
                + "Purchase (UAH): " + costRounded + "\n");
    }

    private static double calculateProductCost(double quantity, double price) {
        return quantity * price;
    }

    // округдение через BigDecimal
    // 1) может не сработать с printf()
    // 2) может не сработать вывод двух 0 после десятичного разделителя
    public static double roundCost(double value) {
        return new BigDecimal(value).setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
