package Methods;

// применение форматирования строк
// вывод через printf() с округлением значений
public class Method05 {

    // объявление переменных
    static long position;       // позиция в перечне
    static String name;         // наименование товара
    static String type;         // тип товара
    static String measure;      // единица измерения
    static double quantity;     // количество
    static double price;        // цена
    static double cost;         // стоимость

    public static void main(String[] args) {
        // вызов методов
        showTitle();
        showProductOne();
        showProductTwo();
    }

    // метод вывода заголовка
    private static void showTitle() {
        System.out.println("GOODS" +
                "\n----------------------");
    }

    // метод обработки и вывода данных по товару 1
    private static void showProductOne() {
        position = 1;
        name = "Apples";
        type = "red";
        measure = "kg";
        quantity = 6;
        price = 5.99;
        cost = calculateProductCost(quantity, price);

        // вывод через printf()
        // %d   -> position
        // %s   -> name
        // %s   -> type
        // %n   -> переход на другую строку
        // %.3f -> quantity с округлением до 3 знаков после десятичного разделителя
        // %s   -> measure
        // %n   -> переход на другую строку
        // %.2f -> price с округлением до 2 знаков после десятичного разделителя
        // %s   -> measure
        // %n   -> переход на другую строку
        // %.2f -> cost с округлением до 2 знаков после десятичного разделителя
        // %n   -> переход на другую строку
        // %n   -> переход на другую строку
        System.out.printf("%d. %s %s%nQuantity: %.3f %s%nPrice: %.2f UAH/%s%n" +
                "Cost: %.2f UAH%n%n",
                position, name, type, quantity, measure, price, measure, cost);
    }

    // метод обработки и вывода данных по товару 2
    private static void showProductTwo() {
        position = 2;
        name = "Milk";
        type = "white";
        measure = "l";
        quantity = 7.051;
        price = 8.79;
        cost = calculateProductCost(quantity, price);

        System.out.printf("%d. %s %s%nQuantity: %.3f %s%nPrice: %.2f UAH/%s%n" +
                        "Cost: %.2f UAH%n%n",
                position, name, type, quantity, measure, price, measure, cost);
    }

    // метод расчета стоимости
    private static double calculateProductCost(double quantity, double price) {
        return quantity * price;
    }
}
