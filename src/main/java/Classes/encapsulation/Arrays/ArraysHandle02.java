package Classes.encapsulation.Arrays;

import java.util.Arrays;

public class ArraysHandle02 {

    public static void main(String[] args) {

        int[] nums = {4, 2, 12, 9, 5, 17};

        System.out.println("Not sorted " + Arrays.toString(nums));

        // Сортировка части массива (от индекса, включительно,
        // до индекса, исключительно)
        Arrays.sort(nums, 1, 4);
        System.out.println("Sorted partly " + Arrays.toString(nums));


    }
}
