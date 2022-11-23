package Constructors.demo_01;

public class Employee05A {

    static String name;
    static String position;
    static int hours;
    static float tariff;
    static Employee05 emp;

    public static void main(String[] args) {

        name = "Tom";
        position = "director";
        hours = 156;
        tariff = 12.55f;

        // создание экземпляра класса-конструктора
        emp = new Employee05();
        // установка значений
        emp.setName(name);
        emp.setPosition(position);
        emp.setHours(hours);
        emp.setTariff(tariff);

        System.out.println(
                "Name: " + emp.getName() +
                "\nPosition: " + emp.getPosition() +
                "\nWage: " +
                calculateSalary(emp.getHours(),emp.getTariff()));

    }

    private static float calculateSalary(int hour, float tariff){
        return hour * tariff;
    }

}
