package Interfaces.interface_method_default;

public class Main {

    public static void main(String[] args) {
        Movable truck = new Truck();
        truck.move();
        truck.moveFast();

        Movable car = new Car();
        car.move();
        car.moveFast();
    }
}
