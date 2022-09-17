package Interfaces.interface_intro;

// Абстрактный класс может переопределять
// не все методы интерфейса, в отличие от
// обычного класса
public abstract class Robot implements Movable {

    @Override
    public void moveRight() {
        System.out.println("Robot turns right.");
    }

    @Override
    public void moveLeft() {
        System.out.println("The robot turns left.");
    }

}
