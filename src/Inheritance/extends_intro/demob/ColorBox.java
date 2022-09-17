package Inheritance.extends_intro.demob;

class ColorBox extends Box {

    String color;

    public ColorBox(int width,
                    int height,
                    int depth,
                    String color) {

//        this.width = width;
//        this.height = height;
//        this.depth = depth;

        // вариант через super
        super(width, height, depth);
        this.color = color;
    }

    public ColorBox() {
    }
}
