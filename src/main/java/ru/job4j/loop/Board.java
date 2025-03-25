package ru.job4j.loop;

/**
 * Класс Board предназначен для рисования шахматной доски в консоли.
 * Символ "X" используется для затемненных клеток, пробел - для светлых.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Board {

    /**
     * Метод paint рисует шахматную доску заданной ширины и высоты.
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
     * Метод main демонстрирует работу метода paint.
     */
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}