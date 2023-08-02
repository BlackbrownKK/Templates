package Classes_Inner.demo;

public class DemoInnerClass {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 5, 6, 7, 8, 9};
        Outer outOb = new Outer(x);
        outOb.analyze();
    }
}
