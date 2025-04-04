package ru.job4j.array;

/**
 * Класс {@code Min} предназначен для поиска минимального значения в массиве.
 *
 * <p>Метод {@link #findMin(int[])} проходит по массиву и находит его минимальный элемент.</p>
 *
 * <p>Пример использования:</p>
 * <pre>
 *     int[] numbers = {3, 1, 7, 2, 5};
 *     int min = Min.findMin(numbers); min = 1
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-28
 */
public class Min {

    /**
     * Метод {@code findMin(int[] array)} находит минимальное значение в массиве.
     *
     * <p>Метод предполагает, что переданный массив содержит хотя бы один элемент.</p>
     *
     * @param array Массив целых чисел, среди которых ищется минимум.
     * @return Минимальный элемент в переданном массиве.
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}