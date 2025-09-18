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
     * Verifies that {@link Defragmentation#compress(int[])}
     * moves {@code 0} to the end in a small array.
     */
    @Test
    void whenOneFirst0() {
        int[] array = {0, 1};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress(int[])}
     * processes an empty array.
     */
    @Test
    void whenEmptyArray() {
        int[] array = {};
        int[] result = Defragmentation.compress(array);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress(int[])}
     * moves non-zero elements left when the first element is not {@code 0}.
     */
    @Test
    void whenNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress(int[])}
     * moves non-zero elements left when the first element is {@code 0}.
     */
    @Test
    void whenFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress(int[])}
     * processes an array with zeros at both ends.
     */
    @Test
    void whenFirst0AndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress(int[])}
     * handles an array of all zeros.
     */
    @Test
    void whenAll0() {
        int[] array = {0, 0, 0, 0};
        int[] result = Defragmentation.compress(array);
        int[] expected = {0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress(int[])}
     * moves non-zero elements left when array starts with zeros.
     */
    @Test
    void whenSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress(int[])}
     * returns the same array when it contains no zeros.
     */
    @Test
    void whenNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress2Point(int[])}
     * moves {@code 0} to the end in a small array.
     */
    @Test
    void when2PointOneFirst0() {
        int[] array = {0, 1};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress2Point(int[])}
     * processes an empty array.
     */
    @Test
    void when2PointEmptyArray() {
        int[] array = {};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress2Point(int[])}
     * moves non-zero elements left when the first element is not {@code 0}.
     */
    @Test
    void when2PointNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress2Point(int[])}
     * moves non-zero elements left when the first element is {@code 0}.
     */
    @Test
    void when2PointFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress2Point(int[])}
     * processes an array with zeros at both ends.
     */
    @Test
    void when2PointFirst0AndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress2Point(int[])}
     * handles an array of all zeros.
     */
    @Test
    void when2PointAll0() {
        int[] array = {0, 0, 0, 0};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress2Point(int[])}
     * moves non-zero elements left when array starts with zeros.
     */
    @Test
    void when2PointSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link Defragmentation#compress2Point(int[])}
     * returns the same array when it contains no zeros.
     */
    @Test
    void when2PointNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4};
        assertThat(result).isEqualTo(expected);
    }
}
