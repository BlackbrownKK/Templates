package Interfaces.interface_method_default;

public class Truck implements Movable {

    @Override
    public void move() {
        System.out.println("Truck is moving");
    }

    public void moveFast() {
        System.out.println("Truck is moving fast");
    }
}
