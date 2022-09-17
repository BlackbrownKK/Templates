package Classes.demo_04;

import java.util.Scanner;

// расчет дохода и налога с дохода
// пример со Scanner
public class EmployeeInfo {

    static String name;
    static int hours;
    static double hourRate;
    static double taxRate;
    static Employee employee;
    static double income;
    static double tax;

    public static void main(String[] args) {

        // Вызов метода ввода данных
        handleInputs();

        // Создание экземпляра класса-конструктора
        employee = new Employee();
        // Если оперируем только конструктором по умолчанию, то
        // необходима установка значений через setters.
        employee.setName(name);
        employee.setHour(hours);
        employee.setTariff(hourRate);

        // Вызов метода расчета дохода
        income = calculateIncome(employee.getHour(), employee.getTariff());
        // Вызов метода расчета налога
        tax = calculateTax(income, taxRate);

        // Вызов метода вывода данных
        showInfo();
    }

    // ввод данных
    private static void handleInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Hours worked: ");
        hours = scanner.nextInt();
        System.out.print("Tariff (USD/hour): ");
        hourRate = scanner.nextDouble();
        System.out.print("Tax rate (%): ");
        taxRate = scanner.nextDouble();
        System.out.print("---------------------------");
    }

    //  Метод рассчета дохода
    private static double calculateIncome(int hours, double rate) {
        return hours * rate;
    }

    // Метод рассчета налога
    private static double calculateTax(double income, double taxRate ) {
        return income * taxRate / 100;
    }

    // Метод вывода данных
    private static void showInfo() {
        System.out.printf("%n%s%nWorked %d hours%nIncome: USD %.2f.%nTax:USD %.2f.",
                employee.getName(), employee.getHour(),income,tax);
    }
}
