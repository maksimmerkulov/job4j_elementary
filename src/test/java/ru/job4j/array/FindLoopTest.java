package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link FindLoop} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class FindLoopTest {

    /**
     * Verifies if the method returns index {@code 0}
     * when the element is {@code 5}.
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
     * Verifies if the method returns {@code -1}
     * when the element {@code 10} is not in the array.
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
