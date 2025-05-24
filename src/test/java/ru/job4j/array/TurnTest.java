package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code TurnTest} проверяет корректность работы метода {@link Turn#back(int[])}
 * в классе {@link Turn}.
 *
 * <p>Проверяется реверс массива для четного и нечетного количества элементов.</p>
 *
 * <p>Ожидаемый результат — массив должен быть перевернут относительно исходного порядка.</p>
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
     * Тест для {@link Turn#back(int[])} с массивом четной длины.
     *
     * <p>Ожидаемый результат: элементы меняются зеркально относительно центра.</p>
     */
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Тест для {@link Turn#back(int[])} с массивом нечетной длины.
     *
     * <p>Ожидаемый результат: порядок элементов изменяется на обратный.</p>
     */
    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}