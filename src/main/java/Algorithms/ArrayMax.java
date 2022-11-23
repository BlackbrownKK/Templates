package Algorithms;

// Поиск максимального значения в массиве
public class ArrayMax {

    // Декларируем переменные
    static int[] nums;
    static int maxValue;

    public static void main(String[] args) {

        // Инициализация переменных
        nums = new int[]{24, 9, 93, 127, 13, 20};
        maxValue = nums[0];

        // Через цикл находим максимум
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }

        // Выводим максимальное значение через
        // метод println() с использованием
        // конкатенации строк.
        System.out.println("Max value: " + maxValue);
    }
}
