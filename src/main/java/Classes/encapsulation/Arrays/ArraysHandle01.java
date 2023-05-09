package Classes.encapsulation.Arrays;

import java.util.Arrays;

//  Сортировка массива.
//  Метод Arrays.sort() позволяет сортировать элементы
//  массива по возрастанию.
public class ArraysHandle01 {

    public static void main(String[] args) {

        //  Сортировка массива полностью.
        int[] nums = {4, 2, 12, 9, 5, 17};

        System.out.println("Not sorted " + Arrays.toString(nums));

        //  Сортировка массива полностью.
        Arrays.sort(nums);

        System.out.println("Sorted " + Arrays.toString(nums));
    }
}
