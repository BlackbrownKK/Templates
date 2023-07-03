package polymorphism.demo_02;

public class Main {
    public static void main(String[] args) {
        Base object = new SubClass(); // мы переопредели метод
        object.print();
    }
}
