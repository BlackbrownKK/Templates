package Algorithms;

// Вычисление суммы элементов массива
public class ArraySum {

    // Декларируем переменные
    static int[] nums;
    static int sum;

    public static void main(String[] args) {

        // Инициализация переменных
        nums = new int[]{24, 9, 93, 127, 13, 20};
            sum = 0;

        // Через цикл for-each находим сумму.
        // Перебираем массив и добавляем каждый
        // элемент к суммирующей переменной.
        for (int value : nums) {
            // Используем составной оператор +=
            sum += value;
        }

        // Выводим сумму через
        // метод println() с использованием
        // конкатенации строк.
        System.out.println("Sum is " + sum);
    }
}
