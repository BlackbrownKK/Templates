package DataType.toString;

public class ToStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Объект Ь типа Вох: " + b;
        // выполнить сцепление символьной строки с объектом типа Вох
        System.out.println(b);
        // преобразовать объект типа Вох в символьную
        // строку при выводе на консоль
        System.out.println(s);
    }
}
