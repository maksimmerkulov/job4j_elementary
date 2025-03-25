package ru.job4j.array;

/**
 * Класс SkipNegative предназначен для замены отрицательных значений в двумерном массиве на ноль.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class SkipNegative {

    /**
     * Метод skip заменяет все отрицательные значения в массиве на ноль.
     *
     * @param array Двумерный массив целых чисел.
     * @return Измененный массив, где отрицательные значения заменены на ноль.
     */
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}