package Algorithms;

// Поиск среднего арифметического значения.
// Среднее арифметическое = сумма чисел / количество чисел.
public class ArrayAverage {

    // Декларируем переменные
    static int[] nums;
    static double average;
    static int sum;

    public static void main(String[] args) {

        // Инициализация массива
        nums = new int[]{5, 8, 12, -8, -4, 37, 15};

        // Через цикл подсчитываем сумму элементов массива
        for (int j = 0; j < nums.length; j++) {
            // Используем составной оператор +=
            sum += nums[j];
        }

        // Цикл for-each, выполняет аналогичную работу
        // по подсчету суммы элементов массива
//        for (int num : nums) {
//            sum += num;
//        }

        // Находим среднее арифметическое значение
        average = (double) sum / nums.length;

        // Вывод среднего арифметического значения,
        // с округлением до 3-х знаков после десятичного
        // разделителя. Используется метод printf()
        System.out.printf("Average value: %.3f", average);
    }
}
