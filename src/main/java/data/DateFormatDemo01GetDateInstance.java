package data;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo01GetDateInstance {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;
        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.GERMANY);
        System.out.println("GERMANY: " + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println("Kopeя: " + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println("Beликoбpитaния: " + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("CШA: " + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
        System.out.println("FRANCE: " + df.format(date));
    }
}
