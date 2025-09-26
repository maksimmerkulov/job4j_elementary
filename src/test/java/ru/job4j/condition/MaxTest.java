package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Max} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class MaxTest {

    /**
     * Verifies maximum of two numbers.
     */
    @Test
    void whenMax1To2Then2() {
        Max math = new Max();
        int result = math.max(1, 2);
        assertThat(result).isEqualTo(2);
    }

    /**
     * Verifies maximum of three numbers.
     */
    @Test
    void whenMax3To1To2Then3() {
        Max math = new Max();
        int result = math.max(3, 1, 2);
        assertThat(result).isEqualTo(3);
    }

    /**
     * Verifies maximum of four numbers.
     */
    @Test
    void whenMax1To10To2To5Then10() {
        Max math = new Max();
        int result = math.max(1, 10, 2, 5);
        assertThat(result).isEqualTo(10);
    }
}
