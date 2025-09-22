package ru.job4j;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for the {@link Main} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class MainTest {

    /**
     * Verifies correct result execution.
     */
    @Test
    void whenActionThenResult() {
        int expected = 1;
        int result = 1;
        assertThat(result).isEqualTo(expected);
    }
}
