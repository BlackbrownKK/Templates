package exceptions;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, Ь = 0, с = 0;
        Random r = new Random();
        for (int i = 0; i < 32000; i++)
            try {
                Ь = r.nextInt();
                с = r.nextInt();
                a = 12345 / (Ь / с);
            } catch (ArithmeticException е) {
                System.out.println("Дeлeниe на нуль.");
                a = 0; //присвоить нуль и продолжить работу
                System.out.println("a: " + a);
            }
    }
}
