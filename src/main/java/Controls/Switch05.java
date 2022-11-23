package Controls;

public class Switch05 {

    static String weekDay;

    public static void main(String[] args) {

        weekDay = "Tue";

        // метод trim() обрезает
        // крайние пробелы строкового ввода
        switch (weekDay.trim()) {
            case "Mon":
            case "Tue":
            case "Wed":
            case "Thu":
            case "Fri":
                System.out.println("Working day :[");
                break;
            case "Sat":
            case "Sun":
                System.out.println("Day off :)))");
                break;
            default:
                System.out.println("Unknown :/");
        }
    }
}
