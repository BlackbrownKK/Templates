package Constructors.demo_01;

// Параметризированный конструктор

public class Employee03 {

    // поля-переменные
    int hours;
    float tariff;

    //// конструктор с параметрами
    Employee03(int hr, float t) {
        hours = hr;
        tariff = t;
    }

    float calculateSalary() {
        return hours * tariff;
    }
}
