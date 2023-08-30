package recursion;

public class Demo01 {

    public static void main(String[] args) {
        System.out.println(gcd(5, 3));
        System.out.println(factorial(3));
        System.out.println(factorialRecursion(3));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursion(int n) {
        if (n==0)return 1; //! condition

       return n * factorialRecursion(n-1);
    }
}
