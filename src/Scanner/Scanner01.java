package Scanner;

// Импорт Scanner из библиотеки, JDK
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        // Создание объекта типа Scanner
        Scanner sc = new Scanner(System.in);
        // Просим пользователя ввести число
        System.out.println("Enter the number: ");

        // Для ввода значения примитивного типа double
        // в классе Scanner определен метод nextDouble()
        double number = sc.nextDouble();

        // Вывод через printf()
        System.out.printf("Thank you! You entered a %.2f number" , number);
        // Закрываем сканер
        sc.close();
    }
}
