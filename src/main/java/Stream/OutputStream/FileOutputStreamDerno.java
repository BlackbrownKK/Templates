package Stream.OutputStream;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileOutputStreamDerno {
    public static void main(String[] args) {
        String source = "Now is the tirne for all good rnen\n"
                + " to соте to the aid of their country\n"
                + " and рау their due taxes.";
        byte buf[] = source.getBytes();
        FileOutputStream fO = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;
        try {
            fO = new FileOutputStream("file1.txt");
            f1 = new FileOutputStream("file2.txt");
            f2 = new FileOutputStream("fileЗ.txt");
    // записать данные в первый файл
            for (int i = 0; i < buf.length; i += 2)
                fO.write(buf[i]);
    // записать данные во второй файл
            f1.write(buf);
    //записать данные в третий файл
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException е) {
            System.out.println("Пpoизoшлa ошибка ввода-вывода");
        } finally {
            try {
                if (fO != null) fO.close();
            } catch (IOException e) {
                System.out.println("Oшибкa закрытия файла file1.txt");
                try {
                    if (f1 != null) f1.close();
                } catch (IOException e1) {
                    System.out.println("Oшибкa закрытия файла file2.txt");
                    try {
                        if (f2 != null) f2.close();
                    } catch (IOException e2) {
                        System.out.println("Oшибкa закрытия файла fileЗ.txt");
                    }
                }
            }
        }
    }
}
