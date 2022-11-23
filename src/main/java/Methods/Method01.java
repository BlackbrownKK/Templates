package Methods;

public class Method01 {

    public static void main(String[] args) {

        // объявление и инициализация переменных
        // локальные переменные метода main()
        String name = "Apples";
        String type = "red";
        String measure = "(kg)";

        // вывод
        System.out.println("Hello from SUNNY-SHOP!");
        System.out.println("----------------------");
        System.out.println(name + " " + type + " " + measure + " " +
                calculateProductCost() + " UAH");
    }

    // метод расчета стоимости без параметров
    private static int calculateProductCost() {
        // локальные переменные метода
        int quantity = 6;
        int price = 5;
        // возврат результата метода
        return quantity * price;
    }
}
