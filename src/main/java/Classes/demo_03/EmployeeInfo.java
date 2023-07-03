package Classes.demo_03;

// расчет дохода и налога с дохода
public class EmployeeInfo extends Employee {

    static String name;
    static int hours;
    static double hourRate;
    static double taxRate;
    static Employee employee;
    static double income;
    static double tax;

    public EmployeeInfo(String name) {
        super();

    }

    public static void main(String[] args) {

        // Вызов метода инициализации переменных
        initVars();

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

    // Метод инициализации переменных
    private static void initVars() {
        name = "Den";
        hours = 127;
        hourRate = 56.4;
        taxRate = 9.5;
    }

    //  Метод рассчета дохода
    private static double calculateIncome(int hours, double rate) {
        return hours * rate;
    }

    // Метод рассчета налога
    private static double calculateTax(double income, double taxRate) {
        return income * taxRate / 100;
    }

    // Метод вывода данных
    private static void showInfo() {
        System.out.printf("%s%nWorked %d h.%nPlus: %.2f UAN.%nTax: %.2f UAN.",
                employee.getName(), employee.getHour(), income, tax);
    }
}
