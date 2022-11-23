package Constructors.demo_01;

public class Employee04A {

    static String name;
    static String position;
    static int hours;
    static float tariff;
    static Employee04 emp;

    public static void main(String[] args) {

        name = "Григорий";
        position = "директор";
        hours = 156;
        tariff = 12.55f;

        // создание экземпляра класса-конструктора
        emp = new Employee04(name, position, hours, tariff);

        System.out.println(
                emp.name +
                " " +
                emp.position +
                " зарплата: " +
                calculateSalary(emp.hours, emp.tariff)
        );
    }

    private static float calculateSalary(int h, float t){
        return h * t;
    }
}
