package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link TwoNumberSum} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class TwoNumberSumTest {

    /**
     * Verifies that {@link TwoNumberSum#getIndexes(int[], int)}
     * returns indexes when two identical numbers sum up to the target.
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
     * Verifies that {@link TwoNumberSum#getIndexes(int[], int)}
     * returns an empty array when no pair sums up to the target.
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
     * Verifies that {@link TwoNumberSum#getIndexes(int[], int)}
     * correctly processes negative numbers to find the target sum.
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
     * Verifies that {@link TwoNumberSum#getIndexes(int[], int)}
     * finds the correct indexes in a sorted array of positive numbers.
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
