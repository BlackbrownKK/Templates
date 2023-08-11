package generic.ex01;

public class Main {
    public static void main(String[] args) {
        System.out.println(GenericMethod.asByte(Integer.valueOf(7)));
        System.out.println(GenericMethod.asByte(Float.valueOf(7.0F)));
        System.out.println(GenericMethod.asByte(Character.valueOf('7')));
    }
}
