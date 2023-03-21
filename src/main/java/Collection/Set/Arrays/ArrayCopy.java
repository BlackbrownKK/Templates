package Collection.Set.Arrays;

import java.util.Arrays;

public class ArrayCopy {

    static byte a[] = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74};
    static byte b[] = {77, 77, 77, 77, 77, 77, 77, 77, 77, 77};

    static int[] qwerty = {2, 6, 7, 9, 3};

    public static void main(String args[]) {
        System.out.println("a = " + new String(a));
        System.out.println("b = " + new String(b));
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println("a = " + new String(a));
        System.out.println("b = " + new String(b));
        System.out.println(sevenBoom(qwerty));
        System.out.println(sevenBoom2(qwerty));
        System.out.println(sevenBoom3(qwerty));
    }

    public static String sevenBoom(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            String allNubberToString = String.valueOf(arr[i]);
            char[] everyNumFromString = allNubberToString.toCharArray();
            for (int j = 0; j < everyNumFromString.length; j++) {
                if (everyNumFromString[j] == '7') return "Boom!";
            }

        }
        return "there is no 7 in the array";
    }


    public static String sevenBoom2(int[] arr) {
        return Arrays.toString(arr).contains("7") ? "Boom!"
                : "there is no 7 in the array";
    }

    public static String sevenBoom3(int[] arr) {
        for (int i : arr) {
            String s = Integer.toString(i);
            if (s.contains("7")) {
                return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }

    }




