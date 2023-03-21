package DataType;

public class Boolean {
    public static void main(String[] args) {
        boolean b = true;
        // Автоупаковка/распаковка логического значения типа boolean
        if(b) System.out.println("b равно true");

        boolean b1 = true;
        boolean b2 = true;
        // when bool values are true logicalAnd() method returns true
        boolean b3 = java.lang.Boolean.logicalAnd(b1,b2);
        System.out.println(b3);


    }


}
