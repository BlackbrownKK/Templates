package polymorphism.earlyBuilding;

public class FindAreas {
    /*
The example describes three classes: Figure (as a superclass), Rectangle, and Triangle (as subclasses).

The class Figure has two fields declared to store the dimensions of figures (dim1 and dim2) as well as an
implemented method to calculate the area of a figure area().

The shape of the figure is not known for the class Figure; therefore, the method returns 0.

The subclasses Rectangle and Triangle override the method area() to calculate their area.

The constructors of these classes pass their dimensions for storage to the fields dim1 and dim2:
Rectangle—width and height—and Triangle—base length and height.

The class FindAreas creates three objects—one each for the classes Figure,
Rectangle, and Triangle. It also creates a reference of the type Figure—figref.
This reference accesses created objects one by one, and the method area() is called at it.
     */
    public static void main(String[] args) {
        Figure f = new Figure(10.0, 5.0);
        Rectangle r = new Rectangle(9.0, 5.0);
        Triangle t = new Triangle(10.0, 8.0);
        Figure figref;
        figref = r;
        System.out.println( figref.area() );
        figref = t;
        System.out.println( figref.area() );
        figref = f;
        System.out.println( figref.area() );
    }
}