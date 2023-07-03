package Classes;
public class InitDemo6_priority {
    /*
The process of class static initialization.
Initialization of static fields with default values.
Initialization of static fields with statements.
Execution of static initializers.
If a startup command specifies a class to run, its main method is executed. This method becomes an entry point to the program.

Initialization process when creating an instance of a class
Recursive call and execution of the superclass constructors—parent classes.
Initializing the fields of the class instance with default values or initial values.
Execution of dynamic initializers.
Execution of the class constructor body.
     */
    private int a = 5;
    private static int b = 100;
    {
        a = -5;
        System.out.println("Dynamic initialization section");
    }
    public InitDemo6_priority() {
        a = 10;
        b = 10;
        System.out.println("Constructor");
    }
    static {
        b = -5;
        System.out.println("Static initialization section");
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        InitDemo6_priority obj = new InitDemo6_priority();
        System.out.println("a=" + obj.a + " b=" + b);
    }
}