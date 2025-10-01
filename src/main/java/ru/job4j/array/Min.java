package ru.job4j.array;

/**
 * Класс {@code Min} предназначен для поиска минимального значения в массиве.
 *
 * <p>Метод {@link #findMin(int[])} проходит по массиву и находит его
 * минимальный элемент.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] numbers = {3, 1, 7, 2, 5};
 * int min = Min.findMin(numbers);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * min = 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class Min {

    /**
     * Находит минимальное значение в массиве.
     *
     * <p>Предполагается, что массив содержит хотя бы один элемент.</p>
     *
     * @param array массив целых чисел, среди которых ищется минимум
     * @return минимальный элемент массива
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
