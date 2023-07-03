package DataType;

public class DataType06 {
    public static void main(String[] args) {
        final byte b1 = 5;
        byte b2 = b1 + 10;
        byte b3 = 50;
        int iVal = -100;
        b3 += iVal--;
        System.out.println(b3);
    }
}
