package ru.job4j.array;

/**
 * Класс предназначен для проверки однородности массива boolean.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Check {

    /**
     * Метод проверяет, все ли элементы массива имеют одинаковое значение (true или false).
     *
     * @param data Массив булевых значений (гарантированно содержит хотя бы один элемент).
     * @return Значение true, если массив полностью заполнен одинаковыми значениями, иначе false.
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}