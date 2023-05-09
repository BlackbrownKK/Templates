package Classes.encapsulation.Arrays;

import java.util.Arrays;

public class ArraysMulti01 {

    public static void main(String[] args) {

        int[][] nums = { { 4, 13, 23 }, { 3, 14, 52 } };

        // Вывод значений масссива.
        // Метод Arrays.deepToString() языка Java
        // возвращает строковое представление многомерного
        // массива, выделяя строки квадратными скобками.
        System.out.println("Array: " + Arrays.deepToString(nums));

        // Вывод значения строки 2 столбца 1
        System.out.println("Array element is " + nums[1][0]);
    }
}
