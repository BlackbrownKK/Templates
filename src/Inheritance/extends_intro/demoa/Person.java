package Inheritance.extends_intro.demoa;

public class Person {

    private final String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}
