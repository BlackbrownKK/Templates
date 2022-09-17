package Scanner;

import java.util.Scanner;

// для ввода значений каждого примитивного типа в классе Scanner
// определен свой метод nextInt() для типа int, nextFloat() для типа float
public class Scanner03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter age: ");
        int age = in.nextInt();
        System.out.print("Enter height: ");
        float height = in.nextFloat();
        System.out.printf("name: %s  age: %d  height: %.2f%n", name, age, height);
        // Закрываем сканер
        in.close();
    }
}
