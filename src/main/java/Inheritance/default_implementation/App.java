package Inheritance.default_implementation;

public class App implements MyIF{
    public static void main(String[] args) {

    }

    @Override
    public int getNumber() {
        return 11;
    }

    @Override
    public String getString() {
        return MyIF.super.getString();
    }
}
