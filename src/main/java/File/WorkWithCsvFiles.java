package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WorkWithCsvFiles {

    // сделать таблицу в виде двойного массива



    public void startApp(String patch, int columnIndex) {
        startReadingTable(patch, columnIndex);
    }



    /***
     * ArrayList table = is the table with the data that was in current column in the CSV file;
     * table == null there print a massage "file not exists"
     * table != null there print all column from the CSV file;
     */

    private void startReadingTable(String puch, int columnIndex) {
        ArrayList<String> table;
        table = extractColumn(puch, columnIndex);
        if (table != null) {
            for (String str : table) {
                System.out.println(str);
            }
        } else {
            System.out.println("file not exists");
        }
    }


    /**
     * took the name of the file and number of the column and put it to work.
     * Take each row, extract the words and write in a two-dimensional array
     * There does a check file.exists() that returns false if file is not exist
     * There does a check if the columnIndex is out ot the table from the CSV file
     *
     * @param filename    -  string val. that get string patch
     * @param columnIndex - columnIndex int index on number column
     * @return all valuables from the current column
     */

    private ArrayList<String> extractColumn(String filename, int columnIndex) {
        File file = new File(filename);
        if (file.exists()) {
            ArrayList<String> result = new ArrayList<>(); // created res collestion
            makeAllRowsCollection(filename); // get all rows in collection
            for (String str : makeAllRowsCollection(filename)) { // for each row create collection consists of String
                if (fieldsIn(str).size() >= columnIndex) // check if the columnIndex is out
                    result.add(fieldsIn(str).get(columnIndex));
                else {
                    System.out.println("Column Index is wrong");
                    break;
                }
            }
            return result;
        } else {
            return null;
        }

    }

    /**
     * I make of all rows collection, element = string
     *
     * @param filename the puch of incoming file
     * @return the collection of rows of all file.
     */
    private ArrayList<String> makeAllRowsCollection(String filename) {
        ArrayList<String> result = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> allStringsToCollestion = bufferedReader.lines().toList();
            result.addAll(allStringsToCollestion);
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param line input string line
     * @return a collection of a line. Split: "," in case when there in no " \" " in the row.
     * in there is some " in the row, thwen All data in "....,.. " dont be splited by ",";
     */
    private ArrayList<String> fieldsIn(String line) {
        if (!line.contains("\"")) {
            String[] words = line.split(",");
            return new ArrayList<>(Arrays.asList(words));
        }
        return makeCollectionFromRowWith(line);
    }

    /**
     * private ArrayList<String> makeCollectionFromRowWith(String line): This is the method signature.
     * It takes a single parameter, line, which is a string representing a single row in CSV format.
     * The method returns an ArrayList containing the separated values from that row.
     *
     * @param line input string line in there is some " in the row,
     *             In the loop till the end of the row:
     *             1). find index of the "
     *             2). all row before " -> split(","); -> add to collection
     *             3). cut part on the row before first "
     *             4). all data till next " -> add to collection
     *             5). cut part on the row before second "
     *             6). if there is more " in the row
     *             7). all remaining row -> split(","); -> add to collection
     *             8). Break;
     * @return
     */
    private ArrayList<String> makeCollectionFromRowWith(String line) {

        // This creates an empty ArrayList called result where the separated values will be stored.
        ArrayList<String> result = new ArrayList<>();

        //This initiates a loop that continues as long as the line parameter is not an empty string.
        while (!Objects.equals(line, "")) {

            // This finds the index of the first double quote character in the line.
            // It's used to locate the start of a value enclosed in quotes.
            int firstQuote = line.indexOf("\"");

            // This extracts the substring from the beginning of the line up to (but not including) the first double
            // quote. This part of the line contains values separated by commas.
            String stringBefore = line.substring(0, firstQuote);

            // This splits the stringBefore into an array of strings using the comma as a delimiter.
            // This effectively separates the values that are not enclosed in double quotes.
            String[] words = stringBefore.split(",");

            // This adds all the strings from the words array to the result ArrayList.
            result.addAll(Arrays.asList(words));

            // This updates the line to exclude the part that has been processed
            // (up to and including the first double quote).
            line = line.substring(firstQuote + 1);

            // This finds the index of the next double quote in the updated line.
            firstQuote = line.indexOf("\"");

            // This extracts the substring from the updated line up to (but not including) the next double quote.
            // This part of the line contains a value enclosed in double quotes.
            stringBefore = line.substring(0, firstQuote);

            //This adds the value enclosed in double quotes to the result ArrayList.
            result.add(stringBefore);

            // This updates the line to exclude the part that has just been processed
            // (including the quoted value and the comma that follows it).
            line = line.substring(firstQuote + 2);

            //This checks if the updated line contains any more double quotes. If it doesn't,
            // it means that the line is now just a series of values separated by commas.
            if (!line.contains("\"")) {
                //This splits the remaining line into an array of strings using the comma as a delimiter.
                String[] strEnd = line.split(",");
                //This adds all the remaining strings from the strEnd array to the result ArrayList.
                result.addAll(Arrays.asList(strEnd));
            }
            //This exits the loop.
            break;
        }
        //Finally, the method returns the result ArrayList containing all the separated values from the input CSV row.
        return result;
    }
}

