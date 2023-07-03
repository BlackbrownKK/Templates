package Classes.demo_08;

public class App {
    public static void main(String[] args) {
        D1 d1 = new D1();
        d1.setX(3);
        System.out.println(d1.length());
        D1 d2 = new D2();
        d2.setX(3);
        ((D2)d2).setY(4);
        System.out.println(d2.length());
    }
}
