package Algorithms;

// СОРТИРОВКА ВЫБОРОМ
//
// От наименьшего к наибольшему.
// Начинается с поиска наименьшего элемента в массиве и размешение его первым.
// Затем находится второй наименьший элемент и размещается вторым, и так до тех
// пор пока весь массив не отсортируется.


public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = {3, 7, 1, 6, 2, 9, 12, 4, 10, 5};
        int n = numbers.length;

        selectionSort(numbers, 0, n - 1);

        for (int number : numbers) System.out.print(number + " ");
    }

    // алгоритм сортировки
    public static void selectionSort(int[] numbers, int low, int high) {
        for (int h = low; h <= high; h++)
            swap(numbers, h, getSmallest(numbers, h, high));
    }

    // получение позиции из массива numbers от меньшего к наибольшему
    public static int getSmallest(int[] numbers, int low, int high) {
        int small = low;
        for (int i = low + 1; i <= high; i++)
            if (numbers[i] < numbers[small])
                small = i;
        return small;
    }

    // swap (перестановка) элементов
    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
