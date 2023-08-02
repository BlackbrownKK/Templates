package DataType.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAll {
    /*
    каждая входная последовательность "Jon" заменяется выходной последовательностью "Eriс"
     */
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Ken Todd";
        Pattern pat = Pattern.compile("Jon.*? ");
        Matcher mat = pat.matcher(str);

        System.out.println("Иcxoднaя последовательность: " + str);

        str = mat.replaceAll("Eric ");
        System.out.println("Измeнeннaя последовательность: " + str);

        String str3 = "   Gr d    f";
        System.out.println(str3.replaceAll("\\s+", ""));
        String str4 = "5345342535jbhbhkm235 l  52k3jb 2kgk";

        String[] stArr = str4.split("\\d+");
        String[] stArr8 = str4.split("\\D+");
        System.out.println(Arrays.toString(stArr));
        System.out.println(Arrays.toString(stArr8));
    }
}
