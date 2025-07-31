package ru.job4j.array;

/**
 * Provides a method to filter negative numbers in a multidimensional array.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class SkipNegative {

    /**
     * Replaces all negative elements in the array with {@code 0}.
     *
     * @param array multidimensional array to process
     * @return the modified array
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
