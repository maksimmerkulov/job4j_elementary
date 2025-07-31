package ru.job4j;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Main} class.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class MainTest {

    /** Verifies that the action produces the expected result. */
    @Test
    void whenActionThenResult() {
        int expected = 1;
        int result = 1;
        assertThat(result).isEqualTo(expected);
    }
}
