package ru.job4j.array;

/**
 * Класс {@code FindLoop} содержит методы для поиска элемента в массиве.
 *
 * <p>Этот класс предоставляет два метода поиска:</p>
 * <ul>
 *     <li>{@link #indexOf(int[], int)} — ищет элемент во всем массиве.</li>
 *     <li>{@link #indexInRange(int[], int, int, int)} — ищет элемент
 *         в диапазоне.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] array = {5, 10, 3, 7};
 * int index1 = FindLoop.indexOf(array, 3);
 * int index2 = FindLoop.indexInRange(array, 10, 1, 3);
 * int index3 = FindLoop.indexOf(array, 100);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * index1 = 2
 * index2 = 1
 * index3 = -1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class FindLoop {

    /**
     * Выполняет поиск элемента в массиве и возвращает его индекс.
     *
     * <p>Поиск выполняется по всему массиву слева направо. Если элемент найден,
     * возвращается его индекс. Если элемент отсутствует, метод возвращает
     * {@code -1}.</p>
     *
     * @param data массив чисел, в котором выполняется поиск
     * @param element элемент, который требуется найти
     * @return индекс найденного элемента или {@code -1}, если элемент
     *         отсутствует
     */
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    /**
     * Выполняет поиск элемента в массиве в пределах заданного диапазона
     * индексов.
     *
     * <p>Поиск выполняется в границах {@code [start, finish]}. Если элемент
     * найден, возвращается его индекс. Если элемент отсутствует, возвращается
     * {@code -1}.</p>
     *
     * <p><b>Важно:</b> Границы диапазона должны находиться в пределах массива,
     * иначе возможен {@code ArrayIndexOutOfBoundsException}.</p>
     *
     * @param data массив чисел, в котором выполняется поиск
     * @param element элемент, который требуется найти
     * @param start начальный индекс поиска (включительно)
     * @param finish конечный индекс поиска (включительно)
     * @return индекс найденного элемента или {@code -1}
     */
    public static int indexInRange(
            int[] data,
            int element,
            int start,
            int finish
    ) {
        int result = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }
}
