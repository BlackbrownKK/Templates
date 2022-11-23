package Methods;

// применение метода с параметрами
// Параметр - это переменная в определении метода. Когда вызывается метод,
// аргументы - это данные, которые вы передаете в параметры метода.
// Параметр является переменной в объявлении функции. Аргумент - это
// фактическое значение этой переменной, которое передается функции.
public class Method02 {

    public static void main(String[] args) {

        // объявление и инициализация переменных
        // локальные переменные метода main()
        String name = "Apples";
        String type = "red";
        String measure = "kg";
         int qnty = 6;
         int price = 5;
         double koef = 1.5; // типа коэффициент свежести :)

        // вывод
        System.out.println("Hello from SUNNY-SHOP!" +
                "\n------------------------\n"
                + name + " " + type + " " + qnty + " " + measure +
                " " + price + " UAH/" + measure + " " +
                // метод с аргументами
                calculateProductCost(qnty, price, koef) + " UAH"
        );
    }

    // метод расчета стоимости с параметрами
    private static double calculateProductCost(int qnty22, int price1, double koef33) {
        return qnty22 * price1 * koef33;
    }
}
