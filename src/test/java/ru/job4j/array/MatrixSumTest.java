package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link MatrixSum} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class MatrixSumTest {

    /**
     * Verifies that the method returns the correct sum
     * for a {@code 1x1} array.
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
     * Verifies that the method returns the correct sum
     * for a {@code 2x2} array.
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
     * Verifies that the method returns the correct sum
     * for a {@code 2x3} rectangular array.
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
