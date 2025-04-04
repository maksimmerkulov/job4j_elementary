package ru.job4j.array;

/**
 * Класс {@code MatrixCheck} предоставляет методы для работы с двумерными массивами символов,
 * включая проверку строк, колонок, извлечение диагонали и проверку на выигрышную ситуацию в игре.
 * В контексте игры победной ситуацией считается, когда хотя бы одна строка или колонка состоит
 * только из символов {@code 'X'}.
 * <p>
 * Этот класс реализует методы для проверки:
 * <ul>
 *     <li>Проверки строки на наличие только символов 'X'.</li>
 *     <li>Проверки колонки на наличие только символов 'X'.</li>
 *     <li>Извлечения диагонали матрицы.</li>
 *     <li>Проверки на выигрышную ситуацию (по строкам и столбцам).</li>
 * </ul>
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.4
 * @since 2025-03-01
 */
public class MatrixCheck {

    /**
     * Метод {@code monoHorizontal(char[][] board, int row)} проверяет, содержит ли указанная строка массива
     * только символ 'X'.
     *
     * @param board Двумерный массив, содержащий символы 'X' и ' ' (пробел).
     * @param row   Индекс строки, которую нужно проверить.
     * @return {@code true}, если вся строка состоит только из 'X', иначе {@code false}.
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
     * Метод {@code monoVertical(char[][] board, int column)} проверяет, содержит ли указанная колонка массива
     * только символ 'X'.
     *
     * @param board  Двумерный массив, содержащий символы 'X' и ' ' (пробел).
     * @param column Индекс колонки, которую нужно проверить.
     * @return {@code true}, если вся колонка состоит только из 'X', иначе {@code false}.
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
     * Метод {@code extractDiagonal(char[][] board)} извлекает диагональ матрицы из квадратного двумерного массива.
     * Диагональ матрицы состоит из элементов, расположенных на позиции [i][i] для всех строк.
     *
     * @param board Двумерный массив символов.
     * @return Массив символов, содержащий элементы диагонали.
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    /**
     * Метод {@code isWin(char[][] board)} проверяет, есть ли на игровом поле выигрышная ситуация, то есть,
     * если хотя бы одна строка или колонка заполнена только символами 'X'.
     * Для этого метод использует проверки строк и столбцов с помощью методов
     * {@link #monoHorizontal(char[][], int)} и {@link #monoVertical(char[][], int)},
     * а также проверяет диагональ {@link #extractDiagonal(char[][])}.
     *
     * @param board Двумерный массив символов, представляющий игровое поле.
     * @return {@code true}, если существует выигрышная ситуация, иначе {@code false}.
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