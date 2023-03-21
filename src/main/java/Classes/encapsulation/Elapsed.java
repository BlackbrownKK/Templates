package Classes.encapsulation;

public class Elapsed {
    //Измерение времени выполнения программы
    public static void main(String[] args) {
        long start, end;
        System.out.println(
                "Измерение времени перебора от О до 100000000");
//измерить время перебора от О до 100000000
        start = System.currentTimeMillis();
        // start = System.nanoTime(); наносекунды,
//получить начальный момент времени
        for (long i = 0; i < 1000000001; i++) ;
        end = System.currentTimeMillis();
        // end = System.nanoTime(); наносекунды,
//получить конечный момент времени
        System.out.println("Bpeмя выполнения: " + (end - start));
    }
}
