package ru.job4j.array;

/**
 * Demonstrates how to get the length of multidimensional arrays.
 *
 * <p>Example output:
 * <pre>{@code
 * Length of the inner array is: 1
 * Length of the inner array is: 2
 * Length of the inner array is: 3
 * Length of the inner array is: 4
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class LengthArrayArrays {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Length of the inner array is: " + numbers[i].length
            );
        }
    }
}
