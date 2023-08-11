package DataType.regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App2 {
    public static void main(String[] args) {
        String str = "Lena, Sveta, Lulu, Natalia, lana";
        Pattern p = Pattern.compile("L.*?\\b");
        Matcher m = p.matcher(str);
        str = m.replaceAll("XXX");
        System.out.println(str);
    }
}
