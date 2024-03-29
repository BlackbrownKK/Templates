package Algorithms;

// СОРТИРОВКА ВСТАВКАМИ
//
// На каждом шаге алгоритма мы выбираем один из элементов входных данных и
// вставляем его на нужную позицию в уже отсортированной части массива до
// тех пор, пока весь набор входных данных не будет отсортирован.
//
// Алгоритм просматривает данные в виде двух частей.
// Левая часть отсортированных элементов, правая которые нужно отсортировать.
// В каждой итерации, один элемент из правой части берется и добавляется
// в левую часть так, что левая часть остается отсортированной.


public class InsertionSortA {

    // объявление счетчика
    static int pos;

    public static void main(String[] args) {

        // инициализация счетчика
        pos = 0;

        int[] elements = {23, 71, 1, 6, 2, 19, 12, 4};

        insertionSort(elements);

        for (int element : elements)
            System.out.print(element + " ");

        // просто разделитель
        System.out.println("\n----------------");

        // вывод в столбец с нумерацией
        for (int element : elements) {
            pos++;
            System.out.println(pos + ". " + element);
        }
    }

    private static void insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int key = elements[i];
            // поиск начнется с предыдущего индекса до индекса ключа
            int j = i - 1;
            // поиск будет продолжаться до тех пор, пока не будет
            // найден элемент меньший, чем ключ
            while (j >= 0 && key < elements[j]) {
                elements[j + 1] = elements[j];
                j--;
            }
            // после нахождения меньшего элемента, ключ в следующий индекс.
            elements[j + 1] = key;
        }
    }
}
