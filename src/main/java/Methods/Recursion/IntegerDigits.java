package Methods.Recursion;

import java.util.Arrays;

public class IntegerDigits {
    public static void main(String[] args) {
        System.out.println(count(12311));
        System.out.println(countRecursive(12311));

    }

    public static int count(int n) {
        String s = Integer.toString(n);
        int result = s.length();
        return result;
        // your recursive solution in here
    }

    public static int countRecursive(int n) {
        int result = 0;
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            result++;
        }
        return result;
}
}

