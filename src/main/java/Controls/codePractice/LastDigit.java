package Controls.codePractice;

import java.util.Arrays;

public class LastDigit {
    /*
Given two non-negative int values, return true if they have the same last digit,
such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
     */

    public static boolean lastDigit(int a, int b) {
        // True if the last digits are the same
        return(a % 10 == b % 10);
    }

    public static boolean isSameNum(int x, int y) {
        return x == y;

    }

//    @Test
//    public void test1(){
//        assertEquals(true, Program.isSameNum(2,2));
//    }



    public static void main(String[] args) {
        System.out.println(lastDigit(43, 114));
        boolean [] math = new boolean[]{true,true,true,true, false, false, true, false};
        System.out.println(countTrue(math));
    }


        public static int countTrue(boolean[] arr) {
            int count = 0;
            for (boolean b : arr) {
                if (b == true) {
                    count++;
                }
            }
            return count;
        }
}
