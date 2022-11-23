package InterfacesAbstract.interface_method_default;

// Метод по умолчанию (default method)
public interface Movable {

    void move();

    default void moveFast() {
        System.out.println("Move fast");
    }
}
