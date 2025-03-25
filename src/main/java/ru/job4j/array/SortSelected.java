package ru.job4j.array;

/**
 * Класс SortSelected реализует сортировку выбором.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class SortSelected {

    /**
     * Метод sort сортирует массив по возрастанию с использованием сортировки выбором.
     *
     * @param data Входной массив.
     * @return Отсортированный массив.
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