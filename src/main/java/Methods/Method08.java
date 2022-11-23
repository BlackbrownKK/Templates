package Methods;

import java.text.DecimalFormat;

public class Method08 {

    static long position;
    static String name;
    static String type;
    static double quantity;
    static double price;
    static double income;
    static String incomeRounded;
    static double tax;
    static String taxRounded;
    static double pureIncome;
    static String pureIncomeRounded;
    private final static double TAX_RATE = 7.5;

    public static void main(String[] args) {
        showTitle();
        showProductOne();
        showProductTwo();
    }

    private static void showTitle() {
        System.out.println("INFO" +
                "\n----------------------");
    }

    private static void showProductOne() {
        position = 1;
        name = "Apples";
        type = "red";
        quantity = 6;
        price = 5.0;

        // обработка значений
        income = calcIncome(quantity, price);
        tax = calcTax(income);
        pureIncome = calcPureIncome(income,tax);

        // округление значений
        incomeRounded = roundValue(income);
        taxRounded = roundValue(tax);
        pureIncomeRounded = roundValue(pureIncome);

        printInfo();
    }

    private static void showProductTwo() {
        position = 2;
        name = "Milk";
        type = "\"Extra\"";
        quantity = 7.051;
        price = 8.79;

        // обработка значений
        income = calcIncome(quantity, price);
        tax = calcTax(income);
        pureIncome = calcPureIncome(income,tax);

        // округление значений
        incomeRounded = roundValue(income);
        taxRounded = roundValue(tax);
        pureIncomeRounded = roundValue(pureIncome);

        printInfo();
    }

    // метод вывода данных
    private static void printInfo() {
        System.out.println(position + ") " + name + " " + type
                + "\nIncome (UAH): " + incomeRounded
                + "\nTax (UAH): " + taxRounded
                + "\nPure income (UAH): " + pureIncomeRounded + "\n"
        );
    }

    private static double calcIncome(double quantity, double price) {
        return quantity * price;
    }

    private static double calcTax(double income) {
        return income * TAX_RATE / 100;
    }

    private static double calcPureIncome(double income, double tax) {
        return income - tax;
    }

    // округдение через DecimalFormat
    // #.00 - шаблон округления округляет до 2-х знаков
    // после десятичного разделителя.
    public static String roundValue(double value){
        return new DecimalFormat("#.00").format(value);
    }
}
