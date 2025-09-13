package ru.job4j.array;

/**
 * Creates a new array with elements in reverse order.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class RollBackArray {

    /**
     * Returns a new array that is a reversed version of the input array.
     *
     * @param array the array to roll back
     * @return a new reversed array
     */
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - i - 1];
        }
        return result;
    }
}
