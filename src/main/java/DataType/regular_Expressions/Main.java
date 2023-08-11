package DataType.regular_Expressions;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "java";
        Pattern pattern1 = Pattern.compile(str, Pattern.CASE_INSENSITIVE);

        Pattern pattern2 = Pattern.compile(str, Pattern.UNICODE_CASE);
        System.out.println(pattern2);

        System.out.println(Pattern.matches("J.+a","Java"));
        System.out.println(Pattern.matches("J.+a","Java JavaScript"));


    }




}
