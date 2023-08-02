package InterfacesAbstract.epam.ex01;

public class App {
    public static void main(String[] args) {
        Person a = new Student(1, "John", 9.8);
        Teacher b = new Teacher(2, "Gari", 16.4);
        System.out.println(a);
        System.out.println(b);
    }
}
