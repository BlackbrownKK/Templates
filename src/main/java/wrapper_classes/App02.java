package wrapper_classes;

public class App02 {
    public static void main(String[] args) {
        Integer a = new Integer(50);
        Integer b = new Integer(50);

        System.out.println(a == b);         //false
        System.out.println(a.equals(b));    //true



        Integer c = Integer.valueOf(50);
        Integer d = Integer.valueOf(50);
        System.out.println(c == d);         //true
        System.out.println(c.equals(d));    //true

        //Integer cache stores only values between -128 and 127. It is considered to cover most of frequently used values in practice.
        Integer f = Integer.valueOf(500);
        Integer e = Integer.valueOf(500);
        System.out.println(f == e);         //false
        System.out.println(f.equals(e));    //true

        int primitiveA = f.intValue();
        int primitiveB = e.intValue();


        Integer i2 = Integer.valueOf("0010", 2);
        System.out.print(i2);

        Float f1 = new Float(3.1f);          //line1
        Float f2 = new Float("3.1f");        //line2
        Float f3 = Float.valueOf("3.1f");    //line3
        System.out.print(f1 + "" + f2 + f3);


        System.out.println();
        Integer  i  =  new  Integer(5);
        Integer r =  i;
        i  = 5;
        System.out.println(i == b);
        //The operation i=5; initializes the reference with a new object; therefore,
        // the operation of reference comparison will give a result of false.


    }
}
