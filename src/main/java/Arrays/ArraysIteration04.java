package Arrays;

// Проход по массиву через for-each
public class ArraysIteration04 {

    public static void main(String[] args) {

        int[] nums = {9, 14, 21, 8};

        int count = 1; // счетчик

        for (int y : nums) {
            System.out.println(count + ") value is " + y);
            count++;
        }
    }
}
