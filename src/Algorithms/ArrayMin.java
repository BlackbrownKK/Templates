package Algorithms;

// Поиск минимального значения в массиве
public class ArrayMin {

    // Декларируем переменные
    static int[] nums;
    static int minValue;

    public static void main(String[] args) {

        // Инициализация переменных
        nums = new int[]{24, 9, 93, 127, 13, 20};
        minValue = nums[0];

        // Через цикл находим минимум
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }

        // Вывод минимального значения через
        // метод println() с использованием
        // конкатенации строк.
        System.out.println("Min value: " + minValue);
    }
}
