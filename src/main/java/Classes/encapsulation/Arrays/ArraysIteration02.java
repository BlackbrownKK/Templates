package Classes.encapsulation.Arrays;

// Проход по массиву через do-while
public class ArraysIteration02 {

    public static void main(String[] args) {

        int[] nums = {4, 15, 6, 7};

        int j = 0;

        do {
            System.out.println(nums[j]);
            j++;
        } while (j < nums.length);
    }
}
