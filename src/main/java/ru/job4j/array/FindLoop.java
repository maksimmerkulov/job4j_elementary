package ru.job4j.array;

/**
 * Provides utility methods for searching elements in arrays.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class FindLoop {

    /**
     * Searches for the index of a specific element.
     *
     * @param data    the array to search in
     * @param element the value to find
     * @return the index of the element if found, otherwise {@code -1}
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
     * Searches for the element within the specified range.
     *
     * @param data    the array to search
     * @param element the value to find
     * @param start   the start index (inclusive)
     * @param finish  the end index (inclusive)
     * @return index of the element, or {@code -1} if not found
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
