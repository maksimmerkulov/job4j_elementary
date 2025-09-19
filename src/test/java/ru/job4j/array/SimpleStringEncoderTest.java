package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link SimpleStringEncoder} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class SimpleStringEncoderTest {

    /**
     * Verifies that {@link SimpleStringEncoder#encode(String)} returns
     * the same character for a single-character input.
     */
    @Test
    void whenOnlyOne() {
        String input = "a";
        String expected = "a";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that {@link SimpleStringEncoder#encode(String)} returns
     * character with count for two identical characters.
     */
    @Test
    void whenDoubleA() {
        String input = "aa";
        String expected = "a2";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for the input {@code "aaabbc"}.
     */
    @Test
    void whenStringaaabbcThenResulta3b2c() {
        String input = "aaabbc";
        String expected = "a3b2c";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for the input {@code "abbccc"}.
     */
    @Test
    void whenStringabbcccThenResulta2b3c() {
        String input = "abbccc";
        String expected = "ab2c3";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for the input {@code "aaabcc"}.
     */
    @Test
    void whenStringaaabccThenResulta3bc2() {
        String input = "aaabcc";
        String expected = "a3bc2";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for the input {@code "abc"}.
     */
    @Test
    void whenStringabcThenResultabc() {
        String input = "abc";
        String expected = "abc";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for the input {@code "aaabbbccc"}.
     */
    @Test
    void whenStringaaabbbcccThenResulta3b3c3() {
        String input = "aaabbbccc";
        String expected = "a3b3c3";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for a long sequence of identical characters.
     */
    @Test
    void whenStringaaaaaaaaaaaabbbcddddThenResulta12b3cd4() {
        String input = "aaaaaaaaaaaabbbcdddd";
        String expected = "a12b3cd4";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for a complex repeating sequence.
     */
    @Test
    void whenStringaaabbbbaaabbcccdddddThenResulta3b4a3b2c3d5() {
        String input = "aaabbbbaaabbcccddddd";
        String expected = "a3b4a3b2c3d5";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }
}
