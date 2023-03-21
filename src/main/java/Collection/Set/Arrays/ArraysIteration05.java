package Collection.Set.Arrays;

// Проход по массиву через for-each
public class ArraysIteration05 {

    static String[] fruits;
    static int cnt;

    public static void main(String[] args) {

        fruits = new String[]{"plum", "orange", "apple", "pear"};

        for (String fruit : fruits) {
            cnt++; // счетчик
            System.out.println(cnt + ") " + fruit);
        }
    }
}
