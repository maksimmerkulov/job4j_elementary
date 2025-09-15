package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link FindLoop} class.
 *
 * @author Maksim Merkulov
 * @version 1.1
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

    /**
     * Verifies if the method returns the correct index
     * when the element is within the range.
     */
    @Test
    void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the result when multiple element
     * values exist within the specified range.
     */
    @Test
    void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that the method finds the element {@code 2}
     * at index {@code 3} within the range.
     */
    @Test
    void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that the method returns {@code -1}
     * when the element is not present in the range.
     */
    @Test
    void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {5, 2, 10, 2, 4, 7, 14, 3};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies if the method returns the correct index
     * when the element is found within the range.
     */
    @Test
    void whenDiapasonHas8Then5() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 6;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that the method returns {@code -1}
     * when the element is not present in the range.
     */
    @Test
    void whenDiapasonHasNot6ThenMinus1() {
        int[] data = new int[] {5, 2, 10, 2, 4, 6, 14, 3, 21, 16};
        int element = 6;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}
