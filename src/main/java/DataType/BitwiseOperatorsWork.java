package DataType;

public class BitwiseOperatorsWork {
    public static void main(String[] args) {
        int b1 = 0b1011; //11
        int b2 = 0b0101; // 5
        int i = 0;
        System.out.println(b1 + "|" + b2 + " = " + (b1|b2));
        System.out.println(b1 + "&" + b2 + " = " + (b1&b2));
        System.out.println(b1 + "^" + b2 + " = " + (b1^b2));
        System.out.println( "~" + b2 + " = " + ~b2);
        System.out.println(b1 + ">>" + ++i + " = " + (b1>>i));
        System.out.println(b1 + "<<" + i + " = " + (b1<<i++));
        int j = 10 + 33 % 5 * 7 / 3 % 4 + 3 ;
        System.out.println(j);


    }
    public int teenSum(int a, int b) {
        int c;
        c = a+b;
        if (c <= 13 && c >= 19)   return  19;
        return c;
    }
}
