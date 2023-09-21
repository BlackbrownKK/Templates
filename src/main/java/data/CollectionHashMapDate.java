package data;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class CollectionHashMapDate {
    public static void main(String[] args) {

    }

    private HashMap<Integer, Integer> getYearReport(String year) {
        HashMap<Integer, Integer> report = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            report.put(i, 0);
        }
        return report;
    }
}
