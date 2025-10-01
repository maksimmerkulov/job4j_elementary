package ru.job4j.array;

/**
 * Класс {@code Check} предназначен для проверки, содержат ли все элементы
 * массива одинаковые значения.
 *
 * <p>Методы класса позволяют определить, являются ли все элементы массива
 * {@code boolean} идентичными.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * boolean[] data1 = {true, true, true};
 * boolean[] data2 = {true, false, true};
 *
 * System.out.println(Check.mono(data1));
 * System.out.println(Check.mono(data2));
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * false
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
     * @param data массив булевых значений (гарантированно содержит хотя бы
     *             один элемент)
     * @return {@code true}, если все элементы одинаковы, иначе {@code false}
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
