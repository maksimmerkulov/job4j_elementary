package ru.job4j.loop;

/**
 * Класс {@code Frame} используется для рисования рамки в консоли.
 *
 * <p>Этот класс содержит метод {@link #draw(int)}, который рисует квадратную рамку заданного размера.
 * Рамка состоит из символов {@code "+"}, {@code "-"}, {@code "|"} и пробелов.</p>
 *
 * <p>Метод {@link #draw(int)} принимает целое число, определяющее размер рамки, и выводит ее в консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-21
 */
public class Frame {

    /**
     * Метод {@code draw(int size)} рисует квадратную рамку заданного размера.
     *
     * <p>Рамка рисуется с использованием символов {@code "+"} для углов,
     * {@code "-"} для верхней и нижней границы, {@code "|"} для боковых границ,
     * и пробела для внутренних областей.</p>
     *
     * @param size Размер рамки (количество строк и столбцов).
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
     * Метод {@code main(String[] args)} демонстрирует работу метода {@link #draw(int)}.
     *
     * <p>Метод {@code main(String[] args)} выводит в консоль рамки двух различных размеров: 3 и 5.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        System.out.println("Draw frame of size 3");
        draw(3);
        System.out.println("Draw frame of size 5");
        draw(5);
    }
}
