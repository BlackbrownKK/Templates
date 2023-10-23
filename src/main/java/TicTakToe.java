import java.util.Arrays;
import java.util.Scanner;

public class TicTakToe {

    static char[][] field = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};


    public static void main(String[] args) {

        for (char[] row : field) {
            System.out.println(Arrays.toString(row));
        }
        while (!ifFinish()) {
            gameProcess(1);

            for (char[] row : field) {
                System.out.println(Arrays.toString(row));
            }

            gameProcess(2);
            for (char[] row : field) {
                System.out.println(Arrays.toString(row));
            }
        }
    }

    private static boolean ifFinish() {
        for (char[] chars : field) {
            for (char ch : chars) {
                if (ch == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void gameProcess(int playerNummer) {
        char[] schritt = new char[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player" + playerNummer + " makes step X = ");
        schritt[0] = (char) scanner.nextByte();
        System.out.println("Player" + playerNummer + " makes step Y = ");
        schritt[1] = (char) scanner.nextByte();
        if (playerNummer == 1)
            field[schritt[0] ][schritt[1]] = '#';
        else {
            field[schritt[0]][schritt[1]] = '0';
        }
    }
}
