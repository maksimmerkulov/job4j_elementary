package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link CheckPrimeNumber} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class CheckPrimeNumberTest {

    /**
     * Verifies if {@code 5} is prime.
     */
    @Test
    void when5ThenTrue() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    /**
     * Verifies if {@code 4} is prime.
     */
    @Test
    void when4ThenFalse() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /**
     * Verifies if {@code 1} is prime.
     */
    @Test
    void when1ThenFalse() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /**
     * Verifies if {@code 11} is prime.
     */
    @Test
    void when11ThenTrue() {
        int number = 11;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    /**
     * Verifies if {@code 25} is prime.
     */
    @Test
    void when25ThenFalse() {
        int number = 25;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /**
     * Verifies if {@code 9} is prime.
     */
    @Test
    void when9ThenFalse() {
        int number = 9;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /**
     * Verifies if {@code 49} is prime.
     */
    @Test
    void when49ThenFalse() {
        int number = 49;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }
}
