package Controls;

public class Switch01 {

    public static void main(String[] args) {

        int num = 1;

        switch (num) {
            case 1:
                System.out.println("num is equal 1");
                break; // <- break !!!
            case 2:
                System.out.println("num is equal 2");
                break;
            default: // <- вывод значения вне условий
                System.out.println("num is not equal 1, 2");
        }
    }
}
