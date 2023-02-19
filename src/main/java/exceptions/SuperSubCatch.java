package exceptions;

public class SuperSubCatch {

    public static void main(String args[]) {
        try {
            int а = 0;
            int Ь = 42 / а;
        } catch (Exception е) {
            System.out.println(
                    "Перехват исключений общего класса Exception.");
/* Этот оператор catch вообще не будет достигнут,
так как подкласс ArithmeticException является
производным от класса Exception. */
//        } catch (ArithmeticException е) {
// ОШИБКА: недостижимый код!
            System.out.println("Этoт код вообще недостижим.");

        }
    }
}
