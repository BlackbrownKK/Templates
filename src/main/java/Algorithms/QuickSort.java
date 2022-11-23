package Algorithms;

// БЫСТРАЯ СОРТИРОВКА
//
// Один из самых быстрых алгоритмов.
// Он также использует стратегию «разделяй и властвуй», чтобы сортировать
// как сортировка слиянием.


public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {12, 7, 4, 5, 3, 2, 1, 10};

// метод принимает в качестве аргументов
// начальный и конечный индексы массива
        quickSort(arr, 0, 7);

        System.out.print("\nArray sorted:\n");

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static int partion(int[] arr, int left, int right) {
        // принять первый элемент в качестве основы
        int pivot = arr[left];
        // i индекс, который должен отслеживать наименьшие элементы, чем основа.
        // наконец мы поменяем элемент с индексом i на основу.
        // означает, что перед i-м индексом все элементы должны быть
        // меньше чем основа.
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (arr[j] < pivot) {
                // найден меньший элемент, должны увеличить i
                i++;
                // меняем местами элементы так, чтобы меньший элемент
                // поместить в правильную позицию.
                swap(arr, i, j);
            }
        }
        // после того, как цикл for заканчивается до i-го индекса,
        // все меньшие элементы были размещены.
        // теперь меняем местами i индекс с основанием.
        swap(arr, i, left);

        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // делим массив основанием
            int p = partion(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
