package Controls;

public class rekursive {

    static double fact(int n) {
        double result;
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
       double k =  fact(100);
        System.out.println(k);
    }
}
