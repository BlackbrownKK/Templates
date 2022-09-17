package Methods;

// Объявление переменных в классе.
// Инициализация переменных в методе.
// Присвоение различных данных переменным.
public class Method03 {

    // объявление переменных
    static String position;     // позиция в перечне
    static String name;         // наименование товара
    static String type;         // тип товара
    static String measure;      // единица измерения
    static int quantity;        // количество
    static int price;           // цена
    static float cost;          // стоимость

    public static void main(String[] args) {

        // вывод заголовка
        System.out.println("GOODS" +
                "\n----------------------");

        // инициализация переменных для товара 1
        position = "1";
        name = "Apples";
        type = "red";
        measure = "kg";
        quantity = 6;
        price = 5;
        // инициализируем переменную методом, что
        // присваивает результат расчета стоимости переменной
        cost = calculateProductCost(quantity, price);
        // вывод данных по товару 1
        System.out.println(position + ". " + name + " " + type + " "
                + quantity + " " + measure + " " + price + " UAH/"
                + measure + " " + cost + " UAH");

        // инициализация переменных для товара 2
        position = "2";
        name = "Milk";
        type = "white";
        measure = "l";
        quantity = 7;
        price = 8;
        cost = calculateProductCost(quantity, price);
        // вывод данных по товару 2
        System.out.println(position + ". " + name + " " + type + " "
                + quantity + " " + measure + " " + price + " UAH/"
                + measure + " " + cost + " UAH");
    }

    // метод расчета с параметрами
    private static float calculateProductCost(int quantity4, int price4) {
        return quantity4 * price4;
    }
}
