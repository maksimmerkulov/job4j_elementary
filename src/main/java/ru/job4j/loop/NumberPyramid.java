package ru.job4j.loop;

/**
 * Класс для построения числовой пирамиды в консоли.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class NumberPyramid {

    /**
     * Метод для построения пирамиды заданной высоты.
     *
     * @param n Высота пирамиды.
     */
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int p = 1; p <= n - i; p++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * Основной метод програамы для демонстрации работы метода {@link #draw(int)}.
     * Этот метод выводит на экран числовую пирамиду для различных высот.
     */
    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}