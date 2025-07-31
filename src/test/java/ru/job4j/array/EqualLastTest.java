package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link EqualLast} class.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
class EqualLastTest {

    /**
     * Verifies that the method returns {@code true}
     * when the last elements of both arrays are equal.
     */
    @Test
    void whenEqual() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isTrue();
    }

    /**
     * Verifies that the method returns {@code false}
     * when the last elements of the arrays are different.
     */
    @Test
    void whenNotEqual() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

    /**
     * Verifies that the method returns {@code false}
     * when the left array is empty.
     */
    @Test
    void whenLeftIsEmpty() {
        int[] left = {};
        int[] right = {3, 3, 4};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

    /**
     * Verifies that the method returns {@code false}
     * when the right array is empty.
     */
    @Test
    void whenRightIsEmpty() {
        int[] left = {1, 2, 3};
        int[] right = {};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

    /**
     * Verifies that the method returns {@code false}
     * when both arrays are empty.
     */
    @Test
    void whenBothEmpty() {
        int[] left = {};
        int[] right = {};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }
}
