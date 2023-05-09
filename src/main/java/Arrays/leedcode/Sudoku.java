package Arrays.leedcode;

import java.util.HashMap;
import java.util.HashSet;

//    int[][] nums = { { 4, 13, 23 }, { 3, 14, 52 } };
public class Sudoku {
    public static void main(String[] args) {
        char[][] board;
        board = new char[][]{
                {'8', '3', '.', '.', '7', '4', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '1', '.', '.', '.', '.', '6', '.'},
                {'1', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> row_wal = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char curVal = board[i][j];
                if (board[i][j] != '.') {
                    if (!row_wal.add(curVal + " row " + i) ||
                            !row_wal.add(curVal + " column " + j) ||
                            !row_wal.add(curVal + " kub " + i / 3 + " " + j / 3)
                    )
                        return false;
                }
            }
        }

        return true;
    }
}
