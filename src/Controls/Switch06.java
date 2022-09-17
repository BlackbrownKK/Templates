package Controls;

// Расчет внутри switch.
// Вывод через printf(),
// где %.2f округление до 2-х знаков
// после десятичного разделителя.
public class Switch06 {

    static String weekDay;
    static double tariff;
    static double extraTariff;

    public static void main(String[] args) {

        tariff = 150.99;
        weekDay = "Sat";

        switch (weekDay.trim()) {
            case "Mon":
            case "Tue":
            case "Wed":
            case "Thu":
            case "Fri":
                extraTariff = tariff;
                System.out.printf("Rate is USD %.2f per hour", extraTariff);
                break;
            case "Sat":
            case "Sun":
                extraTariff = tariff + (tariff * 25 / 100);
                System.out.printf("Rate is USD %.2f per hour", extraTariff);
                break;
            default:
                System.out.println("Unknown :/");
        }

    }
}
