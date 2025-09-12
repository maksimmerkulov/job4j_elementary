package ru.job4j.array;

/**
 * Checks if all elements in an array are the same.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Check {

    /**
     * Checks if the array is filled with only {@code true}
     * or only {@code false}.
     *
     * @param data the array to check
     * @return {@code true} if all elements are identical,
     *         otherwise {@code false}
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
