package Classes;
// Класс-модель товара
// @autor Kostenyuk Konstantin
// @version 1.1.0
public class Product {
    // Задекларировал переменные, которые отражают
    // наименование, количество и цену товара.
    private String name;
    private int quantity;
    private double price;
    // private доступ к переменным
    // Добавил getters и setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
