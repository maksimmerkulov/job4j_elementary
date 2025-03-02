package ru.job4j.array;

/**
 * Класс для поиска индексов двух чисел в отсортированном массиве,
 * сумма которых равна заданному числу (метод двух указателей).
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class TwoNumberSum {

    /**
     * Метод ищет два элемента в отсортированном массиве, сумма которых равна target.
     * Используется алгоритм "Метод двух указателей" (Two Pointers).
     *
     * @param array  Отсортированный массив целых чисел.
     * @param target Целевое значение суммы.
     * @return Массив из двух индексов, если сумма найдена, иначе пустой массив.
     */
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}