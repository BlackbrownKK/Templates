package Arrays.leedcode;

public class FibonacciSum {
    public static int sumOfFibonacci(int limit) {
        if (limit <= 0) {
            return 0;
        }

        int sum = 0;
        int fib1 = 0;
        int fib2 = 1;

        while (fib1 <= limit) {
            if (fib1 % 2 == 0) {
                sum += fib1;
            }

            int temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }

        return sum;
    }

    public static void main(String[] args) {
        int limit = 11; // Set the limit to calculate the sum of Fibonacci numbers
        int sum = sumOfFibonacci(limit);
        System.out.println("Sum of Fibonacci numbers up to " + limit + ": " + sum);
    }
}
