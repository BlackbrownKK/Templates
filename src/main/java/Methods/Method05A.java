package Methods;

// сокращение кода, из класса Method05
public class Method05A {

    static long position;
    static String name;
    static String type;
    static String measure;
    static double quantity;
    static double price;
    static double cost;

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
        measure = "kg";
        quantity = 6;
        price = 5.99;
        cost = calculateProductCost(quantity, price);
        printInfo();
    }

    private static void showProductTwo() {
        position = 2;
        name = "Milk";
        type = "\"Extra\"";
        measure = "l";
        quantity = 7.051;
        price = 8.79;
        cost = calculateProductCost(quantity, price);
        printInfo();
    }

    // метод вывода данных
    private static void printInfo() {
        System.out.printf("%d. %s %s%nQuantity: %.3f %s%nPrice: %.2f UAH/%s%n" +
                        "Cost: %.2f UAH%n%n",
                position, name, type, quantity, measure, price, measure, cost);
    }

    private static double calculateProductCost(double quantity, double price) {
        return quantity * price;
    }
}
