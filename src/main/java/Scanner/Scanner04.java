package Scanner;

import java.util.Scanner;

public class Scanner04 {
    

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println ("Enter 2 integers:");
        //считывает первое число и присваивает значение в number1
        Double number1 = number.nextDouble();
        //считывает второе число и присваивает значение в number2
        Double number2 = number.nextDouble();
        // считаем
        Double sum = number1 + number2;
        // выводим результат
        System.out.print("Sum: " + sum);
        // Закрываем сканер
        number.close();
    }
}
