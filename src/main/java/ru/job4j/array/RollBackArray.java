package ru.job4j.array;

/**
 * Creates a new array with elements in reverse order.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class RollBackArray {

    /**
     * Returns a new array with elements of input array in reverse.
     *
     * @param array source array to process
     * @return a new array with reversed elements
     */
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - i - 1];
        }
        return result;
    }
}
