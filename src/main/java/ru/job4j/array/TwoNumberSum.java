package ru.job4j.array;

/**
 * Класс {@code TwoNumberSum} предназначен для нахождения индексов двух чисел в отсортированном массиве,
 * сумма которых равна заданному числу, с использованием метода двух указателей (Two Pointers).
 * <p>
 * Алгоритм использует два указателя, один начинающийся с начала массива, а другой — с конца.
 * Показания указателей сравниваются с целевым числом, и в зависимости от результата указатели сдвигаются.
 * </p>
 *
 * <p>Пример использования:</p>
 * <pre>
 *     int[] array  = {1, 2, 3, 4, 5};
 *     int target   = 6;
 *     int[] result = TwoNumberSum.getIndexes(array, target); {1, 4}
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-03-02
 */
public class TwoNumberSum {

    /**
     * Метод {@code getIndexes(int[] array, int target)} ищет два элемента в отсортированном массиве,
     * сумма которых равна target. Используется алгоритм "Метод двух указателей" (Two Pointers).
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