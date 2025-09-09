package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Fitness} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class FitnessTest {

    /**
     * Verifies that months is {@code 0} when Ivan is already stronger.
     */
    @Test
    void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that months is {@code 1} when Ivan is slightly weaker.
     */
    @Test
    void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that months is {@code 2} when Ivan is much weaker.
     */
    @Test
    void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that months is {@code 1} when strengths are equal.
     */
    @Test
    void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}
