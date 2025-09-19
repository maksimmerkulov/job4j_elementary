package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link TwoPointersSquareSort} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class TwoPointersSquareSortTest {

    /**
     * Verifies that {@link TwoPointersSquareSort#processArray(int[])}
     * transforms a sorted array with negative numbers into a sorted
     * array of squared values.
     */
    @Test
    void testProcessArrayWithNegative() {
        int[] input = {-3, 2, 1};
        int[] expected = {1, 4, 9};
        TwoPointersSquareSort.processArray(input);
        assertThat(input).containsExactly(expected);
    }

    /**
     * Verifies that {@link TwoPointersSquareSort#processArray(int[])}
     * correctly sorts squared values when no negative numbers are present.
     */
    @Test
    void testProcessArrayWithoutNegative() {
        int[] input = {1, 2, 3};
        int[] expected = {9, 4, 1};
        TwoPointersSquareSort.processArray(input);
        assertThat(input).containsExactly(expected);
    }

    /**
     * Verifies that {@link TwoPointersSquareSort#containsNegative(int[])}
     * returns {@code true} when the array contains negative numbers.
     */
    @Test
    void testContainsNegative() {
        int[] arrWithNegative = {-1, 0, 1};
        int[] arrWithoutNegative = {1, 2, 3};
        assertThat(TwoPointersSquareSort.containsNegative(arrWithNegative))
                .isTrue();
        assertThat(TwoPointersSquareSort.containsNegative(arrWithoutNegative))
                .isFalse();
    }

    /**
     * Verifies that {@link TwoPointersSquareSort#reverseArray(int[])}
     * correctly reverses the order of elements in the array.
     */
    @Test
    void testReverseArray() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        TwoPointersSquareSort.reverseArray(input);
        assertThat(input).containsExactly(expected);
    }

    /**
     * Verifies that {@link TwoPointersSquareSort#squareArray(int[])}
     * correctly squares each element in the array.
     */
    @Test
    void testSquareArray() {
        int[] input = {-2, -1, 0, 1, 2};
        int[] expected = {4, 1, 0, 1, 4};
        TwoPointersSquareSort.squareArray(input);
        assertThat(input).containsExactly(expected);
    }
}
