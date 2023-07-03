package DataType.string;

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
    }
}
