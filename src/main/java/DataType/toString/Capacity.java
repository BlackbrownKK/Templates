package DataType.toString;

public class Capacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity()); // текущий объем выделенной памяти
        System.out.println(sb.length());

        // StringBuffer резервирует свободное пространство для дополнительного
        // манипулирования символьными строками. 16 дополнительных
        // символов добавляются автоматически.

    }
}
