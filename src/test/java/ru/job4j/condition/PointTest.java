package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

/**
 * Tests for the {@link Point} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class PointTest {

    /**
     * Verifies 2D distance between points {@code (0, 0)} and {@code (2, 0)}.
     */
    @Test
    void when00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(2.0, withPrecision(0.01));
    }

    /**
     * Verifies 2D distance with negative coordinates {@code (-1, -1)}
     * and {@code (1, 1)}.
     */
    @Test
    void whenMinus1Minus1And11Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double output = a.distance(b);
        assertThat(output).isEqualTo(2.83, withPrecision(0.01));
    }

    /**
     * Verifies 3D distance between points {@code (0, 0, 0)}
     * and {@code (2, 2, 2)}.
     */
    @Test
    void when000And222Then3Dot46() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(3.46, withPrecision(0.01));
    }

    /**
     * Verifies 3D distance between points {@code (1, 2, 3)}
     * and {@code (4, 5, 6)}.
     */
    @Test
    void when123And456Then5Dot19() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(5.19, withPrecision(0.01));
    }

    /**
     * Verifies 3D distance when points are the same.
     */
    @Test
    void whenPointsAreSameThen0() {
        Point a = new Point(5, 5, 5);
        Point b = new Point(5, 5, 5);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(0.0, withPrecision(0.01));
    }

    /**
     * Verifies 3D distance along the Z axis only.
     */
    @Test
    void whenOnlyZDiffersThen10() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 10);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(10.0, withPrecision(0.01));
    }
}
