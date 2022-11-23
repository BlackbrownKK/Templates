package Inheritance.extends_intro.democ;

// Класс товара B
public class ProductB extends Product {

    // переменная этого класса
    double taxRate;

    // конструктор класса,
    // получение доступа к переменной супер-класса
    public ProductB(String name, double taxRate) {
        super(name);
        this.taxRate = taxRate;
    }

    // расчет стоимости товара, с учетом налога, и ее округление
    String getProductCost(double quantity, double price) {
        double cost = (quantity * price) + (quantity * price) * taxRate;
        return Rounder.roundValue(cost);
    }
}
