package ru.job4j.loop;

/**
 * Draws a rectangular frame of a specified size in the console.
 *
 * <p>Example output for {@code size = 3}:
 * <pre>{@code
 * +-+
 * | |
 * +-+
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Frame {

    /**
     * Draws a square frame using ASCII characters.
     *
     * @param size the side length of the square frame
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
