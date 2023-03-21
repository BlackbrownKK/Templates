package Collection.Set.Arrays.leedcode;

import java.util.NavigableSet;

public class WithoutRepeating {

    public static void main(String[] args) {
        String s1 = "abcabcbb"; // 3
        String s2 = "bbbbb"; // 1
        String s3 = "pwwkew"; // 3
        String s4 = " "; // 1

        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println(lengthOfLongestSubstring(s4));

    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        int earlyResult = 0;

        char[] toChar = s.toCharArray();
        if (s  == " " ) {
            return 1;
        }else {

            for (int i = 0; i < toChar.length; i++) {
                for (int j = i + 1; j < toChar.length; j++) {
                    if (toChar[i] == toChar[j]) {
                        earlyResult = j - i;
                        if (earlyResult > result) {
                            result = earlyResult;
                        }
                        break;
                    }
                }
                if (earlyResult > result) {
                    result = earlyResult;
                }

            }
            return result;
        }
    }
}



