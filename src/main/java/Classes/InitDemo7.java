package Classes;
/*
Fields marked by the keyword final are used to describe read-only properties of
a class or object. As you know, after initialization, you cannot change the value
of a final variable. Thus, this field should be initialized in one of three ways:

In the same line where it is declared
In each constructor
In one of the dynamic initializers
 */
public class InitDemo7 {
    private final int XX = 50;

    private final int ZZ;
    private final int YY;
    {
        ZZ = 20;
        System.out.println("Dynamic section");
    }
    public InitDemo7() {
        YY = 30;
        System.out.println("Constructor");
    }

//    protected void finalize() {
//    }

    public static void main(String[] arg) {
        System.out.println("Main");
        InitDemo7 obj = new InitDemo7();
    }
}