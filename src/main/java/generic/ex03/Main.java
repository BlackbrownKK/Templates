package generic.ex03;

public class Main {

    public static void showXY(CoordM<?>  obj) {
        System.out.println("Array coordinate (x,y): ");
        for (int i = 0; i < obj.space.length; i++) {
            System.out.print("(" + obj.space[i].x + ", "  + obj.space[i].y + "); ");
        }
        System.out.println();
    }
    public static void showXYZ( CoordM<? extends Coord3> obj ) {
        System.out.println("Array coordinate (x,y,z): ");
        for (int i = 0; i < obj.space.length; i++) {
            System.out.print("(" + obj.space[i].x + ", "
                    + obj.space[i].y + ", " + obj.space[i].z  + "); ");
        }
        System.out.println();
    }
    public static void showAll( CoordM<? extends Coord4>  obj) {
        System.out.println("Array coordinate (x,y,z,t):");
        for (int i = 0; i < obj.space.length; i++)  {
            System.out.print("(" + obj.space[i].x + ", " + obj.space[i].y
                    + ", " + obj.space[i].z  + ", " + obj.space[i].t  + "); ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Coord2 sp_1[] = {new Coord2(0,0), new Coord2(1,1),
                new  Coord2(5,5), new Coord2(-1,-1)};
        CoordM<Coord2> ss = new CoordM<>(sp_1);
        System.out.println("Object ss");
//        showXY(ss); //error
//         showXYZ(ss); //error
        Coord4 sp_2[] = {new Coord4(1,2,3,4), new Coord4(0,0,2,6),
                new Coord4(2,4,2,4)};
        CoordM<Coord4> cc = new CoordM<>(sp_2);
        System.out.println("\nObject cc");
        showXY(cc); //error
        showXYZ(cc);
        showAll(cc);
    }
}
