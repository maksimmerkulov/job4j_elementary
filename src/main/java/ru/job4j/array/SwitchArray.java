package ru.job4j.array;

/**
 * Provides methods for swapping elements within an array.
 *
 * <p>Example output for {@code swapBorder}:
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
 * @version 1.2
 */
public class SwitchArray {

    /**
     * Swaps two elements in the array by their indices.
     *
     * @param array the array to modify
     * @param source index of the first element
     * @param destination index of the second element
     * @return the modified array
     */
    public static int[] swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
        return array;
    }

    /**
     * Swaps the first and the last elements of the array.
     *
     * @param array the array to modify
     * @return the modified array
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
