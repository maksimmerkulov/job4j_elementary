package ru.job4j.condition;

/**
 * Performs vector operations in 2D space.
 *
 * <p>Example output:
 * <pre>{@code
 * result (1, 2) + (3, 4) = (4, 6)
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Vector {

    /**
     * Adds two 2D vectors.
     *
     * @param x1 X-coordinate of the first vector
     * @param y1 Y-coordinate of the first vector
     * @param x2 X-coordinate of the second vector
     * @param y2 Y-coordinate of the second vector
     * @return string representation of the resulting vector
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
