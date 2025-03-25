package ru.job4j.loop;

/**
 * Класс Frame используется для рисования рамки в консоли.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Frame {

    /**
     * Метод draw рисует квадратную рамку заданного размера.
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
     * Метод main демонстрирует работу метода draw.
     */
    public static void main(String[] args) {
        System.out.println("Draw frame of size 3");
        draw(3);
        System.out.println("Draw frame of size 5");
        draw(5);
    }
}
