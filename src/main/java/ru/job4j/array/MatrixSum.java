package ru.job4j.array;

/**
 * Calculates the sum of all elements in a two-dimensional array.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MatrixSum {

    /**
     * Sums all elements of the specified array.
     *
     * @param array the two-dimensional array to process
     * @return the total sum of all elements
     */
    public static int sum(int[][] array) {
        int result = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                result += array[row][cell];
            }
        }
        return result;
    }
}
