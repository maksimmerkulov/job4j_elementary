package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code TwoNumberSumTest} предназначен для проверки метода
 * {@link TwoNumberSum#getIndexes(int[], int)} в классе {@link TwoNumberSum}.
 * <p>
 * Класс проверяет различные случаи, когда метод поиска индексов двух чисел, сумма которых равна целевому значению,
 * должен работать корректно: наличие одинаковых чисел, отрицательных чисел, а также сценарии, когда сумма не найдена.
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-03-02
 */
class TwoNumberSumTest {

    /**
     * Тестирует случай, когда два одинаковых числа в массиве дают нужную сумму.
     * Входные данные: {5, 5}, целевое значение: 10.
     * Ожидаемый результат: индексы этих чисел (0, 1).
     */
    @Test
    void whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {0, 1};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тестирует случай, когда два одинаковых числа в массиве не дают нужную сумму.
     * Входные данные: {5, 5}, целевое значение: 12.
     * Ожидаемый результат: пустой массив.
     */
    @Test
    void whenTwoEqualsNumbersNoTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тестирует случай, когда в массиве присутствуют отрицательные числа, и они дают нужную сумму.
     * Входные данные: {-7, -5, 0, 5, 8, 12}, целевое значение: 3.
     * Ожидаемый результат: индексы чисел, сумма которых равна 3 (1, 4).
     */
    @Test
    void whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {1, 4};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тестирует случай, когда в массиве нет отрицательных чисел и сумма равна целевому значению.
     * Входные данные: {0, 2, 5, 8, 10, 12}, целевое значение: 15.
     * Ожидаемый результат: индексы чисел, сумма которых равна 15 (2, 4).
     */
    @Test
    void whenWithoutNegativeNumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 15;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {2, 4};
        assertThat(result).isEqualTo(expected);
    }
}