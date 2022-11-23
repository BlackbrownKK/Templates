package Enums.demo_01;

// применение switch
public class EnumsD {

    Directions dir;

    public static void main(String[] args) {

        EnumsD obj1 = new EnumsD(Directions.EAST);
        obj1.getDirection();

        EnumsD obj2 = new EnumsD(Directions.SOUTH);
        obj2.getDirection();
    }

    public EnumsD(Directions dir) {
        this.dir = dir;
    }

    public void getDirection() {

        switch(dir) {
            case EAST:
                System.out.println("Направление East");
                break;
            case WEST:
                System.out.println("Направление West");
                break;
            case NORTH:
                System.out.println("Направление North");
                break;
            default:
                System.out.println("Направление South");
                break;
        }

        // улучшенная реализация switch
//        switch(dir) {
//            case EAST -> System.out.println("Направление East");
//            case WEST -> System.out.println("Направление West");
//            case NORTH -> System.out.println("Направление North");
//            default -> System.out.println("Направление South");
//        }
    }
}
