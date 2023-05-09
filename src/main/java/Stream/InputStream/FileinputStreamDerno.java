package Stream.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStreamDerno {


    public static void main(String[] args) {

        int size;
        /*
        Для автоматического закрытия потока ввода используется оператор try с ресурсами
        пример демонстрирует чтение тремя способами,
        пропуск вводимых байтов данных и проверку количества байтов, доступных
        для ввода из потока.
         */
        try (FileInputStream f = new FileInputStream("src/main/java/Stream/InputStream/test")) {
            System.out.println("Oбщee количество доступных байтов:" + (size = f.available()));
            int n = size / 40;
            System.out.println("Пepвыe " + n + " байтов прочитанных из файла по очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println("\nBce еще доступно: " + f.available());
            System.out.println("Чтeниe следующих " + n + "байтов по очереди методом read(Ь[] )");
            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.err.println("Heльзя прочитать" + n + "байтов.");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("\nBce еще доступно: " + (size = f.available()));
            System.out.println("Пpoпycтить половину оставшихся байтов методом skip() ");
            f.skip(size / 2);
            System.out.println("Bce еще доступно: " + f.available());
            System.out.println("Чтeниe " + n / 2 + " байтов, размещаемых в конце массива");
            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.err.println("Heльзя прочитать" + n / 2 + "байтов.");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\nBce еще доступно: " + f.available());
        } catch (IOException e) {
            System.out.println("Omибкa ввода-вывода: " + e);
        }
    }
}
