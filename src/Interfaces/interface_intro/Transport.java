package Interfaces.interface_intro;

public class Transport implements Movable {

    // Переопределенные методы примененного интерфейса

    @Override
    public void moveRight() {
        System.out.println("The vehicle is turning right.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Traffic turns left.");
    }


    // Собственные методы этого класса

    public void stop() {
        System.out.println("Traffic stops.");
    }

    public void start() {
        System.out.println("Traffic tarts.");
    }

}
