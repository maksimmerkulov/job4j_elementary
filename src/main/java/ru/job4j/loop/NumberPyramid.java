package ru.job4j.loop;

/**
 * Draws a symmetrical number pyramid of a specified height.
 *
 * <p>Example output for {@code n = 3}:
 * <pre>{@code
 *   1
 *  121
 * 12321
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class NumberPyramid {

    /**
     * Draws the numeric pyramid of height {@code n} to {@link System#out}.
     *
     * @param n the height of the pyramid; must be positive
     */
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int p = 1; p <= n - i; p++) {
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
