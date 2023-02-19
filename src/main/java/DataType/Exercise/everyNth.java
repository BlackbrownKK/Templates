package DataType.Exercise;

public class everyNth {

    public static void main(String[] args) {
        System.out.println(everyNth("very well", 4));
        System.out.println(frontBack("War"));
    }

    public static String everyNth(String str, int n) {
        String result = "";

        // Look at every nth char
        for (int i = 0; i < str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true || bSmile == true) {
            return true;
        } else if (aSmile == false || bSmile == false) {
            return true;
        } else {
            return false;
        }
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length() - 1);
        // last + mid + first
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        } else return false;
    }
}