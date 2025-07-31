package ru.job4j.array;

/**
 * Demonstrates how to iterate over a multidimensional array using nested loops.
 *
 * <p>Example output:
 * <pre>{@code
 * 4
 * 2
 * 3
 * 7
 * 1
 * 3
 * 5
 * 6
 * 4
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MatrixLoop {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int[][] array = {
                {4, 2, 3},
                {7, 1},
                {3, 5, 6, 4}
        };
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int val = array[row][cell];
                System.out.println(val);
            }
        }
    }
}
