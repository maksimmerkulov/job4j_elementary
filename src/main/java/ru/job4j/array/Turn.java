package ru.job4j.array;

/**
 * Reverses the order of elements in an array.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Turn {

    /**
     * Reverses the given array in-place.
     *
     * @param array array to be reversed
     * @return the reversed array
     */
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
