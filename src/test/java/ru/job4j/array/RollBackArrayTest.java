package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link RollBackArray} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class RollBackArrayTest {

    /** Verifies that an empty array returns an empty array. */
    @Test
    void whenEmpty() {
        int[] input = new int[] {};
        int[] expected = new int[] {};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    /** Verifies that a single-element array remains unchanged. */
    @Test
    void whenOne() {
        int[] input = new int[] {1};
        int[] expected = new int[] {1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    /** Verifies that a multi-element array is correctly reversed. */
    @Test
    void whenFull() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {4, 3, 2, 1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    /** Verifies that an array of identical values is unchanged. */
    @Test
    void whenTheSame() {
        int[] input = new int[] {1, 1, 1, 1};
        int[] expected = new int[] {1, 1, 1, 1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }
}
