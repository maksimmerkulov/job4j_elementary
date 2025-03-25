package ru.job4j.array;

/**
 * Класс MatrixCheck содержит методы для работы с двумерными массивами,
 * включая проверку строк, колонок и извлечение диагонали.
 * Проверяется, состоит ли строка или колонка только из символов 'X'.
 * Реализован метод извлечения диагонали матрицы из массива.
 * Реализован метод для проверки выигрышной ситуации в игре.
 * В игре победная ситуация наступает, когда хотя бы одна строка или столбец состоит только из символов 'X'.
 *
 * @author Maksim Merkulov
 * @version 1.4
 */
public class MatrixCheck {

    /**
     * Метод monoHorizontal проверяет, содержит ли указанная строка массива только символ 'X'.
     *
     * @param board Двумерный массив, содержащий символы 'X' и ' ' (пробел).
     * @param row   Индекс строки, которую нужно проверить.
     * @return Значение true, если вся строка состоит только из 'X', иначе false.
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
     * Метод monoVertical проверяет, содержит ли указанная колонка массива только символ 'X'.
     *
     * @param board  Двумерный массив, содержащий символы 'X' и ' ' (пробел).
     * @param column Индекс колонки, которую нужно проверить.
     * @return Значение true, если вся колонка состоит только из 'X', иначе false.
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
     * Метод extractDiagonal извлекает диагональ матрицы из квадратного двумерного массива.
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
     * Метод isWin проверяет, находится ли на игровом поле выигрышная ситуация,
     * то есть, если хотя бы одна строка или колонка заполнена только символами 'X'.
     * Для проверки используется диагональ и соответствующие строки и столбцы.
     *
     * @param board Двумерный массив символов, представляющий игровое поле.
     * @return Значение true, если есть выигрышная ситуация, иначе false.
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