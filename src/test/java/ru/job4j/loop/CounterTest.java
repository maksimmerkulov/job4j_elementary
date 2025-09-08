package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for the {@link Counter} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class CounterTest {

    /**
     * Verifies the sum from 0 to 10.
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
     * Verifies the sum from 3 to 8.
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
     * Verifies the sum from 1 to 1.
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
     * Verifies the sum with a negative start.
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
     * Verifies the sum when the start exceeds the finish.
     */
    @Test
    void whenStartGreaterThanFinishThen0() {
        int start = 10;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}
