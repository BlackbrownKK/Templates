package polymorphism.lateBuilding;

public class Main {
    public static void main(String[] args) {
        Insurance current = new CarInsurance();
        System.out.println("category: " + current.getCategory() );
        System.out.println("category: " + CarInsurance.getCategory() );
    }
}
