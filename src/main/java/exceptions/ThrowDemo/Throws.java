package exceptions.ThrowDemo;

public class Throws {
    static void throwOne() throws IllegalAccessException {
        System.out.println("B теле метода throwOne() .");
        throw new IllegalAccessException("дeмoнcтpaция");
    }

    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException е) {
            System.out.println("Пepexвaчeнo исключение: " + е);
        }
    }
}
