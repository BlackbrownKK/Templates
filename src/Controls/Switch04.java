package Controls;

// Java SE 12 представила
// выражения переключения (switch expressions).
public class Switch04 {

    public static void main(String[] args) {

        int dayInt = 6;

        switch (dayInt) {
            case 1, 2, 3, 4, 5 -> System.out.println("Working day :[");
            case 6, 7 -> System.out.println("Day off :)))");
            default -> System.out.println("Unknown :/");
        }
    }
}
