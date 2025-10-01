package ru.job4j.array;

/**
 * Класс {@code SkipNegative} заменяет отрицательные значения в двумерном
 * массиве на нули.
 *
 * <p>Содержит метод {@link #skip(int[][])}, который проходит по всем элементам
 * массива и заменяет отрицательные значения на ноль.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[][] input = {
 *     {1, -2, 3},
 *     {-4, 5, -6}
 * };
 * int[][] result = SkipNegative.skip(input);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * {
 *     {1, 0, 3},
 *     {0, 5, 0}
 * }
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class SkipNegative {

    /**
     * Заменяет отрицательные элементы массива на нули.
     *
     * <p>Метод изменяет переданный массив. Если нужно сохранить исходный
     * массив, создайте его копию перед вызовом.</p>
     *
     * @param array двумерный массив целых чисел
     * @return тот же массив, но с отрицательными элементами замененными на
     *         нули
     */
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}
