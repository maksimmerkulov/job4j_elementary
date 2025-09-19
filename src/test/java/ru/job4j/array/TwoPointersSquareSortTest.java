package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for the {@link TwoPointersSquareSort} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class TwoPointersSquareSortTest {

    /**
     * Verifies that the array with negatives is squared and sorted.
     */
    @Test
    void whenHasNegativeThenSquareSorted() {
        int[] input = {-3, 2, 1};
        int[] expected = {1, 4, 9};
        TwoPointersSquareSort.processArray(input);
        assertThat(input).containsExactly(expected);
    }

    /**
     * Verifies that the array without negatives is squared and reversed.
     */
    @Test
    void whenNoNegativeThenSquareReverseSorted() {
        int[] input = {1, 2, 3};
        int[] expected = {9, 4, 1};
        TwoPointersSquareSort.processArray(input);
        assertThat(input).containsExactly(expected);
    }

    /**
     * Verifies the detection of negative values in the array.
     */
    @Test
    void whenCheckNegativeThenReturnCorrectBoolean() {
        int[] arrWithNegative = {-1, 0, 1};
        int[] arrWithoutNegative = {1, 2, 3};
        assertThat(TwoPointersSquareSort.containsNegative(arrWithNegative))
                .isTrue();
        assertThat(TwoPointersSquareSort.containsNegative(arrWithoutNegative))
                .isFalse();
    }

    /**
     * Verifies that the array elements are correctly inverted.
     */
    @Test
    void whenReverseArrayThenElementsInverted() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        TwoPointersSquareSort.reverseArray(input);
        assertThat(input).containsExactly(expected);
    }

    /**
     * Verifies that all elements in the array are squared.
     */
    @Test
    void whenSquareArrayThenAllElementsSquared() {
        int[] input = {-2, -1, 0, 1, 2};
        int[] expected = {4, 1, 0, 1, 4};
        TwoPointersSquareSort.squareArray(input);
        assertThat(input).containsExactly(expected);
    }
}
