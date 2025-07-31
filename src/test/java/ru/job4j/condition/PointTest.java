package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

/**
 * Tests for the {@link Point} class.
 *
 * @author Maksim Merkulov
 * @version 1.4
 */
class PointTest {

    /** Verifies 2D distance for points {@code (0,0)} and {@code (0,2)}. */
    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /** Verifies 2D distance between {@code (-1,-1)} and {@code (1,1)}. */
    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double expected = 2.83;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /** Verifies 2D distance between {@code (-2,-2)} and {@code (2,2)}. */
    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double expected = 5.66;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /** Verifies 2D distance for identical points {@code (0,0)}. */
    @Test
    void whenPoints00And00Then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /** Verifies 2D distance between {@code (-3,-3)} and {@code (-6,-7)}. */
    @Test
    void whenPointsMinus3Minus3AndMinus6Minus7Then5() {
        Point a = new Point(-3, -3);
        Point b = new Point(-6, -7);
        double expected = 5.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /** Verifies 3D distance between {@code (1,2,3)} and {@code (4,5,6)}. */
    @Test
    void whenPoints123And456Then5Dot2() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double expected = 5.2;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /** Verifies 3D distance when both points are at {@code (1,1,1)}. */
    @Test
    void whenPoints111And111Then0() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(1, 1, 1);
        double expected = 0.0;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /** Verifies 3D distance between {@code (0,0,0)} and {@code (3,4,12)}. */
    @Test
    void whenPoints000And3412Then13() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 4, 12);
        double expected = 13.0;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
