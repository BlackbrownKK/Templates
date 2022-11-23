package InterfacesAbstract.classes_abstract_product;


public class ProductB extends Product {

    double qnty;
    double price;
    double discountRate;

    public ProductB(String name, double qnty, double price,
                    double discountRate) {
        super(name);
        this.qnty = qnty;
        this.price = price;
        this.discountRate = discountRate;
    }

    @Override
    double calcCost() {
        return qnty * price;
    }

    double calcDiscount() {
        return qnty * price * (discountRate / 100);
    }
}
