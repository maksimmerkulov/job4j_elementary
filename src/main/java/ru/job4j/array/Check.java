package ru.job4j.array;

/**
 * Класс {@code Check} предназначен для проверки, содержат ли все элементы массива одинаковые значения.
 *
 * <p>Методы класса позволяют определить, являются ли все элементы массива {@code boolean} идентичными.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * boolean[] data1 = {true, true, true};
 * boolean result1 = Check.mono(data1);
 *
 * boolean[] data2 = {true, false, true};
 * boolean result2 = Check.mono(data2);
 * }</pre>
 *
 * <p><b>Результат проверки:</b></p>
 * <pre>{@code
 * result1 = true
 * result2 = false
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class Check {

    /**
     * Проверяет, все ли элементы массива имеют одинаковое значение.
     *
     * <p>Метод сравнивает первый элемент массива со всеми остальными.</p>
     *
     * @param data Массив булевых значений (гарантированно содержит хотя бы один элемент).
     * @return Значение {@code true}, если все элементы одинаковы, иначе {@code false}.
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