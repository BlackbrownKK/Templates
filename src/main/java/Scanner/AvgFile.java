package Scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AvgFile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;
        // вывести данные в файл
        FileWriter fout = new FileWriter("src/main/java/Scanner/test.txt");
        fout.write("11 13 24 5 6 8 5 гoтoвo");
        fout.close();
        FileReader fin = new FileReader("src/main/java/Scanner/Test.txt");
        Scanner src = new Scanner(fin);
        //читать и суммировать числовые значения
        while (src.hasNext()) {
            if (src.hasNextDouble()) {
                System.out.println(src.nextDouble());
                sum += src.nextDouble();
                count++;
            } else {
                String str = src.next();
                if (str.equals("гoтoвo")) break;
                else {
                    System.out.println("Oшибкa формата файла.");
                    return;
                }
            }
        }
        src.close();
        System.out.println("Cpeднee равно " + sum / count);
    }
}
