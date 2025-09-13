package ru.job4j.array;

/**
 * Provides a utility method to compare array border elements.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class EqualLast {

    /**
     * Checks if the last elements of two arrays are equal.
     *
     * @param left  the first array
     * @param right the second array
     * @return {@code true} if the last elements are equal,
     *         otherwise {@code false}
     */
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}
