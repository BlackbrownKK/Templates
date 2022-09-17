package Inheritance.extends_intro.democ;

// Класс товара А
public class ProductA extends Product {

    // конструктор класса,
    // получение доступа к переменной супер-класса
    public ProductA(String name) {
        super(name);
    }

    // расчет стоимости товара и ее округление
    String getProductCost(int quantity, double price) {
        double cost = quantity * price;
        return Rounder.roundValue(cost);
    }
}
