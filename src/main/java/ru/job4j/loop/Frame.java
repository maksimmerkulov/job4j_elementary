package ru.job4j.loop;

/**
 * Класс {@code Frame} используется для рисования рамки в консоли.
 *
 * <p>Метод {@link #draw(int)} отображает рамку с фиксированными символами:
 * <ul>
 *     <li>{@code "+"} — углы рамки;</li>
 *     <li>{@code "-"} — горизонтальные границы (верхняя и нижняя);</li>
 *     <li>{@code "|"} — вертикальные границы (левая и правая);</li>
 *     <li>{@code " "} — внутренняя часть рамки.</li>
 * </ul>
 * </p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Frame.draw(3);
 * Frame.draw(5);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * + - +
 * |   |
 * + - +
 *
 * + - - - +
 * |       |
 * |       |
 * |       |
 * + - - - +
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Frame {

    /**
     * Рисует квадратную рамку заданного размера.
     *
     * <p>Используются следующие символы:
     * <ul>
     *     <li>{@code '+'} — в углах (4 шт.);</li>
     *     <li>{@code '-'} — по горизонтальным границам, кроме углов;</li>
     *     <li>{@code '|'} — по вертикальным границам, кроме углов;</li>
     *     <li>{@code ' '} — внутри рамки.</li>
     * </ul>
     * </p>
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
     * Демонстрирует работу метода {@link #draw(int)}.
     *
     * <p>Выводит в консоль рамки двух различных размеров: 3 и 5.</p>
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