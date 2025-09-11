package ru.job4j.loop;

/**
 * Draws a chessboard using pseudo-graphics.
 *
 * <p>Example output for {@code width = 3, height = 3}:
 * <pre>{@code
 * X X
 *  X
 * X X
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Board {

    /**
     * Paints the board with specified dimensions.
     *
     * @param width  the width of the board
     * @param height the height of the board
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
