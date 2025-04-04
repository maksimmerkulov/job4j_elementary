package ru.job4j.array;

/**
 * Класс {@code RollBackArray} предназначен для переворачивания массива в обратном порядке.
 *
 * <p>Методы данного класса создают новый массив, в котором элементы исходного
 * массива расположены в обратном порядке.</p>
 *
 * <p>Используется при необходимости получить измененный массив, не затрагивая оригинальный.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-26
 */
public class RollBackArray {

    /**
     * Метод {@code rollback(int[] array)} создает новый массив, в котором элементы исходного массива
     * расположены в обратном порядке.
     *
     * <p>Исходный массив остается неизменным.</p>
     *
     * @param array Исходный массив, который требуется перевернуть.
     * @return Новый массив, элементы которого расположены в обратном порядке.
     *
     * <p>Пример использования:</p>
     * <pre>
     * int[] original = {1, 2, 3, 4, 5};
     * int[] reversed = RollBackArray.rollback(original);
     * reversed теперь содержит {5, 4, 3, 2, 1}
     * </pre>
     */
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result[index] = array[array.length - index - 1];
        }
        return result;
    }
}
