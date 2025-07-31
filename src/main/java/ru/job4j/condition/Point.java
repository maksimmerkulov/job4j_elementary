package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Represents a point in 2D and 3D space.
 *
 * <p>Example output:
 * <pre>{@code
 * Point[0, 0]
 * Point[0, 2]
 * Point[1, 2, 3]
 * Point[4, 5, 6]
 * 2.0
 * 5.196152422706632
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.4
 */
public class Point {

    /** X-coordinate. */
    private int x;

    /** Y-coordinate. */
    private int y;

    /** Z-coordinate for 3D space. */
    private int z;

    /**
     * Constructs a 2D point.
     *
     * @param x X-coordinate
     * @param y Y-coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructs a 3D point.
     *
     * @param x X-coordinate
     * @param y Y-coordinate
     * @param z Z-coordinate
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Calculates the Euclidean distance in 2D space.
     *
     * @param that another point to compare
     * @return distance as a {@code double}
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Calculates the Euclidean distance in 3D space.
     *
     * @param that another point to compare
     * @return distance as a {@code double}
     */
    public double distance3d(Point that) {
        return sqrt(
                pow(this.x - that.x, 2)
                        + pow(this.y - that.y, 2)
                        + pow(this.z - that.z, 2)
        );
    }

    /**
     * Prints 2D coordinates to {@link System#out}.
     */
    public void infoPoint2d() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    /**
     * Prints 3D coordinates to {@link System#out}.
     */
    public void infoPoint3d() {
        System.out.println("Point["
                + this.x + ", " + this.y + ", " + this.z + "]");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(1, 2, 3);
        Point d = new Point(4, 5, 6);
        a.infoPoint2d();
        b.infoPoint2d();
        c.infoPoint3d();
        d.infoPoint3d();
        double distance = a.distance(b);
        double distance3d = c.distance3d(d);
        System.out.println(distance);
        System.out.println(distance3d);
    }
}
