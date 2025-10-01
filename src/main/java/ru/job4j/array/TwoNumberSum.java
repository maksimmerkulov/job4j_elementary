package ru.job4j.array;

/**
 * Класс {@code TwoNumberSum} предназначен для поиска индексов двух чисел
 * в отсортированном массиве, сумма которых равна заданному числу.
 *
 * <p>Используется метод двух указателей (Two Pointers): один указатель
 * с начала массива, другой — с конца. В зависимости от суммы указатели
 * сдвигаются.</p>
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
 * 1
 * 4
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class TwoNumberSum {

    /**
     * Находит два элемента в отсортированном массиве, сумма которых
     * равна {@code target}.
     *
     * <p>Использует метод двух указателей (Two Pointers).</p>
     *
     * @param array отсортированный массив целых чисел
     * @param target целевое значение суммы
     * @return массив из двух индексов, если сумма найдена,
     *         иначе пустой массив
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
