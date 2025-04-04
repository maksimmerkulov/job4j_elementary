package ru.job4j.loop;

/**
 * Класс {@code Board} предназначен для рисования шахматной доски в консоли.
 *
 * <p>Доска представляется в виде сетки, где затемненные клетки обозначены символом {@code 'X'},
 * а светлые клетки — пробелом. Чередование клеток соответствует шахматному порядку.</p>
 *
 * <p>Метод {@link #paint(int, int)} принимает параметры ширины и высоты доски и выводит ее в консоль.</p>
 *
 * <p>Пример работы метода {@code paint(3, 3)}:</p>
 * <pre>
 * X X
 *  X
 * X X
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-24
 */
public class Board {

    /**
     * Метод {@code paint(int width, int height)} рисует шахматную доску заданной ширины и высоты.
     *
     * <p>Чередование цветов клеток достигается путем проверки четности суммы индексов строки и столбца.</p>
     *
     * @param width  Ширина доски (количество столбцов).
     * @param height Высота доски (количество строк).
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
     * Метод {@code main(String[] args)} демонстрирует работу метода {@link #paint(int, int)}.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}