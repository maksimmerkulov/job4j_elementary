package ru.job4j.array;

/**
 * Processes arrays by squaring elements and reversing order.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class TwoPointersSquareSort {

    /**
     * Orchestrates array transformation based on negative values presence.
     *
     * <p>Uses {@link #containsNegative(int[])}, {@link #reverseArray(int[])}
     * and {@link #squareArray(int[])} for execution.
     *
     * @param arr array to be processed
     */
    public static void processArray(int[] arr) {
        if (containsNegative(arr)) {
            reverseArray(arr);
            squareArray(arr);
        } else {
            squareArray(arr);
            reverseArray(arr);
        }
    }

    /**
     * Checks if the array contains at least one negative number.
     *
     * @param arr array to check
     * @return {@code true} if negative numbers found, {@code false} otherwise
     */
    public static boolean containsNegative(int[] arr) {
        for (int num : arr) {
            if (num < 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Reverses the given array in-place using two pointers.
     *
     * @param arr array to be reversed
     */
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Replaces each element in the array with its square.
     *
     * @param arr array to be squared
     */
    public static void squareArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }
}
