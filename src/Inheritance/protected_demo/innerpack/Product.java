package Inheritance.protected_demo.innerpack;

// protected methods !!!

public class Product {

    private String name;
    private int qnty;

    protected Product() {
    }

    protected Product(String name, int qnty) {
        this.name = name;
        this.qnty = qnty;
    }

    protected String getName() {
        return name;
    }

    protected int getQnty() {
        return qnty;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setQnty(int qnty) {
        this.qnty = qnty;
    }
}
