package DataType.string;

import java.util.List;

public class Join {
    public static void main(String[] args) {
        String str = String.join("abc", List.of("dsv", "ds"));
        System.out.println(str);

        String s = new String("Java");
        String t = new String();
        String r = null;
        r = s + t + r;
        System.out.println(r);
        r = s + t + 'r';
        System.out.println(r);

        String str2 = "S0";
        for (int i = 1; i <= 6; i++) {
            str2 += "m" + i;
        }
        System.out.println(str2);
    }
}
