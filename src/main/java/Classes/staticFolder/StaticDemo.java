package Classes.staticFolder;

public class StaticDemo {
//    Static methods are not polymorphic; that is, the method version to be executed is determined at compile time.

//    Static methods can be called from instance methods directly, just like static class fields.

//    Static methods are not linked to a class instance and thus cannot use the keywords this or super to access
//    a specific object.

//    Static methods cannot access instance fields and methods directly. To access these, you need to create
//    or receive a reference to the object.

        static int a = 42;
        static int b = 99;
        static void callme() {
            System.out.println("a = " + a);
        }
    }
