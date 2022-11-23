package DataType;

// Явное приведение типов в выражениях
public class DataType04 {

    public static void main(String[] args) {
        byte b = 27;

        // приведение типа int к byte
        b = (byte) (b * 2);
        System.out.println(b);
    }
}
