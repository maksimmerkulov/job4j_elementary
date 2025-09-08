package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for the {@link Counter} class.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class CounterTest {

    /**
     * Verifies sum from 0 to 10.
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
     * Verifies sum from 3 to 8.
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
     * Verifies sum from 1 to 1.
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
     * Verifies sum with negative start.
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
     * Verifies sum when start exceeds finish.
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
     * Verifies even sum from 1 to 10.
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
     * Verifies even sum from 0 to 10.
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
     * Verifies even sum from 3 to 8.
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
     * Verifies even sum from 1 to 1.
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
     * Verifies even sum with negative start.
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
     * Verifies even sum when start exceeds finish.
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
