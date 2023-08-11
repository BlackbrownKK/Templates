package exceptions.ThrowDemo;

public class ThrowV2 {
    public static void main(String[] args) {
        try {
            testExcp();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testExcp() {
        throw new RuntimeException("test");
    }
}
