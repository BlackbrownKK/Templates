package Enums.demo_01;

// применение if
public class EnumsB {

    // декларация переменной
    // типа класса-перечисления
    static Directions dir;

    public static void main(String[] args) {

        // получение доступа к значению
        // переменной (к константе),
        // определение условия
        dir = Directions.NORTH;

        if (dir == Directions.EAST) {
            System.out.println("Direction: East");
        } else if (dir == Directions.WEST) {
            System.out.println("Direction: West");
        } else if (dir == Directions.NORTH) {
            System.out.println("Direction: North");
        } else {
            System.out.println("Direction: South");
        }
    }
}
