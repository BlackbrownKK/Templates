package Classes.demo_07;

public class Main {
    public static void main(String[] args) {
        A qwerty1 = new B();
//        B qwerty2 = new A(); // error
        A qwerty3 = new C();
        B qwerty4 = new C();
//        C qwerty5 = new A(); // error
//        C qwerty6 = new B(); // error
    }
}

/*
Reference to a child class can be assigned an object of the parent class only using explicit typecasting.
 */
