package InterfacesAbstract.app_Broker;

import java.text.DecimalFormat;

public class Rounder {
    public static String roundValue(double value) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }
}
