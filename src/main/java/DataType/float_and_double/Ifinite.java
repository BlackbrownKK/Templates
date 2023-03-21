package DataType.float_and_double;

public class Ifinite {
    public static void main(String[] args) {
        double dl = Double.valueOf(314159E-5);
        float fl = Float.valueOf(3.14159F);

        System.out.println(dl);
        System.out.println(fl);

        Double scs = Double.valueOf(dl);
        System.out.println(scs +  ": "  + scs.isInfinite() + ", " + scs.isNaN()) ;

        Double dl2 = Double.valueOf(1/0.);
        System.out.println(dl2 +  ": "  + dl2.isInfinite() + ", " + dl2.isNaN()) ;
        System.out.println(dl2.doubleValue());
        Double d23 = Double.valueOf(0/0.);
        System.out.println(d23 +  ": "  + d23.isInfinite() + ", " + d23.isNaN()) ;



    }
}
