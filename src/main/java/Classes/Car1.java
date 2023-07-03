package Classes;

public class Car1 {
    private String model;
    private String brand;
/*
В описании класса автомобиля конструктор без параметров и конструктор с одним параметром называют
конструктором с двумя параметрами. Этот синтаксис предотвращает дублирование кода, инициализирующего поля экземпляров.
 */
    public Car1() {
        this("Camry", "Toyota");
        System.out.println("Init");
    }

    public Car1(String model) {
        this(model, "Toyota");
    }

    public Car1(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
}
