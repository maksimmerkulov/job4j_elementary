package ru.job4j.condition;

/**
 * A geometric utility that computes distances between points.
 *
 * <p>Example output:
 * <pre>{@code
 * result (0, 0) to (2, 0) 2.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Point {

    /**
     * Calculates the distance between two points.
     *
     * @param x1 the x-coordinate of the first point
     * @param y1 the y-coordinate of the first point
     * @param x2 the x-coordinate of the second point
     * @param y2 the y-coordinate of the second point
     * @return the distance result
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
