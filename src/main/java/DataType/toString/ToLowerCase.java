package DataType.toString;

public class ToLowerCase {

    public static void main(String[] args) {
        String org = "This is а test. This is, too.";
        String test = "Hello";
        System.out.println(org.toLowerCase());
        System.out.println(org.toUpperCase());
        System.out.println(endUp(test));
    }

    public static String endUp(String str) {
        String result;
        if (str.length() >= 3) {
            result = str.substring(0, str.length()-3).concat(str.substring(str.length()-3).toUpperCase());
        } else {
            result = str.toUpperCase();
        }
        return result;
    }
}
