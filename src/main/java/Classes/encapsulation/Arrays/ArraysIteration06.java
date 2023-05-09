package Classes.encapsulation.Arrays;

// Проход по двум массивам
public class ArraysIteration06 {

    static String[] days;
    static int[] items;

    public static void main(String[] args) {

        System.out.println("Items quota per day:");

        days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri"};
        items = new int[]{8, 5, 12, 17, 3};

        // вывод через цикл
        for (int i = 0; i < items.length && i < days.length; i++) {
            System.out.printf("%s items quota = %d%n", days[i], items[i]);
        }
    }
}
