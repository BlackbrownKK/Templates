package Classes.hashCode;

import Classes.encapsulation.Box;

public class DemoHashCode { // The method hashCode() should always be overridden when the method equals(Object) has been overridden.
    public static void main(String[] args) {
        Box box = new Box(1, 2, 3);
        Box box1 = new Box(1, 2, 3);
        Box box2 = box1;
        System.out.println(box.hashCode());
        System.out.println(box1.hashCode());
        System.out.println(box.equals(box1));
        System.out.println(box2.hashCode());
        System.out.println(box1.hashCode());
        System.out.println(box2.equals(box1));
    }
}
