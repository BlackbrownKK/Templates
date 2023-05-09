import java.util.Calendar;
import java.util.Formatter;

public class format {
    public static void main(String[] args) {
        Formatter fmt;
        for (int i = 1; i <= 10; i++) {
            fmt = new Formatter();
            fmt.format("%4d %4d %4d", i, i * i, i * i * i);
            System.out.println(fmt);
            fmt.close();
        }
        System.out.println();
        Formatter formatter = new Formatter();
        // выровнять по правому краю (по умолчанию)
        formatter.format("|%10.2f|", 123.123);
        System.out.println(formatter);
        formatter.close();
        // а теперь выровнять по левому краю
        Formatter formatter2 = new Formatter();
        formatter2.format("|%-10.2f|", 123.123);
        System.out.println(formatter2);
        formatter2.close();

        Formatter formatter3 = new Formatter();
        formatter3.format("<%+d>",100);
        System.out.println(formatter3);
        formatter3.close();

        Formatter formatter4 = new Formatter();
        formatter4.format("<%,.2f>",4356783497.34);
        System.out.println(formatter4);
        formatter4.close();

        Formatter formatter5 = new Formatter();
        Calendar cal = Calendar.getInstance();
        formatter5. format ( "Today is day %te of %<tB, %<tY", cal);
        System.out.println(formatter5);
        formatter5.close();
    }
}
