package ru.job4j.array;

/**
 * Checks if two arrays have the same last element.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class EqualLast {

    /**
     * Checks if the last elements of two arrays are equal.
     *
     * @param left first integer array
     * @param right second integer array
     * @return {@code true} if last elements are equal, {@code false} otherwise
     */
    public static boolean check(int[] left, int[] right) {
        if (left.length == 0 || right.length == 0) {
            return false;
        }
        return (left[left.length - 1] == right[right.length - 1]);
    }
}
