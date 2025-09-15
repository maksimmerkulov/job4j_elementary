package ru.job4j.array;

/**
 * Searches for the minimum value within a specified range in an array.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MinDiapason {

    /**
     * Searches for the minimum element from start to finish index.
     *
     * @param array  the array to search in
     * @param start  the start index (inclusive)
     * @param finish the end index (inclusive)
     * @return the minimum value found in the range
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
