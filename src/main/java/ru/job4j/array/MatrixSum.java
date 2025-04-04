package ru.job4j.array;

/**
 * Класс {@code MatrixSum} предназначен для вычисления суммы всех элементов двумерного массива.
 * <p>
 * Основная функциональность:
 * <ul>
 *     <li>Проход по всем элементам двумерного массива.</li>
 *     <li>Суммирование значений элементов массива.</li>
 * </ul>
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-28
 */
public class MatrixSum {

    /**
     * Метод {@code sum(int[][] array)} вычисляет сумму всех элементов переданного двумерного массива.
     *
     * @param array Двумерный массив целых чисел.
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