package Scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        // Вывод через printf()
        System.out.printf("your number: %d", num);
        // Закрываем сканер
        in.close();
    }
}
