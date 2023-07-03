package Classes;

public class Car {
        private String model;
        private String brand;
        public Car() {}
        public Car(String model) {
            this.model = model;
        }
    public Car(String model, String brand) { // not private Car(String model, String brand) {
            this.model = model;
            this.brand = brand;
        }
        // getters and setters

    }

