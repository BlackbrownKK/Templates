package Constructors.demo_02;

// Применение параметризованного конструктора.
// Применение String.format для округления значений.

public class ProduktC {

    private static String name;
    private static int qnty;
    private static float price;
    private final static float TAX_RATE = 0.05f;
    private static Produkt produkt;
    private static float totalIncome;
    private static float tax;
    private static String incomeResult;
    private static String taxResult;

    public static void main(String[] args) {

        name = "Печенье";
        qnty = 23;
        price = 12.00f;

// Создание экземпляра класса-конструктора,
// переменные указаны в параметрах конструктора, т.е. в ().
        produkt = new Produkt(name, qnty, price);

// Подсчет дохода через метод calculateTotalIncome()
        totalIncome = calculateTotalIncome(
// получение значений для расчета через getters
                produkt.getQnty(),
                produkt.getPrice()
        );

// Подсчет налога
        tax = totalIncome * TAX_RATE;

// Округление дохода через String.format
        incomeResult = String.format("%.2f",totalIncome);

// Округление налога через String.format
        taxResult = String.format("%.2f", tax);

// Вывод результатов в консоль
        System.out.println(
                "Расчет продаж и налога" +
                "\nТовар: " + produkt.getName() +
                "\nКоличество: " + produkt.getQnty() +
                "\nДоход: " + incomeResult + " грн." +
                "\nНалог: " + taxResult + " грн."
        );

    }

// Метод рассчета дохода
    private static float calculateTotalIncome(int quota, float price){
        return quota * price;
    }

}
