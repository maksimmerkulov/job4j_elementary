package ru.job4j.array;

/**
 * Provides methods for checking conditions on a game board.
 *
 * @author Maksim Merkulov
 * @version 1.5
 */
public class MatrixCheck {

    /**
     * Checks if a specific row contains only {@code 'X'} symbols.
     *
     * @param board game board
     * @param row row index to check
     * @return {@code true} if row is mono, {@code false} otherwise
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
     * Checks if a specific column contains only {@code 'X'} symbols.
     *
     * @param board game board
     * @param column column index to check
     * @return {@code true} if column is mono, {@code false} otherwise
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
     * Extracts the main diagonal from the board.
     *
     * @param board game board
     * @return character array containing diagonal elements
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    /**
     * Checks if the current state of the board is a winning one.
     *
     * @param board game board
     * @return {@code true} if player has won, {@code false} otherwise
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                if ((monoHorizontal(board, i) || monoVertical(board, i))) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
