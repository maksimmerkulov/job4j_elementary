package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code TurnTest} проверяет метод {@link Turn#back(int[])} класса
 * {@link Turn}.
 *
 * <p>Проверяется реверс массива для четного и нечетного количества элементов.</p>
 *
 * <p>Ожидаемый результат — массив должен быть перевернут относительно исходного
 * порядка.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * int[] input = {4, 1, 6, 2};
 * int[] result = Turn.back(input);
 * int[] expected = {2, 6, 1, 4};
 * assertThat(result).containsExactly(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class TurnTest {

    /**
     * Проверяет {@link Turn#back(int[])} на массиве четной длины.
     */
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверяет {@link Turn#back(int[])} на массиве нечетной длины.
     */
    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}
