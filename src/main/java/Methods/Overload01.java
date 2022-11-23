package Methods;

/*
 Перегрузка методов - использование методов с одним и тем же именем,
 но с разными типами и/или количеством параметров.
 На перегрузку методов влияют количество и типы параметров.
 При вызове метода в зависимости от типа и количества передаваемых параметров
  система выберет именно ту версию, которая наиболее подходит.
**/

public class Overload01 {

    public static void main(String[] args) {

        System.out.println(sum(8.5, 4.2));

        System.out.println(sum(6.7, 9.2));

        System.out.println(sum(8, 2, 7));
    }


    private static int sum(int x, int y) {
        return x + y;
    }

    private static double sum(double x, double y) {
        return x / y;
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }
}
