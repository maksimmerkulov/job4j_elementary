package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link FindLoop} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class FindLoopTest {

    /**
     * Verifies that {@link FindLoop#indexOf(int[], int)}
     * returns the correct index when the element exists in the array.
     */
    @Test
    void whenArrayHas5Then0() {
        int[] data = {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link FindLoop#indexOf(int[], int)}
     * returns {@code -1} when the element does not exist in the array.
     */
    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = {2, 11, 4, 9, 7};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link FindLoop#indexInRange(int[], int, int, int)}
     * returns the correct index when the element exists within the range.
     */
    @Test
    void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link FindLoop#indexInRange(int[], int, int, int)}
     * returns the first matching index when multiple elements are equal
     * within the range.
     */
    @Test
    void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link FindLoop#indexInRange(int[], int, int, int)}
     * finds the element when it occurs after the start index.
     */
    @Test
    void whenDiapasonHas2Then3() {
        int[] data = {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link FindLoop#indexInRange(int[], int, int, int)}
     * returns {@code -1} when the element is not found within the range.
     */
    @Test
    void whenDiapasonHasNot8ThenMinus1() {
        int[] data = {5, 3, 10, 2, 4, 6, 8, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link FindLoop#indexInRange(int[], int, int, int)}
     * correctly finds an element at the end of the specified range.
     */
    @Test
    void whenDiapasonHas8Then5() {
        int[] data = {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 6;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link FindLoop#indexInRange(int[], int, int, int)}
     * returns {@code -1} when the element exists outside the specified range.
     */
    @Test
    void whenDiapasonHasNot6ThenMinus1() {
        int[] data = {5, 2, 10, 2, 4, 6, 14, 3, 21, 16};
        int element = 6;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}
