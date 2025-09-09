package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for the {@link PrimeNumber} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class PrimeNumberTest {

    /**
     * Verifies the count of prime numbers up to 5.
     */
    @Test
    void when5Then3() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the count of prime numbers up to 11.
     */
    @Test
    void when11Then5() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the count of prime numbers up to 2.
     */
    @Test
    void when2Then1() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the count of prime numbers up to 25.
     */
    @Test
    void when25Then9() {
        int finish = 25;
        int result = PrimeNumber.calc(finish);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies the count of prime numbers up to 49.
     */
    @Test
    void when49Then15() {
        int finish = 49;
        int result = PrimeNumber.calc(finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }
}
