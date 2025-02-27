package ru.job4j.array;

/**
 * Класс FindLoop реализует поиск элемента в массиве.
 */
public class FindLoop {

    /**
     * Метод ищет индекс заданного элемента в массиве.
     *
     * @param data    Массив, в котором выполняется поиск.
     * @param element Искомый элемент.
     * @return Индекс элемента, если он найден, иначе -1.
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
}