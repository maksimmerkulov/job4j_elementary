package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

/**
 * Tests for the {@link Max} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class MaxTest {

    /** Instance of the class under test. */
    private final Max max = new Max();

    /** Verifies correct maximum selection for two numbers. */
    @Test
    void whenMaxOfTwoThenCorrect() {
        assertThat(max.max(3.0, 5.0)).isEqualTo(5.0, withPrecision(0.0001));
        assertThat(max.max(10.0, 7.0)).isEqualTo(10.0, withPrecision(0.0001));
        assertThat(max.max(-5.0, 0.0)).isEqualTo(0.0, withPrecision(0.0001));
        assertThat(max.max(4.0, 4.0)).isEqualTo(4.0, withPrecision(0.0001));
    }

    /** Verifies correct maximum selection for three numbers. */
    @Test
    void whenMaxOfThreeThenCorrect() {
        assertThat(max.max(3.0, 5.0, 7.0)).isEqualTo(7.0, withPrecision(0.0001));
        assertThat(max.max(12.0, 8.0, 10.0)).isEqualTo(12.0, withPrecision(0.0001));
        assertThat(max.max(-1.0, -3.0, 0.0)).isEqualTo(0.0, withPrecision(0.0001));
        assertThat(max.max(4.0, 4.0, 4.0)).isEqualTo(4.0, withPrecision(0.0001));
    }

    /** Verifies correct maximum selection for four numbers. */
    @Test
    void whenMaxOfFourThenCorrect() {
        assertThat(max.max(3.0, 5.0, 7.0, 9.0)).isEqualTo(9.0, withPrecision(0.0001));
        assertThat(max.max(12.0, 8.0, 10.0, 15.0)).isEqualTo(15.0, withPrecision(0.0001));
        assertThat(max.max(0.0, -2.0, -5.0, 1.0)).isEqualTo(1.0, withPrecision(0.0001));
        assertThat(max.max(6.0, 6.0, 6.0, 6.0)).isEqualTo(6.0, withPrecision(0.0001));
    }
}
