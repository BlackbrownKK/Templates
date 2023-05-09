package Classes.encapsulation.Arrays;

import java.util.Arrays;

public class ArraysMulti03 {

    static int[][] nums;

    public static void main(String[] args) {

        // Количество строк и столбцов в квадратных скобках.
        nums = new int[3][3];

        // Установление значений массива
        nums[0][0] = 5;
        nums[0][1] = 12;
        nums[0][2] = 5;
        nums[1][0] = 17;
        nums[1][1] = 2;
        nums[1][2] = 9;
        nums[2][0] = 24;
        nums[2][1] = 8;
        nums[2][2] = 3;

        // Вывод значений масссива
        System.out.println("Array: " + Arrays.deepToString(nums));

        // Вывод значения строки 2 столбца 1
        System.out.println("Element is " + nums[1][0]);
    }
}
