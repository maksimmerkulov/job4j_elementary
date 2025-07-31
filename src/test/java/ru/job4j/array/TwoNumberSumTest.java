package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link TwoNumberSum} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class TwoNumberSumTest {

    /**
     * Verifies two identical numbers that sum to the {@code target}.
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
     * Verifies two identical numbers that do not sum to the {@code target}.
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
     * Verifies array with negative numbers that sum to the {@code target}.
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
     * Verifies array without negative numbers that sum to the {@code target}.
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
