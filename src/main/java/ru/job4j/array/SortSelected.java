package ru.job4j.array;

/**
 * Класс {@code SortSelected} реализует сортировку массива методом выбора.
 *
 * <p>Алгоритм проходит по массиву, находит минимальный элемент в оставшейся части
 * и меняет его местами с текущим элементом.</p>
 *
 * <p>Использует вспомогательные методы {@link MinDiapason#findMin(int[], int, int)}
 * для поиска минимального значения, {@link FindLoop#indexInRange(int[], int, int, int)}
 * для нахождения индекса этого значения и {@link SwitchArray#swap(int[], int, int)}
 * для перестановки элементов.</p>
 *
 * <p>Ожидаемый результат — массив отсортирован в порядке возрастания.</p>
 *
 * @author Maksим Merkulов
 * @version 1.2
 * @since 2025-02-28
 */
public class SortSelected {

    /**
     * Метод {@code sort(int[] data)} выполняет сортировку массива методом выбора.
     *
     * <p>На каждой итерации ищется минимальный элемент в оставшейся части массива
     * и переставляется на текущую позицию.</p>
     *
     * @param data Входной массив, который необходимо отсортировать.
     * @return Отсортированный массив в порядке возрастания.
     *
     * <p>Пример использования:</p>
     * <pre>
     * int[] numbers = {3, 1, 4, 1, 5};
     * int[] sorted = SortSelected.sort(numbers);
     * sorted теперь содержит {1, 1, 3, 4, 5}
     * </pre>
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}