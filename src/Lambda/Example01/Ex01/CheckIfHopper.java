package Lambda.Example01.Ex01;

public class CheckIfHopper implements CheckTrait{
    public boolean test(Animal a) {
        return a.canHop();
    }
}
