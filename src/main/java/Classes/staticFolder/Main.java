package Classes.staticFolder;

public class Main {
    public static void main(String[] s) {
        StaticDemo.callme();//without creating an object that is not needed to interact with the fields and methods
        // of the class StaticDemo.
        System.out.print("b = " + StaticDemo.b);
    }
}
