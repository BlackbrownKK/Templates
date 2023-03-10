package Enums.enumEx02;

public class App {
    public static void main(String[] args) {
        Apple ap;
// вывести цену на яблоко сорта Winesap
        System.out.println("Яблoкo сорта Winesap стоит " + Apple.Winesap.getPrice() + " центов. \n");
// вывести цены на все сорта яблок
        System.out.println("Цeны на все сорта яблок:");
        for (Apple a : Apple.values())
            System.out.println(a + " стоит " + a.getPrice()
                    + " центов ");
    }
}
