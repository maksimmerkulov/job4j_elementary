package ru.job4j.array;

/**
 * Класс SortSelected реализует сортировку выбором.
 */
public class SortSelected {

    /**
     * Метод сортирует массив по возрастанию с использованием сортировки выбором.
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