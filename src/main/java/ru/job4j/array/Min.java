package ru.job4j.array;

/**
 * Класс Min предназначен для поиска минимального значения в массиве.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Min {

    /**
     * Метод findMin находит минимальное значение в массиве.
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