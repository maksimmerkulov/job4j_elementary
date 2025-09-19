package ru.job4j.array;

/**
 * Provides methods to process arrays with conditional sorting logic.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class TwoPointersSquareSort {

    /**
     * Processes the array based on whether it contains negative values.
     *
     * @param nums the array to process
     */
    public static void processArray(int[] nums) {
        if (containsNegative(nums)) {
            reverseArray(nums);
            squareArray(nums);
        } else {
            squareArray(nums);
            reverseArray(nums);
        }
    }

    /**
     * Checks if the array contains at least one negative number.
     *
     * @param nums the array to check
     * @return {@code true} if negative found, otherwise {@code false}
     */
    public static boolean containsNegative(int[] nums) {
        boolean result = false;
        for (int num : nums) {
            if (num < 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Reverses the array elements using the two-pointer technique.
     *
     * @param nums the array to reverse
     */
    public static void reverseArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Squares each element in the array.
     *
     * @param nums the array to square
     */
    public static void squareArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
    }
}
