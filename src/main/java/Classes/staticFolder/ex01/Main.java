package Classes.staticFolder.ex01;

public  class   Main {
    public static void main(String[] arg) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        System.out.println(car1.getNumOfCars());
        System.out.println(car2.getNumOfCars());
        System.out.println(car3.getNumOfCars());

        /*
        As a result, instead of the expected value of 3, we got 1.
        This happened because the field numOfCars is an instance field.
        Each object has its own copy of this field with the initial value of 0 and that takes a value
        of 1 when the object is created. In this example, it would be more correct to make the field
        numOfCars static. All objects would then have this in common.
         */
    }
}
