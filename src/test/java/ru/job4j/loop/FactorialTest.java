package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Factorial} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class FactorialTest {

    /**
     * Verifies factorial for {@code 5}.
     */
    @Test
    void whenCalculateFactorialFor5Then120() {
        int expected = 120;
        int number = 5;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Verifies factorial for {@code 0}.
     */
    @Test
    void whenCalculateFactorialFor0Then1() {
        int expected = 1;
        int number = 0;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Verifies factorial for {@code 1}.
     */
    @Test
    void whenCalculateFactorialFor1Then1() {
        int expected = 1;
        int number = 1;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Verifies factorial for {@code 3}.
     */
    @Test
    void whenCalculateFactorialFor3Then6() {
        int expected = 6;
        int number = 3;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Verifies factorial for {@code 7}.
     */
    @Test
    void whenCalculateFactorialFor7Then5040() {
        int expected = 5040;
        int number = 7;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }
}
