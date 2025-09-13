package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for the {@link RollBackArray} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class RollBackArrayTest {

    /**
     * Verifies that the method returns an empty array when the input is empty.
     */
    @Test
    void whenEmpty() {
        int[] input = new int[] {};
        int[] expected = new int[] {};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    /**
     * Verifies that the method returns the same array for a single element.
     */
    @Test
    void whenOne() {
        int[] input = new int[] {1};
        int[] expected = new int[] {1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    /**
     * Verifies that the method reverses an array with four elements.
     */
    @Test
    void whenFull() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {4, 3, 2, 1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    /**
     * Verifies that the method handles an array where all elements are the
     * same.
     */
    @Test
    void whenTheSame() {
        int[] input = new int[] {1, 1, 1, 1};
        int[] expected = new int[] {1, 1, 1, 1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }
}
