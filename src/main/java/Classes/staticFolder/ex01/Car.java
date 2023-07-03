package Classes.staticFolder.ex01;

public class Car {

        private int numOfCars;
        //other fields
        public Car() {
            numOfCars++; //  When objects are created, the value of the field numOfCars increases by 1.
        }
        //other methods
        public int getNumOfCars() {
            return numOfCars;
        }
    }


