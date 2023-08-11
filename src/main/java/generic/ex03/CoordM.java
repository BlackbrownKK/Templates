package generic.ex03;

public class CoordM <T extends Coord2> {
    T[] space;

    CoordM(T[] array) {
        space = array;
    }
}
