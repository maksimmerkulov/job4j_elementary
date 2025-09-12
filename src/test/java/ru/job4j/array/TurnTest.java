package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Turn} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class TurnTest {

    /**
     * Verifies if the method reverses an array
     * with an even amount of elements: {@code 4}.
     */
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    /**
     * Verifies if the method reverses an array
     * with an odd amount of elements: {@code 5}.
     */
    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}
