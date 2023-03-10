package Controls;

public class IfElse09 {

    public static void main(String[] args) {
//        System.out.println("parrotTrouble " + parrotTrouble(true, 21));
//        System.out.println("posNeg " + posNeg(-1, 1, true));
//        System.out.println("icyHot " + icyHot(120, -1));
//        System.out.println("loneTeen " + loneTeen(13, 13));
//        System.out.println("startOz " + startOz("olkgfggds"));
        System.out.println(max1020(23, 10));
    }

    public static int max1020(int a, int b) {
        if ((a < 10 && a > 20) && (b < 10 && b > 20)) {
            return 0;
        } else if (a > b && a >=10 && a<=20) {
                return a;
            } else {
                return b;
            }
        }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
        // Need extra parenthesis around the || clause
        // since && binds more tightly than ||
        // && is like arithmetic *, || is like arithmetic +
    }

    //   Given 2 int values, return true if one is negative and one is positive.
//   Except if the parameter "negative" is true, then return true only if both are negative.
//    posNeg(1, -1, false) → true
//    posNeg(-1, 1, false) → true
//    posNeg(-4, -5, true) → true
    public static boolean posNeg(int a, int b, boolean negative) {


        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }

    }

    public static boolean icyHot(int temp1, int temp2) {
        //Given two temperatures, return true if temp1 is less than 0 and the other temp2 is greater than 100.
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 0 && temp2 < 100)) {
            return true;
        } else {
            return false;
        }

    }
    static int resolve(int first, int second, int third) {
        int result = 0;
        if (first == second && second != third) {
            result = third;
        } else if (second == third && second != first) {
            result = first;
        } else if (first == third && second != first) {
            result = second;
        } else if (first == second && first == third) {
            result = -1;
        }
        return result;
    }

    public static boolean loneTeen(int a, int b) {
/*
        We'll say that a number is "teen" if it is in the range 13..19 inclusive.
        Given 2 int values, return true if one or the other is teen, but not both.
        loneTeen(13, 99) → true
        loneTeen(21, 19) → true
        loneTeen(13, 13) → false
 */
        return ((a >= 13 && a <= 19) && (b < 13 || b > 19)) || ((b >= 13 && b <= 19) && (a < 13 || a > 19));
    }

    public static String startOz(String str) {
/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"

 */
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }

        return result;
    }


}


