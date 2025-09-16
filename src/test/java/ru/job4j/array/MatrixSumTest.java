package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link MatrixSum} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class MatrixSumTest {

    /**
     * Verifies the sum of an array with a single element {@code 10}.
     */
    @Test
    void whenSingle() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum.sum(array);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the sum of a {@code 2x2} array.
     */
    @Test
    void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int result = MatrixSum.sum(array);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the sum of a jagged array with different row lengths.
     */
    @Test
    void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int result = MatrixSum.sum(array);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}
