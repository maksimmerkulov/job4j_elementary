package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Check} class.
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
class CheckTest {

    /**
     * Verifies that {@code mono} returns {@code true}
     * when all elements are {@code true}.
     */
    @Test
    void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[] {true, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    /**
     * Verifies that {@code mono} returns {@code false}
     * when elements are mixed {@code true} and {@code false}.
     */
    @Test
    void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[] {true, false, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    /**
     * Verifies that {@code mono} returns {@code true}
     * when all elements are {@code false}.
     */
    @Test
    void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[] {false, false, false};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    /**
     * Verifies that {@code mono} returns {@code false}
     * when elements are mixed {@code false} and {@code true}.
     */
    @Test
    void whenDataNotMonoByFalseThenFalse() {
        boolean[] data = new boolean[] {false, true, false};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }
}
