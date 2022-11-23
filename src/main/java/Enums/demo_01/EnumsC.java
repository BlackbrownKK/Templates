package Enums.demo_01;

// применение switch
public class EnumsC {

    static Directions dir;

    public static void main(String[] args) {

        // определение условия/шаблона сравнения
        dir = Directions.WEST;

        switch (dir) {
            case NORTH:
                System.out.println("Движение на Север");
                break;
            case SOUTH:
                System.out.println("Движение на Юг");
                break;
            case EAST:
                System.out.println("Движение на Восток");
                break;
            case WEST:
                System.out.println("Движение на Запад");
                break;
            default:
                System.out.println("Неопределено!");
        }
    }
}
