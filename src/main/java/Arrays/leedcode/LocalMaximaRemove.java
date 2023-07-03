package Arrays.leedcode;

import java.util.Arrays;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};// 6*** x1.xx.4..xx.7..xx.10.xx.13.xx..16.xx..19
        int[] array1 = new int[]{-3, 2, 4, 13, 5, 12, 8};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {
        if (array == null || array.length == 0) throw new UnsupportedOperationException();
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isMax = true;
            if (i > 0 && array[i] <= array[i - 1]) {
                isMax = false;
            }
            if (i < array.length - 1 && array[i] <= array[i + 1]) {
                isMax = false;
            }
                if (!isMax) {
                    result[index] = array[i];
                    index++;
                }
            }

        int[] newResult = new int[index];
        for (int i = 0; i < newResult.length; i++) {
            newResult[i]=result[i];
        }

        return newResult;
    }
}
