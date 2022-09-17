package Interfaces.interface_method_default;

public class Car implements Movable {

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    public void moveFast() {
        System.out.println("Car is moving fast");
    }
}
