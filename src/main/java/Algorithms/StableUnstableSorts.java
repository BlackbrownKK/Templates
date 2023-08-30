package Algorithms;

public class StableUnstableSorts {

    public static void main(String[] args) {

        int[] numbers = {9, 3, 12, 5, 2, 24, 16, 7};

        stableSorts(numbers);

        for (int number : numbers)
            System.out.print(number + " ");
    }


    public static void stableSorts(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int current = a[i]; //   *(j)  *(current)  *  *  *
            System.out.println("---");


            int j = i - 1;
            for (int number : a)  System.out.print(number + " ");


            while (j >= 0 && a[j] > current) {
                a[j + 1] = a[j];
                j--;
                System.out.println("---");
                for (int number : a)  System.out.print(number + " ");
            }
            a[j + 1] = current;
            System.out.println("---");
            for (int number : a)  System.out.print(number + " ");
            System.out.println("---");
        }
    }
}

