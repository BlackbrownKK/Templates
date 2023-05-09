package Scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SetDelimiters {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;
        // вывести данные в файл
        FileWriter fout = new FileWriter("src/main/java/Scanner/test.txt");
        // а теперь сохранить данные в списке, разделив их запятыми
        fout.write("2,3.4,5,6,7.4,9.1,10.5,готово");
        fout.close();
        FileReader fin = new FileReader("C:\\Users\\k.kosteniuk\\Desktop\\hillel\\projects\\" +
                "projekts_for_learning\\Templates\\src\\main\\java\\Scanner\\test.txt");

        Scanner src = new Scanner(fin);
        //установить в качестве разделителей запятые и пробелы
        src.useDelimiter(",");
        // читать и суммировать числовые значения
        while (src.hasNext()) {
            System.out.println(src.next());
//            System.out.println(fin.read());
            if (src.hasNextDouble()) {
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
