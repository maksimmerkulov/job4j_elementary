package ru.job4j.array;

/**
 * Класс {@code TwoNumberSum} предназначен для нахождения индексов двух чисел в отсортированном массиве,
 * сумма которых равна заданному числу, с использованием метода двух указателей (Two Pointers).
 *
 * <p>Алгоритм использует два указателя, один начинающийся с начала массива, а другой — с конца.
 * Показания указателей сравниваются с целевым числом, и в зависимости от результата указатели сдвигаются.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] array = {1, 2, 3, 4, 6};
 * int target = 7;
 * int[] result = TwoNumberSum.getIndexes(array, target);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 2
 * 3
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class TwoNumberSum {

    /**
     * Выполняет поиск двух элементов в отсортированном массиве, сумма которых равна {@code target}.
     *
     * <p>Используется алгоритм {@code Метод двух указателей (Two Pointers)}.</p>
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