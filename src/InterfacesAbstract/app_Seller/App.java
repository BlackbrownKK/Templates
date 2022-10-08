package InterfacesAbstract.app_Seller;

// Класс-входная точка в приложение.
// App launcher.
public class App {

    static String sellerName;
    static String email;
    static String phone;
    static String productName;
    static int quantity;
    static double price;
    static String roundBonus;
    static ProductA product;
    static SellerA seller;
    static String infoSeller;
    static String infoProduct;

    // Делаем метод main() наименее загруженным логикой
    public static void main(String[] args) {
        initVars();
        showData(processData());
    }

    // Инициализация переменных.
    // Имитация ввода данных пользователем.
    private static void initVars() {
        sellerName = "Bob";
        email = "bob@mail.com";
        phone = "055 123-4567";
        productName = "oranges";
        quantity = 1000;
        price = 19.99;
    }

    // Передача данных на обработку.
    // Вызовы методов через экземпляры классов
    // для получения результатов расчетов.
    // Здесь же получение расчета и округления бонуса.
    // Получение шаблона для вывода.
    private static String processData() {
        seller = new SellerA(sellerName, phone, email);
        infoSeller = seller.infoSeller();
        product = new ProductA(productName, quantity, price);
        infoProduct = product.infoProduct();
        double sales = product.calcSales(quantity, price);
        roundBonus = Rounder.roundValue(seller.calcBonus(sales));
        return infoSeller + infoProduct + "\nBonus (USD): " + roundBonus;
    }

    // Вывод данных
    private static void showData(String output) {
        System.out.println(output);
    }
}
