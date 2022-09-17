package Interfaces.app_Broker;

// Этот класс должен наследовать класс Broker
// и применять интерфейс Commission.
// Исправьте ошибки компиляции.
public class BrokerA extends Broker implements Commission {

      String email;

     public BrokerA(String name, String phone, String email) {
        super(name, phone);
        this.email = email;
    }

     public String infoBroker() {
        String name = getName();
        String phone = getPhone();
        return "Broker: " + name + ", " + phone + ", " + email + "\n";
    }

     public double calcCommission(double sales) {
        double commission;
        if (sales <= 100000) {
            commission = sales * 0.1;
        } else if (sales > 100000 && sales <= 300000) {
            commission = sales * 0.15;
        } else {
            commission = sales * 0.2;
        }
        return commission;
    }
}
