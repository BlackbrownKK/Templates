package Inheritance.protected_demo.innerpack;

import java.text.DecimalFormat;

// не наследник Product
// работа через экземпляр
// и сеттеры
public class ProductB {

    String name;
    int qnty;
    double price;
    double totalSale;
    String saleResult;

    Product product = new Product();

    // вывод результата
    // public method
    public void infoData() {
        name = "Яблоки";
        qnty = 9;
        price = 3.99;
        product.setName(name);
        product.setQnty(qnty);
        totalSale = calculateTotalSale(product.getQnty(), price);
        saleResult = roundValue(totalSale);
        System.out.println(
                "\nТовар BA: " + product.getName() +
                        "\nКоличество (кг): " + product.getQnty() +
                        "\nСумма продажи (грн.): " + saleResult +
                        "\n-----------------------------"
        );
    }

    // подсчет стоимости
    private double calculateTotalSale(int quota, double price) {
        return quota * price;
    }

    // округление значения
    private String roundValue(double value) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }
}
