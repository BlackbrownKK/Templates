package Controls.codePractice.leedcode;

public class More20 {
    public static void main(String[] args) {

    }


    public boolean old35(int n) {
        return n % 15 != 0 && (n % 3 == 0 || n % 5 == 0);
    }
}
/*
Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the %
"mod" operator -- see Introduction to Mod
old35(3) → true
old35(10) → true
old35(15) → false
 */

