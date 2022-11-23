package Inheritance.Inheritance_task;


public class EmployeeA extends Employee {

    String email;

    public EmployeeA(String name, String position, String email) {
        super(name, position);
        this.email = email;
    }

    String calcSalary(int hours, double tariff) {
        double salary = hours * tariff;
        return Rounder.roundValue(salary);
    }
}
