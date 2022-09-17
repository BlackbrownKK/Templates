package Controls;

// Расчет внутри switch.
public class Switch07 {

    static String weekDay;
    static double tariff;

    public static void main(String[] args) {

        tariff = 150.99;
        weekDay = "Sat";

        switch (weekDay.trim()) {
            case "Mon", "Tue", "Wed", "Thu", "Fri" ->
                    System.out.printf("Rate is USD %.2f per hour", tariff);
            case "Sat", "Sun" -> {
                double extraTariff = tariff + (tariff * 25 / 100);
                System.out.printf("Rate is USD %.2f per hour", extraTariff);
            }
            default -> System.out.println("Unknown :/");
        }
    }
}
