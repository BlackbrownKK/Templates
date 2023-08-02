package InterfacesAbstract.epam.severalInterfaces;

public class Demo3 {
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        System.out.println(obj.someMethod());
        System.out.println(((Interface2) obj).someMethod());
        System.out.println(((Interface1) obj).someField);

        System.out.println(Interface1.someField);


    }
}
