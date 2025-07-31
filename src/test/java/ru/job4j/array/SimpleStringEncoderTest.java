package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link SimpleStringEncoder} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class SimpleStringEncoderTest {

    /**
     * Verifies that a single-character string remains unchanged.
     */
    @Test
    void whenOnlyOne() {
        String input = "a";
        String expected = "a";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that two identical characters are encoded as character and count.
     */
    @Test
    void whenDoubleA() {
        String input = "aa";
        String expected = "a2";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for a string with multiple repeated characters:
     * {@code "aaabbc"}.
     */
    @Test
    void whenStringaaabbcThenResulta3b2c() {
        String input = "aaabbc";
        String expected = "a3b2c";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for a string: {@code "abbccc"} -> {@code "ab2c3"}.
     */
    @Test
    void whenStringabbcccThenResulta2b3c() {
        String input = "abbccc";
        String expected = "ab2c3";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for separated repeated characters:
     * {@code "aaabcc"} -> {@code "a3bc2"}.
     */
    @Test
    void whenStringaaabccThenResulta3bc2() {
        String input = "aaabcc";
        String expected = "a3bc2";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that a string without consecutive duplicates remains unchanged.
     */
    @Test
    void whenStringabcThenResultabc() {
        String input = "abc";
        String expected = "abc";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for a string with equal repeated blocks:
     * {@code "aaabbbccc"}.
     */
    @Test
    void whenStringaaabbbcccThenResulta3b3c3() {
        String input = "aaabbbccc";
        String expected = "a3b3c3";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for longer repeated sequences:
     * {@code "aaaaaaaaaaaabbbcdddd"}.
     */
    @Test
    void whenStringaaaaaaaaaaaabbbcddddThenResulta12b3cd4() {
        String input = "aaaaaaaaaaaabbbcdddd";
        String expected = "a12b3cd4";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies encoding for a complex string with multiple repeated blocks.
     */
    @Test
    void whenStringaaabbbbaaabbcccdddddThenResulta3b4a3b2c3d5() {
        String input = "aaabbbbaaabbcccddddd";
        String expected = "a3b4a3b2c3d5";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }
}
