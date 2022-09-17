package Constructors.demo_01;

public class Employee01A {

    public static void main(String[] args) {

        // создание экземпляра класса-конструктора
        Employee01 emp = new Employee01();

        System.out.println(
                emp.name +
                " " +
                emp.position +
                " зарплата: " +
                emp.calculateSalary()
        );
    }
}
