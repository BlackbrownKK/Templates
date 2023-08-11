package exceptions;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParceDemo {
    public static void main(String[] args) {
        double value = Double.parseDouble("42.05");
        System.out.println(value);
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        try {
            value = (double) format.parse("42.07");
            System.out.println(value);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
