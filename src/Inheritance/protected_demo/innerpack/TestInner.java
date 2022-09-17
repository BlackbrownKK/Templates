package Inheritance.protected_demo.innerpack;

public class TestInner {

    static String name;
    static int qnty;
    static double price;

    public static void main(String[] args) {
        name = "Orange";
        qnty = 14;
        price = 7.99;

        ProductA productA = new ProductA(name, qnty, price);
        productA.infoSale();

        ProductB productB = new ProductB();
        productB.infoData();
    }
}
