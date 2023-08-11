package DataType.regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAllEx {
    public static void main(String[] args) {
        String text = "This is my second java 45 project.\n" +
                "It is wonderful to learn polysemantics and arrays.\n" +
                "The weather is cold like it should be in winter, but we are all looking forward to spring.";

        System.out.println("Before:\n" + text);
        Pattern p = Pattern.compile("\\b[\\w]{2}\\b");
        Matcher m = p.matcher(text);
        text = m.replaceAll("lab2");
        System.out.println("\nAfter:\n" + text);
    }
}
