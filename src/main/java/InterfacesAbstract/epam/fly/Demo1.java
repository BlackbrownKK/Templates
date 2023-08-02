package InterfacesAbstract.epam.fly;

public class Demo1 {
    public static void main(String[] args) {
        FlyingMachine plane = new Plane();
        plane.makeTravel();
        System.out.println();
        Plane plane1 = new Plane();
        plane1.makeTravel();
    }
}
