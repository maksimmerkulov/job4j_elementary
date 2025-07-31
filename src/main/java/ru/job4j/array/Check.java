package ru.job4j.array;

/**
 * Checks if all elements in an array are identical.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class Check {

    /**
     * Checks if the array contains only identical boolean values.
     *
     * @param data boolean array to check
     * @return {@code true} if all elements are the same, {@code false} otherwise
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
