package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Represents a point in 2D or 3D space.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Point {

    /**
     * The x-coordinate of the point.
     */
    private int x;

    /**
     * The y-coordinate of the point.
     */
    private int y;

    /**
     * The z-coordinate of the point.
     */
    private int z;

    /**
     * Creates a new {@code Point} with the specified 2D coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Creates a new {@code Point} with the specified 3D coordinates.
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
     * Calculates the distance between this point and the specified point in 2D.
     *
     * @param that the other point
     * @return the distance between points
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Calculates the distance between this point and the specified point in 3D.
     *
     * @param that the other point
     * @return the distance between points
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2)
                + pow(this.z - that.z, 2));
    }

    /**
     * Prints information about the point.
     */
    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }
}
