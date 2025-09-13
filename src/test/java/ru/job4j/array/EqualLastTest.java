package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link EqualLast} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class EqualLastTest {

    /**
     * Verifies if the method returns {@code true}
     * when the last elements are equal.
     */
    @Test
    void whenEqual() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isTrue();
    }

    /**
     * Verifies if the method returns {@code false}
     * when the last elements are different.
     */
    @Test
    void whenNotEqual() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }
}
