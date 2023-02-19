package Operations;

public class TernaryOperator_2 {

    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;

//        System.out.println("Absolut value i = " + i + "Value i = " + k);

        i = -10;
        k = i < 0 ? -i : i;

//        System.out.println("Absolut value i = " + i + "Value i = " + k);

        int a, b;
        a = 5;
        b = a < 7 ? -a*5 : a;
        System.out.println(a);
        System.out.println(b);


    }

}
