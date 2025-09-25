package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * A geometric representation of a point in a two-dimensional coordinate system.
 *
 * <p>Example output:
 * <pre>{@code
 * 2.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Point {

    /**
     * The x-coordinate.
     */
    private int x;

    /**
     * The y-coordinate.
     */
    private int y;

    /**
     * Creates a new {@code Point} with the specified coordinates.
     *
     * @param first  the x-coordinate
     * @param second the y-coordinate
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Returns the distance between this point and the specified point.
     *
     * @param that the other {@link Point}
     * @return the distance between the two points
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println(distance);
    }
}
