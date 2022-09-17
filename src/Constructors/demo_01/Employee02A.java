package Constructors.demo_01;

public class Employee02A {

    public static void main(String[] args) {

        String name = "Григорий";
        String position = "директор";

        // создание экземпляра класса-конструктора
        Employee02 emp = new Employee02();

        emp.hours = 157;
        emp.tariff = 13.25f;

        System.out.println(
                name +
                " " +
                position +
                " зарплата: " +
                emp.calculateSalary());

    }
}
