package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link SkipNegative} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class SkipNegativeTest {

    /**
     * Verifies that negative numbers in a square array are replaced by zero.
     */
    @Test
    void whenArrayRowAndColumnEquals() {
        int[][] array = {
                {1, -2},
                {1, 2}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    /**
     * Verifies negative number replacement in a non-square array.
     */
    @Test
    void whenArrayRow4AndColumnNotEquals() {
        int[][] array = {
                {1, -2},
                {1, 2, -3},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2, 0},
                {1, 0, 3, 0},
                {1, 2, 0, 0, 5}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    /**
     * Verifies that an array with no negative numbers remains unchanged.
     */
    @Test
    void whenArrayHasNoNegativeNumbers() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    /**
     * Verifies that an array with only negative numbers is replaced with zeros.
     */
    @Test
    void whenArrayHasOnlyNegativeNumbers() {
        int[][] array = {
                {-1, -2, -3},
                {-4, -5, -6}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {0, 0, 0},
                {0, 0, 0}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    /**
     * Verifies that an empty array returns an empty array.
     */
    @Test
    void whenArrayIsEmpty() {
        int[][] array = {};
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {};
        assertThat(result).isDeepEqualTo(expected);
    }
}
