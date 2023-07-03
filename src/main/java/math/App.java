package math;

public class App {
    public static void main(String[] args) {
//        System.out.println(010 | 4);
        System.out.println(12345 + 5432l);
        int valueInt = 34_567;
        short valueShort = (short) valueInt;
        System.out.println(valueInt + " -> " + valueShort);

        double valDouble = 1.0e-46;
        float valFloat = (float) valDouble;
        System.out.println(valDouble + " -> " + valFloat);
    }
}
