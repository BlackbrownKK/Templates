package Controls;

//  Пример многоступенчатая
//  конструция if- else if - else.
//  Вложенный if- else if - else.
public class IfElse07 {

    public static void main(String[] args) {

        int t;

        for (t = 1; t < 6; t++) {
            if (t == 1)
                System.out.println("t is equal 1");
            else if (t == 2)
                System.out.println("t is equal 2");
            else if (t == 3)
                System.out.println("t is equal 3");
            else if (t == 4)
                System.out.println("t is equal 4");
            else
                // Условие, выполняемое по умолчанию.
                System.out.println("t is not in the range 1 to 4");
        }
    }
}
