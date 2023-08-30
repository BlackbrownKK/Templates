package wrapper_classes;

public class Number01 {
    public static void main(String[] args) {

        Integer a = 500;
        Integer b = 500;

        System.out.println(a == b);         //false
        System.out.println(a.equals(b));    //true

        int primitiveA = a;
        int primitiveB = b;

        byte b50 = asByte(50);      //50
        byte b500 = asByte(500L);   //-12
    }

    public static byte asByte(Number num) {
        if (num != null) {
            return num.byteValue();
        }
        return 0;
    }
}
