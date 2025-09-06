package ru.job4j.condition;

/**
 * A geometric utility that computes operations on vectors.
 *
 * <p>Example output:
 * <pre>{@code
 * result (1, 2) + (3, 4) = (4, 6)
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Vector {

    /**
     * Adds two vectors represented by their coordinates.
     *
     * @param x1 the x-coordinate of the first vector
     * @param y1 the y-coordinate of the first vector
     * @param x2 the x-coordinate of the second vector
     * @param y2 the y-coordinate of the second vector
     * @return the result vector as a string
     */
    public static String addVectors(int x1, int y1, int x2, int y2) {
        int xResult = x1 + x2;
        int yResult = y1 + y2;
        return String.format("(%d, %d)", xResult, yResult);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        String result = addVectors(1, 2, 3, 4);
        System.out.println("result (1, 2) + (3, 4) = " + result);
    }
}
