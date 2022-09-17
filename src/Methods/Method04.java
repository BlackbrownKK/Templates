package Methods;

// обработка отдельных данных в
// отдельных методах
public class Method04 {

    // объявление переменных
    static String position;     // позиция в перечне
    static String name;         // наименование товара
    static String type;         // тип товара
    static String measure;      // единица измерения
    static int quantity;        // количество
    static int price;           // цена
    static float cost;          // стоимость

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
        position = "1";
        name = "Apples";
        type = "red";
        measure = "kg";
        quantity = 6;
        price = 5;
        cost = calculateProductCost(quantity, price);

        System.out.println(position + ". " + name + " " + type + " "
                + quantity + " " + measure + " " + price + " UAH/"
                + measure + " " + cost + " UAH");
    }

    // метод обработки и вывода данных по товару 2
    private static void showProductTwo() {
        position = "2";
        name = "Milk";
        type = "white";
        measure = "l";
        quantity = 7;
        price = 8;
        cost = calculateProductCost(quantity, price);

        System.out.println(position + ". " + name + " " + type + " "
                + quantity + " " + measure + " " + price + " UAH/"
                + measure + " " + cost + " UAH");
    }

    // метод расчета стоимости
    private static float calculateProductCost(int quantity, int price) {
        return quantity * price;
    }
}
