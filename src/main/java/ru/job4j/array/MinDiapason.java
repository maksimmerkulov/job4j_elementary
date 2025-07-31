package ru.job4j.array;

/**
 * Finds the minimum value within a specific range of an array.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class MinDiapason {

    /**
     * Finds the minimum element between {@code start} and {@code finish} indices.
     *
     * @param array array to process
     * @param start start index of the range
     * @param finish end index of the range
     * @return the minimum value found in the range
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
