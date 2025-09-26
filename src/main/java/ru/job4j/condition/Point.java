package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * A geometric representation of a point in a two-dimensional or
 * three-dimensional coordinate system.
 *
 * @author Maksim Merkulov
 * @version 1.2
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
     * The z-coordinate.
     */
    private int z;

    /**
     * Creates a new {@code Point} with the specified two-dimensional
     * coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Creates a new {@code Point} with the specified three-dimensional
     * coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @param z the z-coordinate
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Returns the distance between this point and the specified point in a
     * two-dimensional space.
     *
     * @param that the other {@link Point}
     * @return the distance between the two points
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Returns the distance between this point and the specified point in a
     * three-dimensional space.
     *
     * @param that the other {@link Point}
     * @return the distance between the two points
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2)
                + pow(this.z - that.z, 2));
    }

    /**
     * Prints the coordinate information of this point to the standard output.
     */
    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + ", "
                + this.z + "]");
    }
}
