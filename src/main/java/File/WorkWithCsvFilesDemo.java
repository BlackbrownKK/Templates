package File;

public class WorkWithCsvFilesDemo {


    //String val. that get string puch
    static String puch = "C:\\Users\\k.kosteniuk\\Desktop\\test.csv";
    static String puch2 = "C:\\Users\\k.kosteniuk\\Desktop\\ФО-П - РНС и ПР.csv";

    //columnIndex int index on number column
    static int columnIndex = 0;


    //Start the app for read int the info from the table. Need a table and num of the column
    public static void main(String[] args) {
        WorkWithCsvFiles workWithCsvFiles = new WorkWithCsvFiles();
        workWithCsvFiles.startApp(puch, columnIndex);
    }
}
