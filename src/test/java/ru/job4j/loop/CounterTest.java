package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Counter} class.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class CounterTest {

    /**
     * Verifies sum from {@code 0} to {@code 10}.
     */
    @Test
    void whenSumFrom0To10Then55() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies sum from {@code 3} to {@code 8}.
     */
    @Test
    void whenSumFrom3To8Then33() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies sum from {@code 1} to {@code 1}.
     */
    @Test
    void whenSumFrom1To1Then1() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies sum from {@code -5} to {@code 10}.
     */
    @Test
    void whenSumFromMinus5To10Then40() {
        int start = -5;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that sum is {@code 0} when start is greater than finish.
     */
    @Test
    void whenStartGreaterThanFinishThen0() {
        int start = 10;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies sum of even numbers from {@code 1} to {@code 10}.
     */
    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies sum of even numbers from {@code 0} to {@code 10}.
     */
    @Test
    void whenSumEvenNumbersFrom0To10Then30() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies sum of even numbers from {@code 3} to {@code 8}.
     */
    @Test
    void whenSumEvenNumbersFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies sum of even numbers from {@code 1} to {@code 1}.
     */
    @Test
    void whenSumEvenNumbersFrom1To1Then0() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies sum of even numbers from {@code -5} to {@code 10}.
     */
    @Test
    void whenSumEvenNumbersFromMinus5To10Then24() {
        int start = -5;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that sum of even numbers is {@code 0}
     * when start is greater than finish.
     */
    @Test
    void whenSumEvenNumbersStartGreaterThanFinishThen0() {
        int start = 10;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}
