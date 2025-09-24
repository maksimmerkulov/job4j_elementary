package ru.job4j.array;

/**
 * Класс {@code MatrixCheck} предоставляет методы для работы с двумерными
 * массивами символов, включая проверку строк, колонок, извлечение диагонали
 * и определение выигрышной ситуации в игре.
 *
 * <p>Используется для проверки условий победы в игре, где победной ситуацией
 * считается, если вся строка или колонка состоит из символов {@code X}.</p>
 *
 * <p>
 * Этот класс реализует методы для проверки:
 * <ul>
 *     <li>Проверки строки на наличие только символов {@code X}.</li>
 *     <li>Проверки колонки на наличие только символов {@code X}.</li>
 *     <li>Извлечения диагонали матрицы.</li>
 *     <li>Проверки на выигрышную ситуацию (по строкам и столбцам).</li>
 * </ul>
 * </p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * char[][] board = {
 *     {'X', 'X', 'X'},
 *     {' ', 'X', ' '},
 *     {' ', 'X', ' '}
 * };
 * boolean win = MatrixCheck.isWin(board);
 * boolean rowCheck = MatrixCheck.monoHorizontal(board, 0);
 * boolean colCheck = MatrixCheck.monoVertical(board, 1);
 * char[] diagonal = MatrixCheck.extractDiagonal(board);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * true
 * true
 * [X, X,  ]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.5
 */
public class MatrixCheck {

    /**
     * Проверяет, содержит ли указанная строка массива только символ 'X'.
     *
     * @param board двумерный массив, содержащий символы 'X' и ' ' (пробел)
     * @param row индекс строки, которую нужно проверить
     * @return {@code true}, если вся строка состоит только из 'X',
     *         иначе {@code false}
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
     * Проверяет, содержит ли указанная колонка массива только символ 'X'.
     *
     * @param board двумерный массив, содержащий символы 'X' и ' ' (пробел)
     * @param column индекс колонки, которую нужно проверить
     * @return {@code true}, если вся колонка состоит только из 'X',
     *         иначе {@code false}
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
     * Извлекает диагональ матрицы из квадратного двумерного массива.
     *
     * @param board двумерный массив символов
     * @return массив символов, содержащий элементы диагонали
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    /**
     * Проверяет, есть ли на игровом поле выигрышная ситуация, то есть,
     * если хотя бы одна строка или колонка заполнена только символами 'X'.
     *
     * @param board двумерный массив символов, представляющий игровое поле
     * @return {@code true}, если существует выигрышная ситуация,
     *         иначе {@code false}
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
