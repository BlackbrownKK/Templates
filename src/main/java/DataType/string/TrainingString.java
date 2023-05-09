package DataType.string;

public class TrainingString {
    public static void main(String[] args) {

        System.out.println(theEnd("fvdvsd", true));
        System.out.println(withouEnd2("cdvs"));
        System.out.println(middleTwo("string"));
    }

    public static String theEnd(String str, boolean front) {
        String stRes = "";
        if (front) stRes = String.valueOf(str.charAt(0));
        else stRes = String.valueOf(str.charAt(str.length() - 1));
        return stRes;
    }

    public static String withouEnd2(String str) {
        String stRes = "";
        if (str.length() <= 2) return stRes;
        return str.substring(1, str.length() - 1);

    }

    public static String middleTwo(String str) {
        String res = "";
        res = String.valueOf(str.charAt(str.length() / 2-1)) + String.valueOf(str.charAt(str.length() / 2));
        return res;
    }

}


