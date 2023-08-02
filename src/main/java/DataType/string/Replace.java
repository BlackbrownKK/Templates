package DataType.string;

public class Replace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Этo простой тест.");
        sb. replace ( 4, 8, "был") ;
        System.out.println("Пocлe замены: " + sb);

        String str1 = "\tWelcome \n";
        System.out.println(str1);
    }
}
