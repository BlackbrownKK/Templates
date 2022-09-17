package Algorithms;

// СОРТИРОВКА СЛИЯНИЕМ
//
// Алгоритм состоит в разделении массива пополам,
// сортировке половин и их слиянии.


public class MergeSort {

    public static void main(String[] args) {

        int[] num = {2, 7, 1, 8, 3, 9, 12, 4, 10, 5, 14, 27};
        int n = num.length;

        mergeSort(num, 0, n - 1);

        for (int i : num) System.out.print(i + " ");
    }

//     Внутренний метод, который делает рекурсивные вызовы для сортировки данных
//     elements - это массив элементов для сортировки
//     low - крайняя левая позиция массива
//     high - самая правая позиция массива


    public static void mergeSort(int[] elements, int low, int high) {
        // список содержащий по крайней мере 2 элемента
        if (low < high) {
            int mid = (low + high) / 2;
            // рекурсия: сортировка первой половины
            mergeSort(elements, low, mid);
            // рекурсия: сортировка второй половины
            mergeSort(elements, mid + 1, high);
            // объединение отсортированных половинок
            merge(elements, low, mid, high);
        }
    }


//    Объединение отсортированного массива элементов от low до mid и mid+1
//    low - самое левое положение подмножества элементов
//    high - самая правая позиция подмножества элементов

    private static void merge(int[] subset, int low, int mid, int high) {

        int n = high - low + 1;
        int[] temp = new int[n];

        int i = low, j = mid + 1;
        int k = 0;

        while (i <= mid || j <= high) {
            if (i > mid)
                temp[k++] = subset[j++];
            else if (j > high)
                temp[k++] = subset[i++];
            else if (subset[i] < subset[j])
                temp[k++] = subset[i++];
            else
                temp[k++] = subset[j++];
        }
        for (j = 0; j < n; j++)
            subset[low + j] = temp[j];
    }

}
