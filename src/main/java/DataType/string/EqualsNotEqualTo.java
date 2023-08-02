package DataType.string;

public class EqualsNotEqualTo {
    public static void main(String args[]) {
        String sl = "hello";
        String s2 = new String(sl);
        System.out.println(sl + " equals " + s2 + " -> " + sl.equals(s2));
        System.out.println(sl + " == " + s2 + " -> " + (sl == s2));
    }
    }
