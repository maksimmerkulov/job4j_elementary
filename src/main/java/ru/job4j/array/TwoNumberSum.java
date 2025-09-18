package ru.job4j.array;

/**
 * Provides a method to find two numbers in a sorted array
 * that sum up to a target value.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class TwoNumberSum {

    /**
     * Finds the indexes of two elements that sum up to the target.
     *
     * @param array  the sorted array to search in
     * @param target the target sum
     * @return an array of two indexes, or an empty array if no such sum exists
     */
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            }
            if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}
