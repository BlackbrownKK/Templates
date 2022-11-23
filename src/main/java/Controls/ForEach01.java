package Controls;

// Проход по int массиву.
// Суммирование и отображение значений.
public class ForEach01 {

    public static void main(String[] args) {

        int[] arr = {2, 15, 3, 4, 5, 6, 17, 8, 9, 10};

        int sum = 0;

        // Традиционный цикл for для вычисления суммы
        // значений элементов массива
        // for (int i = 0; i < 10; i++) sum += arr[i];

        // Через for-each
        for (int x : arr) {
            System.out.println("Value: " + x);
            // += - составная операция присваивания,
            // аналогично sum = sum + x;
            sum += x;
        }

        System.out.println("Total sum is " + sum);
    }
}
