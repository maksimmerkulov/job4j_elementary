package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Vector} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class VectorTest {

    /**
     * Verifies addition of {@code (1, 2) + (3, 4)} equals {@code (4, 6)}.
     */
    @Test
    void whenVectors12And34ThenResult4And6() {
        int x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        String expected = "(4, 6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Verifies addition of {@code (-1, -2) + (3, 4)} equals {@code (2, 2)}.
     */
    @Test
    void whenVectorsMinus12And34ThenResult2And2() {
        int x1 = -1, y1 = -2, x2 = 3, y2 = 4;
        String expected = "(2, 2)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Verifies addition of {@code (-1, -2) + (-3, -4)} equals {@code (-4, -6)}.
     */
    @Test
    void whenVectorsMinus12AndMinus34ThenResultMinus4AndMinus6() {
        int x1 = -1, y1 = -2, x2 = -3, y2 = -4;
        String expected = "(-4, -6)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}
