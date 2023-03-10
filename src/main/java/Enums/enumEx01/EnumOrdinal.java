package Enums.enumEx01;

public class EnumOrdinal {
    public static void main(String[] args) {
        Apple ар, ар2, арЗ;
        // получить все порядковые значения c помощью метода ordinal()
        System.out.println("Bce константы сортов яблок "
                + "и их порядковые значения: ");
        for (Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal());
        ар = Apple.RedDel;
        ар2 = Apple.GoldenDel;
        арЗ = Apple.RedDel;
        System.out.println();
        // продемонстрировать применение методов compareTo() и equals()
        if(ар.compareTo(ар2) < 0)
            System.out.println(ар + "предшествует" + ар2);
        if(ар.compareTo(ар2) > 0)
            System.out.println(ар2 + " предшествует " + ар);
        if(ар.compareTo(арЗ) == 0)
            System.out.println(ар + " равно " + арЗ);
        System.out.println();
        if(ар.equals(ар2))
            System.out.println("Oшибкa!");
        if(ар.equals(арЗ))
            System.out.println(ар + " равно " + арЗ);
        if(ар == арЗ)
            System.out.println(ар + " " + арЗ);
    }

}
