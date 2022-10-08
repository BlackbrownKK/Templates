package InterfacesAbstract.interface_method_static;

// Статический метод интерфейса вызывается
// в классе реализации интерфейса.
// В отличие от метода по умолчанию, статический метод,
// определенный в интерфейсе, не может быть переопределен
// в классе.
public class MessageDemo implements Message {

    static String someText;

    public static void main(String[] args) {

        MessageDemo messageDemo = new MessageDemo();

        // Вызов статического метода интерфейса.
        // Возможно.
        Message.getMessageA();

        // Вызов статического метода интерфейса.
        // Невозможно.
//        messageDemo.getMessageA();

        someText = "Какой-то текст...";
        // Вызов абстрактного метода интерфейса
        messageDemo.getMessageB(someText);
    }

    // Переопределение невозможно !!!
//    @Override
//    public void getMessageA() {
//        System.out.println("Что это?");
//    }

    // Переопределение абстрактного метода интерфейса
    @Override
    public void getMessageB(String str) {
        System.out.println(str);
    }
}
