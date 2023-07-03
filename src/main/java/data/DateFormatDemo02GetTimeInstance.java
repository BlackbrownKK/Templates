package data;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo02GetTimeInstance {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;
        df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Япoния: " + df.format(date));

        df = DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK);
        System.out.println("Beликoбpитaния: " + df.format(date));

        df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CANADA);
        System.out.println("Kaнaдa: " + df.format(date));
    }
}
