package ru.job4j.array;

/**
 * Класс {@code FindLoop} содержит методы для поиска элемента в массиве.
 *
 * <p>Этот класс предоставляет два метода поиска:
 * <ul>
 *     <li>{@link #indexOf(int[], int)} — ищет элемент во всем массиве.</li>
 *     <li>{@link #indexInRange(int[], int, int, int)} — ищет элемент в заданном диапазоне.</li>
 * </ul>
 * </p>
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
     * <p>Поиск выполняется по всему массиву слева направо. Если элемент найден, возвращается его индекс.
     * Если элемент отсутствует в массиве, метод возвращает {@code -1}.</p>
     *
     * @param data    Массив чисел, в котором выполняется поиск.
     * @param element Элемент, который требуется найти.
     * @return Индекс найденного элемента или {@code -1}, если элемент отсутствует.
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
     * Выполняет поиск элемента в массиве в пределах заданного диапазона индексов.
     *
     * <p>Поиск выполняется в границах {@code [start, finish]}. Если элемент найден,
     * возвращается его индекс в массиве. Если элемент отсутствует в указанном диапазоне,
     * метод возвращает {@code -1}.</p>
     *
     * <p><b>Важно:</b> Границы диапазона должны находиться в пределах массива,
     * иначе возможен {@code ArrayIndexOutOfBoundsException}.</p>
     *
     * @param data    Массив чисел, в котором выполняется поиск.
     * @param element Элемент, который требуется найти.
     * @param start   Начальный индекс поиска (включительно).
     * @param finish  Конечный индекс поиска (включительно).
     * @return Индекс найденного элемента или {@code -1}, если элемент отсутствует в указанном диапазоне.
     */
    public static int indexInRange(int[] data, int element, int start, int finish) {
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