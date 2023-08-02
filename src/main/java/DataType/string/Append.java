package DataType.string;

public class Append {
    public static void main(String[] args) {
        String s;
        int a = 42;
        StringBuffer sb = new StringBuffer(40);
        s = sb.append("a = ") .append(a) .append("!") .toString();
        System.out.println(s); // соединить в цепочку несколько последовательных вызовов

        StringBuffer sq = new StringBuffer("Mнe Java!");
        sq. insert (4, "нравится ");
        System.out.println(sq);


    }
}
