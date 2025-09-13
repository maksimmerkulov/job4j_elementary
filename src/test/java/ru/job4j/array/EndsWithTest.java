package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link EndsWith} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class EndsWithTest {

    /**
     * Verifies if the method returns {@code true}
     * when the word ends with the postfix.
     */
    @Test
    void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isTrue();
    }

    /**
     * Verifies if the method returns {@code false}
     * when the word does not end with the postfix.
     */
    @Test
    void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isFalse();
    }
}
