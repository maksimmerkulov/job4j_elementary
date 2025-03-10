package ru.job4j.array;

/**
 * Класс Turn содержит метод для переворачивания массива.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Turn {

    /**
     * Метод разворачивает элементы массива в обратном порядке.
     *
     * @param array Исходный массив.
     * @return Перевернутый массив.
     */
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int  temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }
}