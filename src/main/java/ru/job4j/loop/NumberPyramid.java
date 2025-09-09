package ru.job4j.loop;

/**
 * A utility class that draws symmetric numeric pyramids of specified heights.
 *
 * <p>Example output:
 * <pre>{@code
 * Number pyramid of height 3:
 *   1
 *  121
 * 12321
 * Number pyramid of height 5:
 *     1
 *    121
 *   12321
 *  1234321
 * 123454321
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class NumberPyramid {

    /**
     * Draws a numeric pyramid with the specified height.
     *
     * @param n the height of the pyramid
     */
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}
