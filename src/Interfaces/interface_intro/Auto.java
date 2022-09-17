package Interfaces.interface_intro;


public class Auto implements ICargoAuto, PassengersAuto {

    @Override
    public void transportCargo() {
        System.out.println("I carry cargo");
    }

    @Override
    public void transportPassengers() {
        System.out.println("I carry passengers");
    }
}
