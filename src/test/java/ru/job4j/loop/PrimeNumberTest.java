package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link PrimeNumber} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class PrimeNumberTest {

    /**
     * Verifies that there are {@code 3} prime numbers
     * from {@code 2} to {@code 5}.
     */
    @Test
    void when5Then3() {
        int finish = 5;
        int expected = 3;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that there are {@code 5} prime numbers
     * from {@code 2} to {@code 11}.
     */
    @Test
    void when11Then5() {
        int finish = 11;
        int expected = 5;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that there is {@code 1} prime number
     * from {@code 2} to {@code 2}.
     */
    @Test
    void when2Then1() {
        int finish = 2;
        int expected = 1;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that there are {@code 9} prime numbers
     * from {@code 2} to {@code 25}.
     */
    @Test
    void when25Then9() {
        int finish = 25;
        int expected = 9;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that there are {@code 15} prime numbers
     * from {@code 2} to {@code 49}.
     */
    @Test
    void when49Then15() {
        int finish = 49;
        int expected = 15;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }
}
