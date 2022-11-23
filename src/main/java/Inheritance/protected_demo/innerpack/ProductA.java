package Inheritance.protected_demo.innerpack;

import java.text.DecimalFormat;

// наследник Product
// работа через конструктор
public class ProductA extends Product {

    double price;
    double totalSale;
    String saleResult;

    public ProductA(String name, int quantity, double price) {
        super(name, quantity);
        this.price = price;
    }

    // вывод результата
    // public method
    public void infoData() {
        totalSale = calculateTotalSale(getQnty(), price);
        saleResult = roundValue(totalSale);
        System.out.println(
                "\nТовар AA: " + getName() +
                        "\nКоличество (кг): " + getQnty() +
                        "\nСумма продажи (грн.): " + saleResult +
                        "\n-----------------------------"
        );
    }

    // package-private method
    void infoSale() {
        totalSale = calculateTotalSale(getQnty(), price);
        saleResult = roundValue(totalSale);
        System.out.println(
                "\nТовар AB: " + getName() +
                        "\nКоличество (кг): " + getQnty() +
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
