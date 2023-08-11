package DataType.regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherEx1 {
    public static void main(String[] args) {
        String text = "This is my second java 45 project.\n" +
                "It is wonderful to learn polysemantics and arrays.\n" +
                "The weather is cold like it should be in winter, but we are all looking forward to spring.";
        Pattern p = Pattern.compile("\\b[\\w]{2}\\b");
        Matcher m = p.matcher(text);
        while (m.find()) {
            int start = m.start();
            int end = m.end();
            System.out.println("Found matches " + text.substring(start,end) + " from "+ start + " to " + (end-1) + " positions");
        }

    }
}
