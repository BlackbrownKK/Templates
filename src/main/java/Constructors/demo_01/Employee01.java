package Constructors.demo_01;

public class Employee01 {

    // поля-переменные
    String name;
    String position;
    int hours;
    float tariff;

    // конструктор
    public Employee01() {
        name = "Григорий";
        position = "директор";
        hours = 156;
        tariff = 12.55f;
    }

    float calculateSalary() {
        return hours * tariff;
    }

}
