package ru.job4j.array;

/**
 * Класс MinDiapason предназначен для поиска минимального значения
 * в заданном диапазоне индексов массива.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MinDiapason {

    /**
     * Метод находит минимальное значение в массиве в пределах указанного диапазона.
     *
     * @param array  Входной массив.
     * @param start  Начальный индекс диапазона (включительно).
     * @param finish Конечный индекс диапазона (включительно).
     * @return Минимальное значение в указанном диапазоне.
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}