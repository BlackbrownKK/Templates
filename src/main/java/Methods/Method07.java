package Methods;

// импорт классов/библиотек для округления
import java.text.DecimalFormat;

public class Method07 {

    static long position;
    static String name;
    static String type;
    static double quantity;
    static double price;
    static double cost;
    static String costRounded;

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
        price = 5.0;
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

    // округдение через DecimalFormat
    // #.00 - шаблон округления округляет до 2-х знаков
    // после десятичного разделителя.
    public static String roundCost(double value){
        return new DecimalFormat("#.00").format(value);
    }
}
