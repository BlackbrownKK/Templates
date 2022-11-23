package Inheritance.methods_override.demob;

public class Figure {

    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double area() {
        System.out.println("Не определено.");
        return 0;
    }
}
