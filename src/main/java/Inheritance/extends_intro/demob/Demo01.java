package Inheritance.extends_intro.demob;

class Demo01 {

    public static void main(String[] args) {
        Box box = new Box(15, 10, 25);
        HeavyBox heavyBox = new HeavyBox(15, 10, 20, 5);
        ColorBox colorBox = new ColorBox(25, 12, 20, "red");

        System.out.println("V box: " + box.getVolume());

        System.out.println("V box: " + heavyBox.getVolume()
                + " P box: " + heavyBox.weight);

        System.out.println("V box: " + colorBox.getVolume()
                + " Color box: " + colorBox.color);
    }
}
