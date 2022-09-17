package Constructors.demo_02;

// класс-модель
class Produkt {

    private String name;
    private int qnty;
    private float price;
    private float weight;

// Пустой конструктор указан явно, т.к.
// присутсвует еще конструктор - параметризованный.
// Иначе, достаточно было бы явных setters и getters.

    public Produkt() {
    }

    public Produkt(String name) {
        this.name = name;
    }

    public Produkt(String name, int qnty) {
        this.name = name;
        this.qnty = qnty;
    }

    public Produkt(String name, int qnty, float price) {
        this.name = name;
        this.qnty = qnty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQnty() {
        return qnty;
    }

    public void setQnty(int qnty) {
        this.qnty = qnty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
