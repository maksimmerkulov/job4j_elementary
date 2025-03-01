package ru.job4j.array;

/**
 * Класс MatrixCheck содержит методы для проверки строк и столбцов в двумерном массиве.
 * Проверяет, заполнены ли строка или колонка только символами 'X'.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class MatrixCheck {

    /**
     * Метод проверяет, содержит ли указанная строка массива только символ 'X'.
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
     * Метод проверяет, содержит ли указанная колонка массива только символ 'X'.
     *
     * @param board Двумерный массив, содержащий символы 'X' и ' ' (пробел).
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
}