package ru.job4j.array;

/**
 * Sorts arrays using the selection sort algorithm.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SortSelected {

    /**
     * Sorts the specified array in ascending order.
     *
     * @param data the array to be sorted
     * @return the sorted array
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
