package ru.job4j.array;

/**
 * Demonstrates manual sorting of an array by swapping elements.
 *
 * <p>Example output:
 * <pre>{@code
 * 1
 * 2
 * 3
 * 4
 * 5
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class AlgoArray {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
