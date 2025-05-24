package ru.job4j.loop;

/**
 * Класс {@code Board} предназначен для рисования шахматной доски в консоли.
 *
 * <p>Используется для визуализации шахматной или клетчатой сетки,
 * где клетки чередуются по принципу шахматной доски.</p>
 *
 * <p>Символ {@code 'X'} используется для закрашенных клеток, а пробел — для светлых.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Board.paint(3, 3);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
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
     * Рисует шахматную доску заданной ширины и высоты.
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
     * Демонстрирует работу метода {@link #paint(int, int)}.
     *
     * <p>Выводит примеры досок 3×3 и 4×4 в консоль.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}