package InterfacesAbstract.classes_abstract_product;


public class ProductA extends Product {

    double qnty;
    double price;

    public ProductA(String name, double qnty, double price) {
        super(name);
        this.qnty = qnty;
        this.price = price;
    }

    @Override
    double calcCost() {
        return qnty * price;
    }
}
