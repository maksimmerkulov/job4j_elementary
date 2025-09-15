package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link SortSelected} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class SortSelectedTest {

    /**
     * Verifies sorting of an array with {@code 5} elements.
     */
    @Test
    void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Verifies sorting of an array with {@code 3} elements.
     */
    @Test
    void whenSortThreeElements() {
        int[] data = new int[] {3, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Verifies sorting of another array with {@code 5} elements.
     */
    @Test
    void whenSortFiveElements() {
        int[] data = new int[] {5, 3, 4, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }
}
