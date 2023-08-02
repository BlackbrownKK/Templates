package DataType.string;

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

    public String nTwice(String str, int n) {
        String res = str.substring(0, n) + str.substring(str.length()-n, str.length());
        return res;

//        str.toCharArray();
//        char[] ch1 = new char[n*2];
//        str.getChars(0, n, ch1, 0);
//        str.getChars(str.length() - n, str.length(), ch1, n+1);
//        char[] ch3 = new char[n * 2];
//        String res = Arrays.toString(ch1);


    }

}

