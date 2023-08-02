package DataType.string;

public class Substring {
    public static void main(String[] args) {
        String q = "qwerAaAtyqqqqqqq";
        String substring = q.substring(4, 7); // aaaa
        System.out.println(substring);

        String str = "Software And Hardware!";
        String substr1 = str.substring(13);
        System.out.println(substr1);
        System.out.println(str.substring(0, 8));
        System.out.println(str.substring(13, 17));


    }
}
