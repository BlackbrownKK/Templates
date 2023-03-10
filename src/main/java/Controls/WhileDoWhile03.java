package Controls;

// Вывод всего лишь один раз
// (несоответсвие условию).
public class WhileDoWhile03 {

    public static void main(String[] args) {

        int c = -1;

        do {
            System.out.println(c + " ");
            c++;
        }
        while (c > 0);
    }


    static int resolve1(int first, int second, int third) {

        int result = first - second;

        while (result > third) {
            result = result - second;

        }
        return result;
    }


}
