package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 ДУБЛИКАТЫ В МАССИВЕ.
 Для обнаружения повторяющегося значения в массиве, нужно сравнить
 каждый элемент массива со всеми оставшимися, в случае
 совпадения получим дублированный элемент.
 Для этого — используем два цикла, где внутренний
 цикл начинается с i + 1 (где i — переменная внешнего цикла),
 чтобы избежать повторений в сравнении.
 Результат: индекс дубликата.
 BUG: При повторном дубликате, может выдавать повторно индекс дубликата.
*/

public class ArrayDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter array elements: ");

        for(int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }

        System.out.println("Your array: " + Arrays.toString(myArray));
        System.out.println("Duplicate indexes: ");

        for(int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if(myArray[i] == myArray[j]) {
                    System.out.println(j);
                }
            }
        }
    }
}
