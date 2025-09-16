package ru.job4j.array;

/**
 * Provides functionality to process two-dimensional arrays
 * by skipping negatives.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SkipNegative {

    /**
     * Replaces all negative values in the array with {@code 0}.
     *
     * @param array the two-dimensional array to process
     * @return the modified array with no negative values
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
