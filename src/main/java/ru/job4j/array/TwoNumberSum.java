package ru.job4j.array;

/**
 * Finds two numbers in a sorted array that add up to a target sum.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class TwoNumberSum {

    /**
     * Finds indices of two numbers that satisfy the target sum.
     *
     * <p>Uses the two-pointer approach with {@code O(n)} time complexity.
     * The input array must be sorted.
     *
     * @param array sorted integer array to search in
     * @param target required sum of two elements
     * @return array of two indices if found, empty array otherwise
     */
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}
