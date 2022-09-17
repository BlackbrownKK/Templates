package Arrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        // Равноценные способы задания значений массива.
        // В квадратных скобках не указывается размер массива,
        // так как он вычисляется
        // по количеству элементов в фигурных скобках.
        // Нумерация мест расположения (индексов) элементов массива
        // начинается с нуля,
        // т.е. в массиве nums1 пять эелементов расположены
        // в индексах 0, 1, 2, 3, 4.

        int[] nums1 = new int[] { 1, 9, 3, 5, 8 };
        System.out.println("Array 1: " + Arrays.toString(nums1));
        // length возвращает длину массива, то есть количество его элементов
        int arrLength = nums1.length;
        System.out.println("Array length is " + arrLength);

        int[] nums2 = { 1, 9, 3, 5, 8 };
        System.out.println("Array 2: " + Arrays.toString(nums2));

        int element = nums2[2];
        System.out.println("Array element is " + element);

        // Иногда неизвестен последний индекс, чтобы получить
        // последний элемент массива
        int lastVal = nums2[nums2.length - 1];
        System.out.println("Last element is " + lastVal);
    }
}
