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
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-27
 */
public class FindLoop {

    /**
     * Метод {@code indexOf(int[] data, int element)} ищет элемент в массиве и возвращает его индекс.
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
     * Метод {@code indexInRange(int[] data, int element, int start, int finish)} ищет элемент в массиве в пределах
     * заданного диапазона индексов.
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