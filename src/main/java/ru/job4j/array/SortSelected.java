package ru.job4j.array;

/**
 * Sorts an array using the selection sort algorithm.
 *
 * @author Maksim Merkulov
 * @version 1.3
 * @see MinDiapason
 * @see FindLoop
 * @see SwitchArray
 */
public class SortSelected {

    /**
     * Sorts the given array in ascending order.
     *
     * <p>Uses {@link MinDiapason#findMin(int[], int, int)},
     * {@link FindLoop#indexInRange(int[], int, int, int)}
     * and {@link SwitchArray#swap(int[], int, int)} for implementation.
     *
     * @param data array to be sorted
     * @return the sorted array
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(
                    data, min, i, data.length - 1
            );
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
