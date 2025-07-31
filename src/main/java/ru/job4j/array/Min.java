package ru.job4j.array;

/**
 * Finds the minimum value in an array.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class Min {

    /**
     * Finds the minimum element in the given array.
     *
     * @param array array to process
     * @return the minimum value found
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
