package Controls;

// Java SE 12 представила
// выражения переключения (switch expressions),
// которые (как и все выражения) оцениваются
// как одно значение и могут использоваться в
// операторах.
// Также представлены метки «стрелка», которые
// устраняют необходимость в операторах break
// для предотвращения провала.
public class Switch02 {

    public static void main(String[] args) {

        int num = 1;

        switch (num) {
            case 1 -> System.out.println("num is equal 1");
            case 2 -> System.out.println("num is equal 2");
            default -> System.out.println("num is not equal 1, 2");
        }
    }
}
