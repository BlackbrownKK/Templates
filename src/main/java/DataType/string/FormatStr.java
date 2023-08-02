package DataType.string;

public class FormatStr {
//  %d – integer (int, long, …)
//  %f – real number (float, double)
//  %s – string
//  %c – character
//  %% – character %
//  %t – date/time
//  %b – boolean value

    public static void main(String[] args) {
        String formatString = "We are printing double variable (%f), string (\"%s\") and integer variable (%d).";
        System.out.println(String.format(formatString, 0.7, "Java", 10));
    }
}
