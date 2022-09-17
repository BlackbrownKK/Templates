package Inheritance.methods_override.demob;

public class Rectangle extends Figure {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        System.out.println("Четырехугольник.");
        double res = dim1 * dim2;
        System.out.println(res);
        return res;
    }
}