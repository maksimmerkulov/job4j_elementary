package ru.job4j.array;

/**
 * Класс {@code RollBackArray} предназначен для переворачивания массива в обратном порядке.
 *
 * <p>Используется при необходимости получить измененный массив, не затрагивая оригинальный.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] original = {1, 2, 3, 4, 5};
 * int[] reversed = RollBackArray.rollback(original);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * reversed = {5, 4, 3, 2, 1}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class RollBackArray {

    /**
     * Создает новый массив, в котором элементы исходного массива расположены в обратном порядке.
     *
     * <p>Исходный массив остается неизменным.</p>
     *
     * @param array Исходный массив, который требуется перевернуть.
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