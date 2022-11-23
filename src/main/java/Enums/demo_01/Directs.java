package Enums.demo_01;

// Перечисления с полем, конструктором и методом.
//
// Точка с запятой должна быть в конце,
// когда есть поле или метод перечисления.
public enum Directs {

    EAST ("Движение на Восток"),
    WEST ("Движение на Запад"),
    NORTH ("Движение на Север"),
    SOUTH ("Движение на Юг"); // <- ; !!!

    // поле
    private final String direction;

    // конструктор
    Directs(String direction) {
        this.direction = direction;
    }

    // метод
    public String getDirection() {
        return this.direction;
    }
}
