package exceptions;

public class TestGthrow {
    static void testG() {
        try {
            throw new ClassCastException("Demo");
        } catch (ClassCastException  exp) {
            System.out.println("Exception in method!");
            throw exp;
        }
    }
    public static void main(String[] args) {
        try {
            testG();
        } catch (ClassCastException e) {
            System.out.println("Exception of method!");
        }
    }
}
