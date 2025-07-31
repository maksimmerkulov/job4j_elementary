package ru.job4j.array;

/**
 * Provides methods for array defragmentation.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Defragmentation {

    /**
     * Moves all non-zero elements to the beginning of the array.
     *
     * <p>Uses nested loops to find and swap elements.
     *
     * @param array array to compress
     * @return defragmented array
     */
    public static int[] compress(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != 0) {
                        array[i] = array[j];
                        array[j] = 0;
                        break;
                    }
                }
            }
        }
        return array;
    }

    /**
     * Moves all non-zero elements to the beginning of the array.
     *
     * <p>Uses two-pointer approach for better performance.
     *
     * @param array array to compress
     * @return defragmented array
     */
    public static int[] compress2Point(int[] array) {
        int i = 0;
        int j = 0;
        while (j < array.length) {
            if (array[i] == 0 && array[j] != 0) {
                array[i] = array[j];
                array[j] = 0;
            }
            if (array[i] != 0) {
                i++;
            }
            j++;
        }
        return array;
    }
}
