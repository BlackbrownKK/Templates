package DataType.string;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

    }
}
