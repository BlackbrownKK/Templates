package Algorithms;

// Поиск двух максимальных значений
public class ArrayTwoMaxNumber {

    public static void main(String[] args) {

        int[] arr = {4, 12, 6, 1, 5, 28, 7};

        int num01 = 0;
        int num02 = 0;

        for (int n : arr) {
            if (num01 < n) {
                num02 = num01;
                num01 = n;
            } else if (num02 < n) {
                num02 = n;
            }
        }

        System.out.println(num01 + "\n" + num02);
    }
}