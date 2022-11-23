package Algorithms;

// СОРТИРОВКА КУЧЕЙ (Пирамидальная сортировка).
//
// Строим из массива кучу, по очереди извлекаем минимум кучи.
//
// Пирамидальная сортировка является методом сортировки, который интерпретирует
// элементы в массиве, как почти полное бинарное дерево.
// Она берет элементы массива и вставляет их в пирамиду.
// После построения пирамиды, из нее по очереди удаляются наибольшие элементы
// и вставляются в конец массива, где и находятся в отсортированном виде.


public class HeapSort {

    public static void main(String[] args) {

        int[] numbers = {9, 3, 12, 5, 2, 24, 16, 7};

        heapSort(numbers);

        for (int number : numbers)
            System.out.print(number + " ");
    }

    // сортировка num[1] to num[n]
    public static void heapSort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--)
            // конвертация массива в кучу
            shiftDown(a, i, a.length);
        for (int i = a.length - 1; i > 0; i--) {
            swap(a, 0, i);
            shiftDown(a, 0, i);
        }
    } // конец сортировки кучей

    private static void shiftDown(int[] a, int i, int n) {
        int child;
        int tmp;

        for (tmp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && (a[child] < a[child + 1]))
                child++;
            if (tmp < a[child])
                a[i] = a[child];
            else
                break;
        }
        a[i] = tmp;
    }

    private static int leftChild(int i) {
        return 2 * i + 1;
    }

    // swap (перестановка) элементов
    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
