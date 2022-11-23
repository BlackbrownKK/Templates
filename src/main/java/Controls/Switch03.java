package Controls;

// Составные case
public class Switch03 {

    public static void main(String[] args) {

        int dayInt = 4;

        switch (dayInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working day :[");
                break;
            case 6:
            case 7:
                System.out.println("Day off :)))");
                break;
            default:
                System.out.println("Unknown :/");
        }
    }
}
