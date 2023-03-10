package DataType.toString;

public class StringJoin {
    public static void main(String[] args) {
        String result = String.join(" ", "Alpha", " Beta" , "Garruna");
        System.out.println(result);
        result = String.join(", ", "John", "ID#: 569",
                "E-mail: John@HerbSchildt.com");
        System.out.println(result);
    }
}
