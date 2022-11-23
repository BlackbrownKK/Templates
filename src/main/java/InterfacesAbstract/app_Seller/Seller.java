package InterfacesAbstract.app_Seller;

// Модель объекта Продавца.
public class Seller {

    private final String name;
    private final String phone;

    public Seller(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
