package ru.job4j.array;

/**
 * Searches for the minimum value in an array.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Min {

    /**
     * Searches for the minimum element in the specified array.
     *
     * @param array the array to search in
     * @return the minimum value found in the array
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
