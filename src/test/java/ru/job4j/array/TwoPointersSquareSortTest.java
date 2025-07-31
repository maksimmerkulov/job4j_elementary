package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link TwoPointersSquareSort} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class TwoPointersSquareSortTest {

    /** Verifies processing of a sorted array containing negative values. */
    @Test
    void whenProcessWithNegativeThenSortedSquares() {
        int[] input = {-3, 2, 1};
        int[] expected = {1, 4, 9};
        TwoPointersSquareSort.processArray(input);
        assertThat(input).containsExactly(expected);
    }

    /** Verifies processing of a sorted array with only positive values. */
    @Test
    void whenProcessWithoutNegativeThenReversedSquares() {
        int[] input = {1, 2, 3};
        int[] expected = {9, 4, 1};
        TwoPointersSquareSort.processArray(input);
        assertThat(input).containsExactly(expected);
    }

    /** Verifies detection of negative numbers in the {@code arr}. */
    @Test
    void whenContainsNegative() {
        int[] arrWithNegative = {-1, 0, 1};
        int[] arrWithoutNegative = {1, 2, 3};
        assertThat(TwoPointersSquareSort.containsNegative(arrWithNegative))
                .isTrue();
        assertThat(TwoPointersSquareSort.containsNegative(arrWithoutNegative))
                .isFalse();
    }

    /** Verifies in-place reversal of the {@code int[]} array. */
    @Test
    void whenReverseArray() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        TwoPointersSquareSort.reverseArray(input);
        assertThat(input).containsExactly(expected);
    }

    /** Verifies in-place squaring of each element in the {@code arr}. */
    @Test
    void whenSquareArray() {
        int[] input = {-2, -1, 0, 1, 2};
        int[] expected = {4, 1, 0, 1, 4};
        TwoPointersSquareSort.squareArray(input);
        assertThat(input).containsExactly(expected);
    }

    /** Verifies that an empty array is handled correctly. */
    @Test
    void whenEmptyArray() {
        int[] input = {};
        int[] expected = {};
        TwoPointersSquareSort.processArray(input);
        assertThat(input).containsExactly(expected);
    }

    /** Verifies processing of a single-element array with a negative value. */
    @Test
    void whenSingleNegative() {
        int[] input = {-3};
        int[] expected = {9};
        TwoPointersSquareSort.processArray(input);
        assertThat(input).containsExactly(expected);
    }

    /** Verifies processing of a single-element array with a positive value. */
    @Test
    void whenSinglePositive() {
        int[] input = {3};
        int[] expected = {9};
        TwoPointersSquareSort.processArray(input);
        assertThat(input).containsExactly(expected);
    }
}
