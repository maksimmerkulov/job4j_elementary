package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for the {@link FindLoop} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class FindLoopTest {

    /**
     * Verifies that the method returns index 0 when the element is 5.
     */
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that the method returns -1 when the element is not found.
     */
    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {2, 11, 4, 9, 7};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}
