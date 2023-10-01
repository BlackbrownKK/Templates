package Arrays.leedcode;

import static java.lang.String.valueOf;

public class ReverseInteger {

    public static void main(String[] args) {
        int input = 1534236469;
        System.out.println(reverse(input));
    }

    public static int reverse(int x) {

        if (x == 0) return 0;
        StringBuilder stringBuilder = new StringBuilder();
        String result = valueOf(x);
        stringBuilder.append(result);
        stringBuilder.reverse();

        if (stringBuilder.charAt(0) == '0') {
            stringBuilder.deleteCharAt(0);
        }

        if (stringBuilder.charAt(stringBuilder.length() - 1) == '-') {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            String stringBuilderNew = "-" +
                    stringBuilder;
            try {
                return Integer.parseInt(stringBuilderNew);
            }  catch (NumberFormatException exception) {
                return 0;
            }
        }
        try {
            return Integer.parseInt(stringBuilder.toString());

        } catch (NumberFormatException exception) {
            return 0;
        }
    }
}
