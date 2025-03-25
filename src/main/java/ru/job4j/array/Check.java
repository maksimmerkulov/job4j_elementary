package ru.job4j.array;

/**
 * Класс Check предназначен для проверки однородности массива boolean.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Check {

    /**
     * Метод mono проверяет, все ли элементы массива имеют одинаковое значение (true или false).
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