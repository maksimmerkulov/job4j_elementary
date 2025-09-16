package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link SkipNegative} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class SkipNegativeTest {

    /**
     * Verifies that negative values are replaced in a square matrix.
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
     * Verifies that negative values are replaced in a jagged matrix.
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
}
