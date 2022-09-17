package Interfaces.classes_abstract_product;


public class Demo {

    static String name;
    static double quantity;
    static double price;
    static double discountRate;
    static String roundCost;
    static String roundDiscount;
    static String productData;

    public static void main(String[] args) {
        handleProductA();
        handleProductB();
    }

    private static void handleProductA() {
        // Инициализация переменных
        name = "Апельсин";
        quantity = 10.5;
        price = 15.99;
        // Создание экземпляра
        ProductA productA = new ProductA(name, quantity, price);
        // Обработка значений через вызов методов
        roundCost = Rounder.roundValue(productA.calcCost());
        // Подготовка текста вывода
        productData = "Товар: " + name + "\nСтоимость, грн.: " + roundCost;
        // Вывод
        showData(productData);
    }

    private static void handleProductB() {
        // Инициализация переменных
        name = "Яблоки";
        quantity = 24.85;
        price = 8.99;
        discountRate = 10.5;
        // Создание экземпляра
        ProductB productB = new ProductB(name, quantity, price, discountRate);
        // Обработка значений через вызов методов
        roundCost = Rounder.roundValue(productB.calcCost());
        roundDiscount = Rounder.roundValue(productB.calcDiscount());
        // Подготовка текста вывода
        productData = "Товар: " + name + "\nСтоимость, грн.: " + roundCost
                + "\nСкидка, грн.: " + roundDiscount;
        // Вывод
        showData(productData);
    }

    // Универсальный метод вывода
    private static void showData(String prodInfo) {
        System.out.println(prodInfo);
    }
}
