package ru.job4j.array;

/**
 * Provides methods for searching elements in an array using loops.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class FindLoop {

    /**
     * Finds the index of an element in the array.
     *
     * @param data array to search in
     * @param element value to find
     * @return index of the element if found, {@code -1} otherwise
     */
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }

    /**
     * Finds the index of an element within a specified range.
     *
     * @param data array to search in
     * @param element value to find
     * @param start start index of the range
     * @param finish end index of the range
     * @return index of the element if found, {@code -1} otherwise
     */
    public static int indexInRange(
            int[] data,
            int element,
            int start,
            int finish
    ) {
        int result = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }
}
