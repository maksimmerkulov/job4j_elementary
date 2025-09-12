package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Check} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class CheckTest {

    /**
     * Verifies if the method returns {@code true}
     * when all elements are {@code true}.
     */
    @Test
    void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[] {true, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    /**
     * Verifies if the method returns {@code false}
     * when elements are mixed.
     */
    @Test
    void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[] {true, false, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    /**
     * Verifies if the method returns {@code true}
     * when all elements are {@code false}.
     */
    @Test
    void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[] {false, false, false};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    /**
     * Verifies if the method returns {@code false}
     * when elements are mixed starting with {@code false}.
     */
    @Test
    void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[] {false, true, false};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }
}
