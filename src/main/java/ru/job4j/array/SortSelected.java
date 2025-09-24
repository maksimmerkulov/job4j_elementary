package ru.job4j.array;

/**
 * Класс {@code SortSelected} выполняет сортировку массива методом выбора.
 *
 * <p>Алгоритм находит минимальный элемент в оставшейся части массива и
 * меняет его местами с текущим элементом.</p>
 *
 * <p>Использует вспомогательные методы:
 * {@link MinDiapason#findMin(int[], int, int)} для поиска минимального
 * значения,
 * {@link FindLoop#indexInRange(int[], int, int, int)} для нахождения индекса
 * этого значения и
 * {@link SwitchArray#swap(int[], int, int)} для перестановки элементов.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] input = {3, 1, 4, 2};
 * int[] sorted = SortSelected.sort(input);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * {1, 2, 3, 4}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class SortSelected {

    /**
     * Выполняет сортировку массива методом выбора.
     *
     * <p>На каждой итерации ищется минимальный элемент в оставшейся части
     * массива и переставляется на текущую позицию.</p>
     *
     * @param data входной массив, который необходимо отсортировать
     * @return отсортированный массив по возрастанию
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(
                    data, min, i, data.length - 1
            );
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
