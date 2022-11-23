package Inheritance.extends_intro.demob;

class HeavyBox extends Box {

    int weight;

    public HeavyBox() {
    }

    public HeavyBox(int width,
                    int height,
                    int depth,
                    int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
}