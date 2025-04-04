package ru.job4j.array;

/**
 * Класс {@code Turn} предоставляет метод для реверса (переворачивания) массива.
 *
 * <p>Алгоритм работает путем попарного обмена элементов с начала и конца массива,
 * постепенно двигаясь к середине.</p>
 *
 * <p>Пример использования:</p>
 * <pre>{@code
 * int[] numbers = {1, 2, 3, 4, 5};
 * int[] reversed = Turn.back(numbers);
 * reversed теперь {5, 4, 3, 2, 1}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-26
 */
public class Turn {

    /**
     * Метод {@code back(int[] array)} разворачивает массив в обратном порядке.
     *
     * <p>Метод использует итеративный подход, меняя местами элементы с двух концов массива.</p>
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