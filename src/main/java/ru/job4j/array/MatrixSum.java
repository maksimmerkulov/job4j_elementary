package ru.job4j.array;

/**
 * Класс MatrixSum предназначен для вычисления суммы всех элементов двумерного массива.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class MatrixSum {

    /**
     * Метод sum суммирует все элементы переданного двумерного массива.
     *
     * @param array Входной двумерный массив.
     * @return Сумма всех элементов массива.
     */
    public static int sum(int[][] array) {
        int result = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                result = result + array[row][cell];
            }
        }
        return result;
    }
}