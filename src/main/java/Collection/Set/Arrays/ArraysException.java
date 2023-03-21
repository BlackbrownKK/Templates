package Collection.Set.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Обработка исключения индекса массива вне границ.
Массив имеет фиксированный размер, и каждый элемент
доступен с помощью индексов.
Последний индекс массива на 1 меньше его размера.
Если используем значение, которое больше или равно размеру
массива, возникает исключение ArrayIndexOutOfBoundsException.
Можно обработать это исключение, используя try catch,
*/

public class ArraysException {

    public static void main(String[] args) {

        int[] myArray = {24, 16, 7, 91, 13, 55};

        // Определение последнего индекса массива
        int lastIndex = myArray.length - 1;

        System.out.println("Array: " + Arrays.toString(myArray));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter index: ");

        // Обработка исключения
        try {
            int element = sc.nextInt();
            System.out.println("Element in index: " + myArray[element]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect index!\n" +
                    "Enter from 0 to " + lastIndex + ", inclusively.");
        }
    }


}
