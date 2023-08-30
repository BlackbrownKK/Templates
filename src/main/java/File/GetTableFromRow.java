package File;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GetTableFromRow {

    static String input = "a,b,c,d,e,f\n" +
            "qwerty,qwerty,qwerty,3500,qwerty,qwerty\n" +
            "qwerty,qwerty,qwerty,3500,qwerty,qwerty\n" +
            "qwerty,qwerty,qwerty,3500,qwerty,qwerty\n";

    static String puch = "C:\\Users\\k.kosteniuk\\Desktop\\test.csv";

    static String[][] table;

    @SneakyThrows
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
        String formattedDate = date.format(formatter);

//        table = createTableFromCSV(input,4, 6 );
//        System.out.println(Arrays.deepToString(table)); // -> [[1, 2, 3], [4, 5, 6]]

        table = createTableFromCSV(readTextFromFile(puch), 19, 6);
        System.out.println(Arrays.deepToString(table)); // -> [[1, 2, 3], [4, 5, 6]]
        System.out.println();
        System.out.println("    REPORT FOR " + formattedDate);
        System.out.println("    ~ is ready ~");
        System.out.println(makeReportToTheAct());
        System.out.println("    ~ in work ~");
        System.out.println(makeReportInProcess());

    }

    public static String makeReportToTheAct() {
        HashMap<String, LocalDate> report = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        int indexInProgress = 4;
        int readyData = 2;
        int codeId = 0;
        int count = 1;
        String keyWord = "to the act";
        for (int i = 0; i < table.length; i++) {
            if (i >= table.length) {
                break; // Avoid ArrayIndexOutOfBoundsException
            }
            if (table[i][indexInProgress].equals(keyWord)) {
                LocalDate localDate = LocalDate.parse(table[i][readyData], inputFormatter);
                report.put(table[i][codeId], localDate);
            }
        }

        for (Map.Entry<String, LocalDate> entry : sortDataInReport(report).entrySet()) {
            String key = entry.getKey();
            LocalDate value = entry.getValue();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            String formattedValue = value.format(formatter);

            stringBuilder.append(count + "). ").append(key).append(" - ").append(formattedValue).append("\n");
            count++;
        }
        return stringBuilder.toString();
    }

    private static HashMap<String, LocalDate> sortDataInReport(HashMap<String, LocalDate> report) {
        return report.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new  // To maintain insertion order
                ));
    }


    public static String makeReportInProcess() {
        StringBuilder stringBuilder = new StringBuilder();
        int indexInProgress = 2;
        int codeId = 0;
        int count = 1;

        String keyWord = "in progress";
        for (int i = 0; i < table.length; i++) {
            if (i >= table.length) {
                break; // Avoid ArrayIndexOutOfBoundsException
            }
            if (table[i][indexInProgress].equals(keyWord)) {
                stringBuilder.append(count + "). " + table[i][codeId] + " - priority  <?>;\n");
                count++;
            }

        }
        return stringBuilder.toString();
    }


    public static String[][] createTableFromCSV(String csvData, int numRows, int numColumns) {
        String[][] table = new String[numRows][numColumns];
        String[] lines = csvData.split("\n"); // array if rows

        for (int i = 0; i < numRows; i++) {
            if (i >= lines.length) {
                break; // Avoid ArrayIndexOutOfBoundsException
            }
            String line = lines[i];
            String[] values = line.split(",");

            for (int j = 0; j < numColumns; j++) {
                if (j < values.length) {
                    table[i][j] = values[j];
                } else {
                    table[i][j] = ""; // Fill with empty string if there are not enough values
                }
            }
        }

        return table;
    }

    public static String readTextFromFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        return content.toString();
    }


}
