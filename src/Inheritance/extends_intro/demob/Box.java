package Inheritance.extends_intro.demob;

class Box {

    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box() {
    }

    double getVolume() {
        return width * height * depth;
    }
}
