package ru.job4j.array;

/**
 * Demonstrates manual initialization of a two-dimensional array.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Sequence {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
    }
}
