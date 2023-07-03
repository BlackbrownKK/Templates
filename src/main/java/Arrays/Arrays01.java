package Arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
/*
При такой инициализации все элементы массива имеют значение по умолчанию.
Для числовых типов (в том числе для типа char) это число 0,
для типа boolean это значение false, а для остальных объектов это значение null.
Например, для типа int значением по умолчанию является число 0,
поэтому определенный массив nums будет состоять из 5 нулей.

Метод Arrays.toString() возвращает строковое представление одномерного массива,
разделяя элементы запятой.
* */
        int[] nums = new int[5];

        String[] elements = new String[3];

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(elements));


        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] arr3 = {1,2,5,5,5,5,5,8,9};
        System.out.println(arr1 == arr2);
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));
        System.out.println(Arrays.toString(arr1));

    }
}
