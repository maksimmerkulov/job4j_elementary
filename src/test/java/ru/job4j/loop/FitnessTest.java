package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Fitness} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class FitnessTest {

    /** Verifies behavior when Ivan is already greater than Nikolay. */
    @Test
    void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int expected = 0;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }

    /** Verifies behavior when Ivan is less than Nikolay by one unit. */
    @Test
    void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int expected = 1;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }

    /** Verifies behavior when Ivan is less by a larger margin. */
    @Test
    void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int expected = 2;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }

    /** Verifies behavior when Ivan and Nikolay have equal weights. */
    @Test
    void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int expected = 1;
        int result = Fitness.calc(ivan, nik);
        assertThat(result).isEqualTo(expected);
    }
}
