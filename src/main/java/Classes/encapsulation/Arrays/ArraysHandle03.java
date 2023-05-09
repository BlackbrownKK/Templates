package Classes.encapsulation.Arrays;

import java.util.Arrays;

// Метод System.arraycopy() производит копирование
// части массива в другой массив.
// Пример копирования части элементов из массива arrayFrom
// в массив arrayTo.
public class ArraysHandle03 {

    public static void main(String[] args) {

        int[] arrayFrom = {1, 2, 3, 4, 5, 6};
        int[] arrayTo = {0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("arrayFrom: " + Arrays.toString(arrayFrom));
        System.out.println("arrayTo: " + Arrays.toString(arrayTo));

        // Три аргумента int определяют начальную позицию в исходном
        // массиве, начальную позицию в целевом массиве и количество
        // копируемых элементов массива.
        System.arraycopy(arrayFrom, 2, arrayTo, 3, 3);
        System.out.println("arrayTo after arrayCopy: "
                + Arrays.toString(arrayTo));
    }
}
