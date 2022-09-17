package Algorithms;

import java.util.Scanner;

// СОРТИРОВКА ПУЗЫРЬКОМ
//
// Алгоритм состоит в повторяющихся проходах по сортируемому массиву.
// На каждой итерации последовательно сравниваются соседние элементы, и,
// если порядок в паре неверный, то элементы меняют местами.
// За каждый проход по массиву как минимум один элемент встает на свое место,
// поэтому необходимо совершить не более n−1 проходов, где n размер массива,
// чтобы отсортировать массив.
//
// Сравнивает соседние элементы и меняет местами если они не отсортированы.
// Пузырьковая сортировка названа таким образом потому,
// что в этом способе сортировки, большие элементы постепенно всплывают
// в верхнюю/правую часть списка.


public class BubbleSortC {

    public static void main(String[] args) {
        int i;
        int j;
        int n;
        int[] arr;
        int temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("\nEnter array elements: ");
        for (i = 0; i < n; ++i)
            arr[i] = sc.nextInt();

        // сортировка в возрастающем порядке
        for (i = 0; i < n; ++i) {
            for (j = 0; j < (n - i - 1); ++j) {
                // для сортировки в убывающем порядке,
                // меняем знак на <
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nArray sorted: ");
        for (i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
