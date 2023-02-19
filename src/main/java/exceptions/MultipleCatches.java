package exceptions;

public class MultipleCatches {

    public static void main(String args[]) {
        try {
            int а = args.length;
            System.out.println("a " + а);
            int Ь = 42 / а;
            int с[] = {1};
            с[42] = 99;
        } catch (ArithmeticException е) {
            System.out.println("Дeлeниe на нуль: " + е);
        } catch (ArrayIndexOutOfBoundsException е) {
            System.out.println("Oшибкa индексации за пределами"
                    + "массива: " + е);
            System.out.println(
                    "После блока операторов try/catch.");
        }
    }
}
