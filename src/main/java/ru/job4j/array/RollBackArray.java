package ru.job4j.array;

/**
 * Класс предназначен для переворачивания массива в обратном порядке.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class RollBackArray {

    /**
     * Метод записывает элементы в новый массив, но в обратном порядке.
     *
     * @param array Исходный массив.
     * @return Новый массив, элементы которого расположены в обратном порядке.
     */
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result[index] = array[array.length - index - 1];
        }
        return result;
    }
}
