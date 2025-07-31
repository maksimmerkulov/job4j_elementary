package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Min} class.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
class MinTest {

    /**
     * Verifies that the method returns the first element
     * when it is the minimum.
     */
    @Test
    void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int result = Min.findMin(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that the method returns the last element
     * when it is the minimum.
     */
    @Test
    void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that the method returns the middle element
     * when it is the minimum.
     */
    @Test
    void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}
