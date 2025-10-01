package ru.job4j.loop;

/**
 * Класс {@code NumberPyramid} предназначен для построения числовой пирамиды
 * в консоли.
 *
 * <p>Числовая пирамида строится по следующему принципу:</p>
 * <ul>
 *     <li>Каждая строка содержит возрастающую последовательность чисел от 1 до
 *         текущего номера строки.</li>
 *     <li>Затем эта последовательность отображается в обратном порядке (без
 *         повторения последнего числа).</li>
 *     <li>Выравнивание пирамиды осуществляется за счет пробелов перед
 *         числами.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * NumberPyramid.draw(3);
 *
 * NumberPyramid.draw(5);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Number pyramid of height 3:
 *   1
 *  121
 * 12321
 *
 * Number pyramid of height 5:
 *     1
 *    121
 *   12321
 *  1234321
 * 123454321
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class NumberPyramid {

    /**
     * Рисует числовую пирамиду с заданной высотой.
     *
     * <p>Каждая строка содержит возрастающую и убывающую последовательности
     * чисел, выровненные по центру за счет пробелов.</p>
     *
     * @param n высота пирамиды (количество строк)
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
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу метода {@link #draw(int)}.</p>
     *
     * <p>Вызывает {@link #draw(int)} дважды: сначала с высотой 3, затем
     * с высотой 5.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}
