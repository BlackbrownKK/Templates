package generic.ex02;

public class Main {
    public static void main(String [] args) {
        double  aD = Math.random() * 100;
        double  bD = Math.random() * 100;
        short   aS = (short)(Math.random() * 100);
        short   bS = (short)(Math.random() * 100);

        Div<Double>  divD  = new Div <>(aD, bD);
        System.out.println(aD + " : " + bD + " = " + divD.perform());
        Div <Short>  divS  = new Div <>(aS, bS);
        System.out.println(aS + " : " + bS + " = " + divS.perform());
//        Div <Character>   obj3 = new Div<>('9', '2'); // error
    }
}
