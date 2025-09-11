package ru.job4j.array;

/**
 * Searches for an element index in an array.
 *
 * @author Maksim Merkulov
 * @version 1.0
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
}
