package Arrays.leedcode;
/*
int multiArithmeticElements(int a1, int t, int n)
Create function multiArithmeticElements, which determines the multiplication of
the first n elements of arithmetic progression of int numbers with a given initial
element of progression a1 and progression step t. an is calculated by the formula (an+1 = an + t).

For a1 = 5, t = 3, n = 4 multiplication equals to 5811*14 = 6160
 */
public class MultiplicationElements {

    public static void main(String[] args) {
        System.out.println(multiArithmeticElements(5,3,4));
    }
    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n <= 0) throw new IllegalArgumentException("only positgive");
        int res = 1;
        do {
            res = res * a1;
            a1 = a1 + t;
            n--;
        }
        while (n != 0);
        return res;
    }
}
