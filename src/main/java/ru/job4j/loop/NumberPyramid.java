package ru.job4j.loop;

/**
 * Класс {@code NumberPyramid} предназначен для построения числовой пирамиды в консоли.
 *
 * <p>Числовая пирамида строится по следующему принципу:</p>
 * <ul>
 *     <li>Каждая строка содержит возрастающую последовательность чисел от 1 до текущего номера строки.</li>
 *     <li>Затем эта последовательность отображается в обратном порядке (без повторения последнего числа).</li>
 *     <li>Выравнивание пирамиды осуществляется за счёт пробелов перед числами.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-21
 */
public class NumberPyramid {

    /**
     * Метод {@code draw(int n)} рисует числовую пирамиду с заданной высотой.
     *
     * <p>Пример вывода для {@code n = 3}:</p>
     * <pre>
     *   1
     *  121
     * 12321
     * </pre>
     *
     * @param n Высота пирамиды (количество строк).
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
     * Метод {@code main(String[] args)} демонстрирует работу метода {@link #draw(int)}.
     *
     * <p>Метод вызывает {@link #draw(int)} дважды: сначала с высотой 3, затем с высотой 5.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}