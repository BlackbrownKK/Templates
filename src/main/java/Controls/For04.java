package Controls;

// Оператор break.
// Прекращение выполнения после истинности условия.
// Оператор break позволяет выйти из цикла в любой
// его момент, даже если цикл не закончил свою работу.
// Проход по массиву.
public class For04 {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 6, 4, 5, 9, 7, 3};

        int arrLen = arr.length;
        System.out.println("The length of the array is " + arrLen);

        for (int f = 0; f < arrLen; f++) {
            // Оператор break срабатывает когда
            // возникает элемент массива, соответствующий
            // условию в if
            if (arr[f] > 8)
                break; // <- Оператор break
            System.out.print(arr[f] + " ");
        }
    }
}
