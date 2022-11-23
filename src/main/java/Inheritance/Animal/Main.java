package Inheritance.Animal;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = {new Cat(), new Dog(),new Cat()};
        for (Animal a : animals){
            System.out.println(a.getClass());
        }
    }
}
