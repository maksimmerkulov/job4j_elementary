package ru.job4j.array;

/**
 * Класс FindLoop содержит методы для поиска элемента в массиве.
 */
public class FindLoop {

    /**
     * Метод ищет элемент в массиве и возвращает его индекс.
     * Если элемент не найден, возвращает -1.
     *
     * @param data Массив чисел, в котором нужно искать элемент.
     * @param element Элемент, который нужно найти в массиве.
     * @return Индекс найденного элемента или -1, если элемент не найден.
     */
    public static int indexOf(int[] data, int element) {
        int result = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    /**
     * Метод ищет элемент в массиве в пределах заданного диапазона индексов.
     * Если элемент найден, возвращает его индекс в массиве.
     * Если элемент не найден в заданном диапазоне, возвращает -1.
     *
     * @param data Массив чисел, в котором нужно искать элемент.
     * @param element Элемент, который нужно найти в массиве.
     * @param start Индекс, с которого начинается поиск.
     * @param finish Индекс, которым заканчивается поиск (включительно).
     * @return Индекс найденного элемента в пределах диапазона или -1, если элемент не найден.
     */
    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int i = start; i <= finish; i++) {
            if (data[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }
}