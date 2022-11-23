package Constructors.demo_01;

public class Employee03A {

    public static void main(String[] args) {

        String name = "Григорий";
        String position = "директор";

        String name1 = "Марина";
        String position1 = "бухгалер";

        // создание экземпляра класса-конструктора
        Employee03 emp = new Employee03(154, 14.75f);
        Employee03 emp1 = new Employee03(158, 12.95f);

        System.out.println(
                name +
                " " +
                position +
                " зарплата: " +
                emp.calculateSalary());

        System.out.println(
                name1 +
                " " +
                position1 +
                " зарплата: " +
                emp1.calculateSalary());

    }
}
