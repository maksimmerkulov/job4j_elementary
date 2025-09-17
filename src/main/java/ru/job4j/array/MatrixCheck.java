package ru.job4j.array;

/**
 * Provides methods to check matrix patterns and extract elements.
 *
 * @author Maksim Merkulov
 * @version 1.2
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

    /**
     * Checks if the specified column is fully filled with {@code 'X'}.
     *
     * @param board  the matrix to check
     * @param column the index of the column to verify
     * @return {@code true} if the column is mono, otherwise {@code false}
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Extracts the main diagonal from a square matrix.
     *
     * @param board the matrix to process
     * @return an array containing diagonal elements
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }
}
