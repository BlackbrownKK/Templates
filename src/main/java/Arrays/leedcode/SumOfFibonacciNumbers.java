package Arrays.leedcode;

public class SumOfFibonacciNumbers {

    public static int sumOfFibonacciNumbers(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        try {
            if (n == 0 || n == 1) return n;
            int[] fibonacci = new int[n];
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            int sum = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                sum += fibonacci[i];
            }
            return sum;

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return n;
    }
}
