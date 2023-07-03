package polymorphism.demo_01;

public class Main {
    public static void main(String[] args) {
       A a = new B();
        System.out.println(a.version + a.testMethod()); // мы же переопределили только метод 1.0 AB
    }
}
