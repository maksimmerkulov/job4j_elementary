package ru.job4j.array;

/**
 * Provides a method to check matrix rows for specific patterns.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MatrixCheck {

    /**
     * Checks if the specified row is fully filled with {@code 'X'}.
     *
     * @param board the matrix to check
     * @param row   the index of the row to verify
     * @return {@code true} if the row is mono, otherwise {@code false}
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
