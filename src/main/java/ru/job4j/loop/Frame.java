package ru.job4j.loop;

/**
 * A utility class that draws text borders and frames of specified sizes.
 *
 * <p>Example output:
 * <pre>{@code
 * Draw frame of size 3:
 * +-+
 * | |
 * +-+
 * Draw frame of size 5:
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
     * Draws a square frame with the specified size.
     *
     * @param size the size of the frame sides
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
        System.out.println("Draw frame of size 3:");
        draw(3);
        System.out.println("Draw frame of size 5:");
        draw(5);
    }
}
