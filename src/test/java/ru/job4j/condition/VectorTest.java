package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for the {@link Vector} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class VectorTest {

    /**
     * Verifies the addition of positive vectors.
     */
    @Test
    void whenVectors12And34ThenResult46() {
        int x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        String expected = "(4, 6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Verifies the addition of negative and positive vectors.
     */
    @Test
    void whenVectorsMinus12And34ThenResult22() {
        int x1 = -1, y1 = -2, x2 = 3, y2 = 4;
        String expected = "(2, 2)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Verifies the addition of negative vectors.
     */
    @Test
    void whenVectorsMinus12AndMinus34ThenResultMinus46() {
        int x1 = -1, y1 = -2, x2 = -3, y2 = -4;
        String expected = "(-4, -6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}
