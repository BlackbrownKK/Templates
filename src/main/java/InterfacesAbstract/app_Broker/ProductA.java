package InterfacesAbstract.app_Broker;

// Этот класс должен наследовать класс Product
// и применять интерфейс Sales.
// Исправьте ошибки компиляции.
public class ProductA extends Product implements Sales{

    int qnty;
    double price;

    public ProductA(String name, int qnty, double price) {
        super(name);
        this.qnty = qnty;
        this.price = price;
    }

    public String infoProduct() {
        String name = getName();
        String resultSale = Rounder.roundValue(calcSales(qnty, price));
        return "Product: " + name + "\nVolume of sales (USD.): " + resultSale;
    }

    public double calcSales(int quota, double price) {
        return quota * price;
    }
}
