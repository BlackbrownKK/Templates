package Classes_Inner;

public class Ship {
    private int x = 10;
    protected class Engine {
        public void test() {
            x = 20;
        }
    }
    public void testing() {
        Engine eng = new Engine();
        eng.test();
    }

    public static void main(String[] args) {
        Ship ship= new Ship();
        ship.testing();
        System.out.println(ship.x);
    }
}
