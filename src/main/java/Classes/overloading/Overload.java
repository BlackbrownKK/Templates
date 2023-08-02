package Classes.overloading;

public class Overload {
    public void test(String s) {
        s = "abcd";
        System.out.println("test(String)");
    }
//    public void test(String s) { // error thet the same
    public void test(double dd) {

        System.out.println("test(double)");
    }
    public double test(int i, double f) {
        System.out.println("test(int, double)");
        return i * f;
    }
    static void do1Job(byte b) {  System.out.println("byte");  }
    static void do1Job(Byte b) {  System.out.println("Byte");  }


    // two types of arguments do not match the types of parameters.

    static void doJob(byte b) {  System.out.println("byte");  }
    static void doJob(int i) {  System.out.println("int");  }
    static void doJob(double d) {  System.out.println("double");  }

    static void doJob(String s) {  System.out.println("String");  }
    static void doJob(Object o) {  System.out.println("Object");  }

    static void doJob1(int i) {  System.out.println("int");  } //byte → int.
    static void doJob1(Double d) {  System.out.println("Double");  }

    static void doJob(String... ss) {
        System.out.println("String...");
    }
    static void doJob(String s1, String s2) { //error
        System.out.println("String, String");
    }
    static void doJob(byte s1, byte s2) { //error
        System.out.println("String, String");
    }
    static void doJob(String s1, String... str) {  //error
        System.out.println("String, String...");
    }
    public static void main(String[] args) {
        short s = 10;
        long x = s;
        double dd = s;
        doJob(s);
        doJob(x);
        doJob(dd);

        String str = "abcd";
        Object obj = str;
        doJob(str);
        doJob(obj);

        byte b = 5;
        Byte bb = b;
        doJob(b);
        doJob(bb);
        doJob("hi");
//        doJob("hi", "hi", "hi"); //error
    }

    }
