package Classes.staticFolder;

public class CustomMath {
    /*
    Example. The class CustomMath has no instance fields. Methods receive data through their parameters;
    that is, class instances are stateless. Because of this, methods should be declared as static.

    Recommendation:
    Methods that receive everything they need through parameters are auxiliary and should be declared as static.

     */
    public static int percent;

    public static int add(int x, int y) {
        return x + y + percent;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }


    public static void main(String[] args) {
        System.out.println(multiply(1,3));
        System.out.println(add(1,3));
    }
}
