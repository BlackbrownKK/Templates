package DataType.string;

public class StartsWith {
    public static void main(String[] args) {
        String name = "Foobar";

        boolean result =name.endsWith("bar");
        boolean result2 = name.startsWith("Foo");
        System.out.println(result);
        System.out.println(result2);

    }

}
