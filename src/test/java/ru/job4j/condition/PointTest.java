package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

/**
 * Tests for the {@link Point} class.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class PointTest {

    /**
     * Verifies distance between points {@code (0, 0)} and {@code (2, 0)}.
     */
    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Verifies distance between points {@code (-1, -1)} and {@code (1, 1)}.
     */
    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double expected = 2.82;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Verifies distance between points {@code (-2, -2)} and {@code (2, 2)}.
     */
    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double expected = 5.65;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
