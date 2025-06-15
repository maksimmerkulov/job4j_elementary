package ru.job4j.array;

/**
 * Класс {@code SkipNegative} предназначен для замены отрицательных значений в двумерном массиве на ноль.
 *
 * <p>Этот класс содержит метод {@link #skip(int[][])}, который проходит по каждому элементу массива и заменяет
 * отрицательные значения на нули.</p>
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
 * result = {
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
     * Заменяет все отрицательные значения в переданном двумерном массиве на ноль.
     *
     * <p>ВНИМАНИЕ: Метод изменяет переданный массив. Если нужно сохранить исходный массив, создайте его копию
     * перед вызовом.</p>
     *
     * @param array Двумерный массив целых чисел.
     * @return Тот же массив, но с замененными отрицательными значениями на ноль.
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