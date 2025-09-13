package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link ArrayChar} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class ArrayCharTest {

    /**
     * Verifies if the method returns {@code true}
     * when the word starts with the prefix.
     */
    @Test
    void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isTrue();
    }

    /**
     * Verifies if the method returns {@code false}
     * when the word does not start with the prefix.
     */
    @Test
    void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isFalse();
    }
}
