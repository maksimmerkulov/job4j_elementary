package ru.job4j.array;

/**
 * Swaps elements in an array.
 *
 * <p>Example output:
 * <pre>{@code
 * 6
 * 2
 * 3
 * 4
 * 5
 * 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SwitchArray {

    /**
     * Swaps the first and the last elements of an array.
     *
     * @param array the array to process
     * @return the array with swapped border elements
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
