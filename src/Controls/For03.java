package Controls;

// В for() множественные значения и условия
public class For03 {

    public static void main(String[] args) {

        // Работа с несколькими переменными в цикле for.
        // Инкремент и декремент одновременно.
        // 1-й проход: c == 1, d == 7, true, e == 2, d == 6, output == 7.
        // 2-й проход: c == 1, d == 6, true, e == 3, d == 5, output == 6.
        // 3-й проход: c == 1, d == 5, true, e == 4, d == 4, output == 5.
        // 4-й проход: c == 1, d == 4, false, прекращение цикла.

        int n = 8;
        int e = 1;

        for (int c = 1, d = n - 1; e < d; e++, d--) {
            System.out.print((c * d) + " ");
        }
    }
}
