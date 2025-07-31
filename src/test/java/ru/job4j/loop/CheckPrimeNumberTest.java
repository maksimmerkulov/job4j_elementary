package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link CheckPrimeNumber} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class CheckPrimeNumberTest {

    /** Verifies that {@code 5} is correctly identified as a prime number. */
    @Test
    void when5ThenTrue() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    /** Verifies that {@code 4} is correctly identified as a non-prime. */
    @Test
    void when4ThenFalse() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /** Verifies that {@code 1} is correctly identified as a non-prime. */
    @Test
    void when1ThenFalse() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /** Verifies that {@code 11} is correctly identified as a prime number. */
    @Test
    void when11ThenTrue() {
        int number = 11;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    /** Verifies that {@code 25} is correctly identified as a non-prime. */
    @Test
    void when25ThenFalse() {
        int number = 25;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /** Verifies that {@code 9} is correctly identified as a non-prime. */
    @Test
    void when9ThenFalse() {
        int number = 9;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /** Verifies that {@code 49} is correctly identified as a non-prime. */
    @Test
    void when49ThenFalse() {
        int number = 49;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }
}
