package ru.job4j.array;

/**
 * Класс {@code Turn} предоставляет метод для реверса (переворачивания) массива.
 *
 * <p>Алгоритм работает путем попарного обмена элементов с начала и конца массива,
 * постепенно двигаясь к середине.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] data = {1, 2, 3, 4, 5};
 * Turn.back(data);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 5
 * 4
 * 3
 * 2
 * 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Turn {

    /**
     * Разворачивает массив в обратном порядке.
     *
     * <p>Использует итеративный подход, меняя местами элементы с двух концов массива.</p>
     *
     * @param array Исходный массив, который будет модифицирован.
     * @return Тот же массив, но элементы в нем будут идти в обратном порядке.
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