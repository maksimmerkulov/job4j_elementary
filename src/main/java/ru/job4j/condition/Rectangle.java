package ru.job4j.condition;

/**
 * Calculates geometric properties of a rectangle.
 *
 * <p>Example output:
 * <pre>{@code
 * Diagonal of rectangle with length 3 and width 4 is 5.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Rectangle {

    /**
     * Calculates the diagonal of a rectangle.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the diagonal length
     */
    public static double diagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        double result = diagonal(3, 4);
        System.out.println("Diagonal of rectangle with length 3 and width 4 is "
                + result);
    }
}
