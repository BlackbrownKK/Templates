package recursion;

public class Tower {

    public static void main(String[] args) {
        move(14, 'A', 'B', 'C');
    }

    public static void move(int numberSections, char from, char to, char inter) {
        if (numberSections == 1) {
            System.out.println("Moving disk 1 from " + from + " to " + to);
        } else {
            move(numberSections - 1, from, inter, to);
            System.out.println("Moving disk " + numberSections + " from " + from + " to " + to);
            move(numberSections - 1, inter, to, from);
        }
    }
}
