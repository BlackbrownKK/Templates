package Controls.codePractice.leedcode;

public class HiHiHi {
/*
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */

    public static void main(String[] args) {

        System.out.println(stringTimes("hi", 20000)) ;
    }

    public static String stringTimes(String str, int n) {
        String strRes = str;
        if (n==0)return str;
        for (int i = 1; i < n; i++) {
            strRes += str;
        }
        return strRes;
    }
}

