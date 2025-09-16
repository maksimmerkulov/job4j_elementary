package ru.job4j.array;

/**
 * Demonstrates the lengths of nested arrays in a jagged array.
 *
 * <p>Example output:
 * <pre>{@code
 * Size of nested array: 1
 * Size of nested array: 2
 * Size of nested array: 3
 * Size of nested array: 4
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LengthArrayArrays {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int[][] numbers = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Size of nested array: " + numbers[i].length);
        }
    }
}
