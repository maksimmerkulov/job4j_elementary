package ru.job4j.array;

/**
 * Calculates the total sum of elements in a multidimensional array.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class MatrixSum {

    /**
     * Calculates the sum of all elements in the given array.
     *
     * @param array multidimensional array to process
     * @return total sum of elements
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
