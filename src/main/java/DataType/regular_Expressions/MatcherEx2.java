package DataType.regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherEx2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\w*");
        Matcher m = p.matcher("Thanks!");
        System.out.println(m.matches());

        Pattern a = Pattern.compile("\\w*");
        Matcher ma = a.matcher("Thanks!");
        System.out.println(ma.lookingAt());
    }
}
