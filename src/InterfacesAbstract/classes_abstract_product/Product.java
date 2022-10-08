package InterfacesAbstract.classes_abstract_product;

// Абстрактный класс с конструктором,
// абстрактным и неабстрактным методами.
abstract class Product {

    String name;

    // Явный конструктор этого класса.
    public Product(String name) {
        this.name = name;
    }

    // Абстрактный метод этого класса.
    // Базовый функционал
    abstract double calcCost();

    // Неабстрактный метод этого класса.
    double calcDiscount() {
        return 0;
    }
}
