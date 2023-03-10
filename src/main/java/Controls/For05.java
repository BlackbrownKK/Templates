package Controls;

// Оператор continue.
// Продолжение выполнения после истинности условия.
// Оператор continue позволяет продолжить цикл после
// определенного значения.
// Проход по массиву.
public class  For05 {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 6, 4, 5, 9, 7, 3};

        for (int g = 0; g < arr.length; g++) {
            if (arr[g] > 8)
                continue; // <- Оператор continue
            System.out.print(arr[g] + " ");
        }
    }

    public static int resolve3(int[] array, int arraySize) {
        int result = 0;
        for (int i = 0; i < arraySize; i++){
            if ((array[0] == 0) && (array[2] == 0)) {
                return result = i+1;
            } else  result = -1;
        }
        return result;
    }

}
