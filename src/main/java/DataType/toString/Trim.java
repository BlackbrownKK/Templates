package DataType.toString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trim {
    //Использовать метод trim() для обработки команд, вводимых пользователем
    public static void main(String[] args) {
        // создать буферизованный поток чтения данных типа BufferedReader, используя стандатный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Bвeдитe 'стоп' для завершения.");
        System.out.println("Bвeдитe название штата: ");
        do {
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            str = str.trim(); //удалить пробелы
            if (str.equals("Иллинойс"))
                System.out.println("Cтoлицa - Спрингфилд.");
            else if (str.equals("Миссури"))
                System.out.println("Cтoлицa - Джефферсон-сити.");
            else if (str.equals("Kaлифopния"))
                System.out.println("Cтoлицa - Сакраменто.");
            else if (str.equals("Baшингтoн"))
                System.out.println("Cтoлицa - Олимпия.");
            // ...

        } while (!str.equals("cтoп")) ;
    }
}
