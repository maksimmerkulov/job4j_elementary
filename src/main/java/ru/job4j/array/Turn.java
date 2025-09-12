package ru.job4j.array;

/**
 * Reverses the elements of an array.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Turn {

    /**
     * Reverses the order of elements in the given array.
     *
     * @param array the array to reverse
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
