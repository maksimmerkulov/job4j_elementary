package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link MinDiapason} class.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
class MinDiapasonTest {

    /**
     * Verifies that the method returns the first element
     * within the specified range when it is the minimum.
     */
    @Test
    void whenFirstMin() {
        int[] array = new int[] {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that the method returns the last element
     * within the specified range when it is the minimum.
     */
    @Test
    void whenLastMin() {
        int[] array = new int[] {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that the method returns the middle element
     * within the specified range when it is the minimum.
     */
    @Test
    void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}
