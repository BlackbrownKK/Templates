package DataType.string;

public class DelDel {
    public static void main(String[] args) {
        String s1 = "abcdel";
        String s2 = "adel2dedbc";
        System.out.println(delDel(s1));
        System.out.println(delDel2(s2));
    }

    public static String delDel(String str) {
        if (str.contains("del")) {
            StringBuffer stringBuffer = new StringBuffer(str);
            stringBuffer.delete(str.indexOf("del"), str.indexOf("del") + 3);
            String result = String.valueOf(stringBuffer);
            return result;
        } else {
            return str;
        }
    }

    public static String delDel2(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            // First char + rest of string starting at 4
            return str.substring(0, 1) + str.substring(4);
        }
        // Otherwise return the original string.
        return str;
    }
}

