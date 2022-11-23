package Constructors.demo_02;

// Применение пустого конструктора (по умолчанию)

public class ProduktA {

    static String name;
    private static String productName;
    private static int quota;
    private static int productQuota;
    private static float price;
    private static float productPrice;
    private static float income;
    private static float tax;
    private static float taxRate;
    private static Produkt produkt;

    public static void main(String[] args) {

        name = "Ананас";
        quota = 15;
        price = 31.4f;
        taxRate = 0.15f;

// Создание экземпляра класса-конструктора
        produkt = new Produkt();

// Если оперируем только конструктором по умолчанию, то
// необходима установка значений через setters
        produkt.setName(name);
        produkt.setQnty(quota);
        produkt.setPrice(price);

// получение значений через getters
        productName = produkt.getName();
        productQuota = produkt.getQnty();
        productPrice = produkt.getPrice();

// присвоение значений расчетов переменной
        income = calculateIncome(productQuota, productPrice);
        tax = calculateTax(income, taxRate);

// вывод результатов
        System.out.println(
                productName +
                        "\nПродано: " + productQuota + " шт." +
                        "\nСумма: " + income + " грн." +
                        "\nНалог: " + tax + " грн."
        );
    }

    //  Метод рассчета дохода
    private static float calculateIncome(int qnty, float price) {
        return qnty * price;
    }

    // Метод рассчета налога
    private static float calculateTax(float income, float taxRate) {
        return income * taxRate;
    }

}
