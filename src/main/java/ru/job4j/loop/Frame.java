package ru.job4j.loop;

/**
 * Draws a frame in the console using specific symbols for borders and corners.
 *
 * <p>Example output for {@code size = 5}:
 * <pre>{@code
 * Draw frame of size 5
 * +---+
 * |   |
 * |   |
 * |   |
 * +---+
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Frame {

    /**
     * Draws the frame of the specified {@code size}.
     *
     * @param size the size of the frame
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                boolean isTopOrBottomBorder = row == 0 || row == size - 1;
                boolean isSideBorder = col == 0 || col == size - 1;
                if (isTopOrBottomBorder && isSideBorder) {
                    System.out.print("+");
                } else if (isTopOrBottomBorder) {
                    System.out.print("-");
                } else if (isSideBorder) {
                    System.out.print("|");
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
        System.out.println("Draw frame of size 3");
        draw(3);
        System.out.println("Draw frame of size 5");
        draw(5);
    }
}
