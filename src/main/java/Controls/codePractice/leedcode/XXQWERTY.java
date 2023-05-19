package Controls.codePractice.leedcode;

public class XXQWERTY {
    public static void main(String[] args) {
        System.out.println(doubleX("xaxxx"));
        System.out.println(doubleX2("xaxxx"));
    }

    public static boolean doubleX(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length-1; i++) {
            char a = Character.toLowerCase(ch[i]);
            char b = Character.toLowerCase(ch[i+1]);
            if (a == 'x' && b == 'x') return true;
        }
        return false;
    }

    public static boolean doubleX2(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;
        if (i+1 >= str.length()) return false;
        return str.substring(i+1, i+2).equals("x");
    }

}
