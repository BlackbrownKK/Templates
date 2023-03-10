package Controls.codePractice;

import java.util.Arrays;

public class practiceIfElse {

    public static int sumDouble(int a, int b) {
        if (a == b) return (a + b) * 2;
        else return a + b;
    }

    public boolean makes10(int a, int b) { //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
        return (a + b == 10) || (a == 10 || b == 10);
    }

/*
Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged.
Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"

 */

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 2).equals("not")) {
            return str;
        }
        return "not " + str;
    }


    public static String front3(String str) {
/*front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"

 */
        String result = "";
        if (str.length() >= 3) result = str.substring(0, 3);
        else result =  str;
        return result+result+result;

    }

    public static void main(String[] args) {
        System.out.println(front3 ("f"));
    }
}
