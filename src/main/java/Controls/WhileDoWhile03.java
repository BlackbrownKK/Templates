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

    public  void main2(String[] args) {
        int i = 0;
        outer: while ( i < 5) {
            int j = 0;
            while (j < 2) {
                j++;
                System.out.println("i=" + i + ", j=" + j);
                break outer;
            }
        }
    }

    public void main3(String[] args) {
        int i = 0;
        outer:
        while (i++ < 3) {
            int j = 0;
            while (j++ < 5) {
                if (j == 2) {
                    continue outer;
                }
                System.out.println("i = " + i + "; j = " + j);
            }
        }
    }
}
