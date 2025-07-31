package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Defragmentation} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class DefragmentationTest {

    /**
     * Verifies that a single zero at the start of a two-element array is moved.
     */
    @Test
    void whenOneFirst0() {
        int[] array = {0, 1};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that an empty array is handled correctly without exceptions.
     */
    @Test
    void whenEmptyArray() {
        int[] array = {};
        int[] result = Defragmentation.compress(array);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that multiple zeros are shifted to the end using standard method.
     */
    @Test
    void whenNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies compression when the array starts with a zero.
     */
    @Test
    void whenFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies compression when zeros are present at both start and end.
     */
    @Test
    void whenFirst0AndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that an array consisting only of zeros remains unchanged.
     */
    @Test
    void whenAll0() {
        int[] array = {0, 0, 0, 0};
        int[] result = Defragmentation.compress(array);
        int[] expected = {0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies compression when there is a block of zeros at the beginning.
     */
    @Test
    void whenSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that an array without any zeros remains unchanged.
     */
    @Test
    void whenNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the two-pointer approach when the first element is zero.
     */
    @Test
    void when2PointOneFirst0() {
        int[] array = {0, 1};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that the two-pointer approach correctly handles an empty array.
     */
    @Test
    void when2PointEmptyArray() {
        int[] array = {};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the two-pointer approach when the first element is non-zero.
     */
    @Test
    void when2PointNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the two-pointer approach when the array starts with a zero.
     */
    @Test
    void when2PointFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the two-pointer approach with trailing zeros.
     */
    @Test
    void when2PointFirst0AndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that the two-pointer approach handles an array of only zeros.
     */
    @Test
    void when2PointAll0() {
        int[] array = {0, 0, 0, 0};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies two-pointer approach when zeros block precedes values.
     */
    @Test
    void when2PointSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the two-pointer approach leaves an array without zeros as is.
     */
    @Test
    void when2PointNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4};
        assertThat(result).isEqualTo(expected);
    }
}
