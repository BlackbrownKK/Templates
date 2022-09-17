package Constructors.demo_01;

// Конструктор не указан явно.
// Есть по умолчанию.

public class Employee02 {

    // поля-переменные
    int hours;
    float tariff;

    float calculateSalary() {
        return hours * tariff;
    }
}
