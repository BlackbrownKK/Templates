package Algorithms;

// СОРТИРОВКА ВСТАВКАМИ
// строковых значений

public class InsertionSortB {

    public static void main(String[] args) {

        String[] elements = {"Plum", "Apple", "Orange", "Onion", "Grape"};
//        String[] elements = {"Слива", "Яблоко", "Апельсин", "Вишня", "Виноград"};

        // length - определение длины массива
        // здесь массив elements состоит из 5-ти элементов
        // с индексами (позициями) элементов,
        // от 0 до 4, включительно
        int n = elements.length; // это равно 5

        // передача массива на сортировку
        insertionSort(elements);

        // вывод массива после сортировки
        // [i] указывает индекс элемента массива
        // например, elements[2] - третий элемент в позиции 2
        // поэтому в for инициализируем i = 0,
        // т.е. с первой позиции в массиве и до меньше 5-ти,
        // т.к. n равно 5
        for (int i = 0; i < n; i++)
            System.out.print(elements[i] + "\n");

        // вывод через for-each
        // for (String element : elements) System.out.print(element + "\n");
    }

    // метод сортировки массива
    private static void insertionSort(String[] elements) {
        // цикл сортироки массива начинается со 2-й позиции
        // i = 1
        // длится проход по позициям 1, 2, 3, 4, т.е. до 5
        // поскольку elements.length равно 5
        for (int i = 1; i < elements.length; i++) {
            String key = elements[i];
            int j = i - 1;

//  Метод compareTo() в Java сравнивает вызывающий объект с объектом,
//  переданным в качестве параметра, и возвращает в результате выполнения
//  сравнения целое число:
//  - положительное, если вызывающий объект больше объекта, переданного
//  в качестве параметра;
//  - отрицательное, если вызывающий объект меньше объекта, переданного
//  в качестве параметра;
//  - ноль, если объекты равны.
// Т.е., исходя из этого,
// сравнивая  "Слива" и "Яблоко" получим "+", т.к. "С" меньше "Я",
// а сравнивая "Слива" и "Апельсин" получим "-", т.к. "С" больше "А"
// поэтому в while одно из условий key.compareTo(elements[j]) < 0.

            while (j >= 0 && (key.compareTo(elements[j]) < 0)) {
                // замена элемента
                elements[j + 1] = elements[j];
                j--;
            }
            // присвоение элементу значения для сравнения
            elements[j + 1] = key;
        }
    }
}
