package Interfaces.interface_method_static;

// Простой статический метод определяется
// и объявляется в интерфейсе
public interface Message {

    // статический метод
    static void getMessageA() {
        System.out.println("Это статический метод!");
    }

    // абстрактный метод
    void getMessageB(String str);
}
