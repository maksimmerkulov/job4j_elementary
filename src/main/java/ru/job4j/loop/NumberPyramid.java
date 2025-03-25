package ru.job4j.loop;

/**
 * Класс NumberPyramid предназначен для построения числовой пирамиды в консоли.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class NumberPyramid {

    /**
     * Метод draw рисует числовую пирамиду в консоли с заданной высотой.
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
     * Метод main демонстрирует работу метода draw.
     */
    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}