package ru.job4j.array;

/**
 * Класс {@code Check} предназначен для проверки, содержат ли все элементы массива одинаковые значения.
 *
 * <p>Методы класса позволяют определить, являются ли все элементы массива {@code boolean} идентичными.</p>
 *
 * <p>Пример использования:</p>
 * <pre>
 *     boolean[] data = {true, true, true};
 *     boolean result = Check.mono(data); true
 *
 *     boolean[] data2 = {true, false, true};
 *     boolean result2 = Check.mono(data2); false
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-27
 */
public class Check {

    /**
     * Метод {@code mono(boolean[] data)} проверяет, все ли элементы массива имеют одинаковое значение
     * (либо {@code true}, либо {@code false}).
     *
     * <p>Метод сравнивает первый элемент массива со всеми остальными.</p>
     *
     * @param data Массив булевых значений (гарантированно содержит хотя бы один элемент).
     * @return {@code true}, если все элементы одинаковы, иначе {@code false}.
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