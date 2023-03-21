package DataType.toString;

public class CharAt {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        char[] ch = new char[10];
        System.out.println(sb.charAt(0)); // текущий объем выделенной памяти
        sb.setCharAt(0, 'V');
        System.out.println(sb);

        sb.getChars(0, 2, ch, 2);
        System.out.println(ch);


    }
}

