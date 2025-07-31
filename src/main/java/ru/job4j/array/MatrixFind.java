package ru.job4j.array;

/**
 * Finds and prints the coordinates of an element in a multidimensional array.
 *
 * <p>Example output for {@code el = 3}:
 * <pre>{@code
 * Find el : 3
 * row : 0, cell : 2
 * row : 1, cell : 0
 * row : 2, cell : 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MatrixFind {

    /**
     * Finds the element and prints its row and cell indices.
     *
     * @param array multidimensional array to search in
     * @param el element to find
     */
    public static void find(int[][] array, int el) {
        System.out.println("Find el : " + el);
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int val = array[row][cell];
                if (val == el) {
                    System.out.println("row : " + row + ", cell : " + cell);
                }
            }
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 3, 1}
        };
        MatrixFind.find(array, 3);
    }
}
