package Inheritance.extends_intro.democ;

public class ProductInfo {

    private static String name;
    private static double price;
    private final static String CURRENCY = "грн.";
    private static String costRounded;

    public static void main(String[] args) {
        // вызов методов этого класса
        getProductAInfo();
        getProductBInfo();
    }

    // метод получения информации о товаре А
    private static void getProductAInfo() {
        name = "Смартфоны";
        int quantity = 3;
        price = 2500.99;
        ProductA product = new ProductA(name);
        costRounded = product.getProductCost(quantity, price);
        showInfo(costRounded);
    }

    // метод получения информации о товаре В
    private static void getProductBInfo() {
        name = "Апельсины";
        double quantity = 10;
        price = 18.39;
        double taxRate = 0.05;
        ProductB product = new ProductB(name, taxRate);
        costRounded = product.getProductCost(quantity, price);
        showInfo(costRounded);
    }

    // метод вывода информации
    private static void showInfo(String costRounded) {
        System.out.println(name + ", стоимость " + costRounded + " " + CURRENCY);
    }
}
