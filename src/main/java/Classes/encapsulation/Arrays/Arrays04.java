package Classes.encapsulation.Arrays;

import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {
        // Можем обратиться к любому элементу массива
        // по индексу, который передается в квадратных
        // скобках после названия переменной массива.
        int[] nums = new int[5];
        // устанавливаем значения элементов
        // массива
        nums[0] = 5;
        nums[1] = 22;
        nums[2] = 13;
        nums[3] = 104;
        nums[4] = 16;

        System.out.println("Array: " + Arrays.toString(nums));

        // Индексация элементов массива начинается с 0,
        // получаем значение третьего элемента массива
        System.out.println(nums[2]);

        // обращение вне массива, будет ошибка
//        System.out.println(nums[5]);
    }
}
