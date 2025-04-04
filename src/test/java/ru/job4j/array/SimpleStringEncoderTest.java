package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code SimpleStringEncoderTest} проверяет корректность работы метода
 * {@link SimpleStringEncoder#encode(String)} в классе {@link SimpleStringEncoder}.
 *
 * <p>Метод сжимает строку, заменяя повторяющиеся символы на символ и число повторений.</p>
 *
 * <p>Ожидаемый результат: строка преобразуется согласно алгоритму кодирования.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-03-09
 */
class SimpleStringEncoderTest {

    /**
     * Тест для строки из одного символа.
     *
     * <p>Ожидаемый результат: строка остается без изменений.</p>
     */
    @Test
    void whenOnlyOne() {
        String input = "a";
        String expected = "a";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тест для строки из двух одинаковых символов.
     *
     * <p>Ожидаемый результат: символ заменяется на символ + число повторений.</p>
     */
    @Test
    void whenDoubleA() {
        String input = "aa";
        String expected = "a2";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тест для строки "aaabbc".
     *
     * <p>Ожидаемый результат: "a3b2c".</p>
     */
    @Test
    void whenStringaaabbcThenResulta3b2c() {
        String input = "aaabbc";
        String expected = "a3b2c";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тест для строки "abbccc".
     *
     * <p>Ожидаемый результат: "ab2c3".</p>
     */
    @Test
    void whenStringabbcccThenResulta2b3c() {
        String input = "abbccc";
        String expected = "ab2c3";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тест для строки "aaabcc".
     *
     * <p>Ожидаемый результат: "a3bc2".</p>
     */
    @Test
    void whenStringaaabccThenResulta3bc2() {
        String input = "aaabcc";
        String expected = "a3bc2";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тест для строки "abc".
     *
     * <p>Ожидаемый результат: "abc" (без изменений).</p>
     */
    @Test
    void whenStringabcThenResultabc() {
        String input = "abc";
        String expected = "abc";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тест для строки "aaabbbccc".
     *
     * <p>Ожидаемый результат: "a3b3c3".</p>
     */
    @Test
    void whenStringaaabbbcccThenResulta3b3c3() {
        String input = "aaabbbccc";
        String expected = "a3b3c3";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тест для строки "aaaaaaaaaaaabbbcdddd".
     *
     * <p>Ожидаемый результат: "a12b3cd4".</p>
     */
    @Test
    void whenStringaaaaaaaaaaaabbbcddddThenResulta12b3cd4() {
        String input = "aaaaaaaaaaaabbbcdddd";
        String expected = "a12b3cd4";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Тест для строки "aaabbbbaaabbcccddddd".
     *
     * <p>Ожидаемый результат: "a3b4a3b2c3d5".</p>
     */
    @Test
    void whenStringaaabbbbaaabbcccdddddThenResulta3b4a3b2c3d5() {
        String input = "aaabbbbaaabbcccddddd";
        String expected = "a3b4a3b2c3d5";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }
}
