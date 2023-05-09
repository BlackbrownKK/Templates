package internet;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws Exception {
        int с;
        URL hp = new URL("https://docs.google.com/spreadsheets/d/1lmWclQqGIxlUcjZ0-hGdS3zkRNCllSEAIzkLt_JZvcI/edit#gid=0");
        URLConnection hpCon = hp.openConnection();
        // получить дату
        long d = hpCon.getDate();
        if (d == 0)
            System.out.println("Cвeдeния о дате отсутствуют.");
        else
            System.out.println("Дaтa: " + new Date(d));
        // получить тип содержимого
        System.out.println("Tип содержимого: " + hpCon.getContentType());
        // получить дату срока действия ресурса
        d = hpCon.getExpiration();
        if (d == 0)
            System.out.println(
                    "Сведения о сроке действия отсутствуют.");
        else
            System.out.println("Cpoк действия истекает: " + new Date(d));
        // получить дату последней модификации
        d = hpCon.getLastModified();
        if (d == 0)
            System.out.println(
                    "Сведения о дате последней модификации.");
        else
            System.out.println("Дaтa последней модификации: "
                    + new Date(d));
        // получить длину содержимого
        long len = hpCon.getContentLengthLong();
        if (len == -1)
            System.out.println("Длинa содержимого недоступна.");
        else
            System.out.println("Длинa содержимого: " + len);
        if (len != 0) {
            System.out.println("=== Содержимое ===");
            InputStream input = hpCon.getInputStream();
            while (((с = input.read()) != -1)) {
                System.out.print((char) с);
            }
            input.close();
        } else {
            System.out.println("Coдepжимoe недоступно.");
        }
    }
}
