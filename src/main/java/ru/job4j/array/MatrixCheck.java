package ru.job4j.array;

/**
 * Класс MatrixCheck содержит метод для проверки, заполнена ли строка двумерного массива только символами 'X'.
 *
 * @author Maksim Merkulov
 * @version 1.0
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
}