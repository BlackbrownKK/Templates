package Operations;

// Операторы присваивания
public class AssignmentOperator {

    public static void main(String[] args) {

        // Объявление и инициализация переменной,
        // т.е. присвоение ей значения через оператор =
        int num1 = 10;

        int num2;

        // num2 = num1 назначит значение переменной num1 переменной num2.
        num2 = num1;
        System.out.println("= enter: " + num2);
        


        // Составные операторы ----------------

        // num2 += num1 эквивалентно num2 = num2 + num1
        // + =  <- ошибка!
        // надо без пробела между + и =
        num2 += num1;
        System.out.println("+= enter: " + num2);

        // num2 -= num1 эквивалентно num2 = num2-num1
        num2 -= num1;
        System.out.println("-= enter: " + num2);

        // num2 *= num1 эквивалентно num2 = num2 * num1
        num2 *= num1;
        System.out.println("*= enter: " + num2);

        // num2 /= num1 эквивалентно num2 = num2 / num1
        num2 /= num1;
        System.out.println("/= enter: " + num2);

        // num2 %= num1 эквивалентно num2 = num2% num1
        num2 %= num1;
        System.out.println("%= enter: " + num2);
    }
}
