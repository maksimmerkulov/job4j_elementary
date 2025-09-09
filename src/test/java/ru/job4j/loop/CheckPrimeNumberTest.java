package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for the {@link CheckPrimeNumber} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class CheckPrimeNumberTest {

    /**
     * Verifies that number 5 is prime.
     */
    @Test
    void when5ThenTrue() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    /**
     * Verifies that number 4 is not prime.
     */
    @Test
    void when4ThenFalse() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /**
     * Verifies that number 1 is not prime.
     */
    @Test
    void when1ThenFalse() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /**
     * Verifies that number 11 is prime.
     */
    @Test
    void when11ThenTrue() {
        int number = 11;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    /**
     * Verifies that number 25 is not prime.
     */
    @Test
    void when25ThenFalse() {
        int number = 25;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /**
     * Verifies that number 9 is not prime.
     */
    @Test
    void when9ThenFalse() {
        int number = 9;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /**
     * Verifies that number 49 is not prime.
     */
    @Test
    void when49ThenFalse() {
        int number = 49;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }
}
