package ru.job4j.loop;

/**
 * Paints a checkerboard pattern in the console.
 *
 * <p>Example output for {@code 3x3} board:
 * <pre>{@code
 * X X
 *  X
 * X X
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Board {

    /**
     * Paints a board with specified width and height.
     *
     * @param width board width
     * @param height board height
     */
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((row + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
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
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
