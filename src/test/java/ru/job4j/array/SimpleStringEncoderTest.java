package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code SimpleStringEncoderTest} проверяет корректность работы метода
 * {@link SimpleStringEncoder#encode(String)} в классе
 * {@link SimpleStringEncoder}.
 *
 * <p>Метод сжимает строку, заменяя повторяющиеся символы на символ и число
 * повторений.</p>
 *
 * <p>Ожидаемый результат: строка преобразуется согласно алгоритму
 * кодирования.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * String input = "a";
 * String expected = "a";
 * String result = SimpleStringEncoder.encode(input);
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class SimpleStringEncoderTest {

    /**
     * Проверяет {@link SimpleStringEncoder#encode(String)} для строки из одного
     * символа.
     * Результат: строка остается без изменений.
     */
    @Test
    void whenOnlyOne() {
        String input = "a";
        String expected = "a";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет {@link SimpleStringEncoder#encode(String)} для строки из двух
     * одинаковых символов.
     * Результат: символ заменяется на символ + число повторений.
     */
    @Test
    void whenDoubleA() {
        String input = "aa";
        String expected = "a2";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет {@link SimpleStringEncoder#encode(String)} для строки "aaabbc".
     * Результат: "a3b2c".
     */
    @Test
    void whenStringaaabbcThenResulta3b2c() {
        String input = "aaabbc";
        String expected = "a3b2c";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет {@link SimpleStringEncoder#encode(String)} для строки "abbccc".
     * Результат: "ab2c3".
     */
    @Test
    void whenStringabbcccThenResulta2b3c() {
        String input = "abbccc";
        String expected = "ab2c3";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет {@link SimpleStringEncoder#encode(String)} для строки "aaabcc".
     * Результат: "a3bc2".
     */
    @Test
    void whenStringaaabccThenResulta3bc2() {
        String input = "aaabcc";
        String expected = "a3bc2";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет {@link SimpleStringEncoder#encode(String)} для строки "abc".
     * Результат: "abc" (без изменений).
     */
    @Test
    void whenStringabcThenResultabc() {
        String input = "abc";
        String expected = "abc";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет {@link SimpleStringEncoder#encode(String)} для строки
     * "aaabbbccc".
     * Результат: "a3b3c3".
     */
    @Test
    void whenStringaaabbbcccThenResulta3b3c3() {
        String input = "aaabbbccc";
        String expected = "a3b3c3";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет {@link SimpleStringEncoder#encode(String)} для строки
     * "aaaaaaaaaaaabbbcdddd".
     * Результат: "a12b3cd4".
     */
    @Test
    void whenStringaaaaaaaaaaaabbbcddddThenResulta12b3cd4() {
        String input = "aaaaaaaaaaaabbbcdddd";
        String expected = "a12b3cd4";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет {@link SimpleStringEncoder#encode(String)} для строки
     * "aaabbbbaaabbcccddddd".
     * Результат: "a3b4a3b2c3d5".
     */
    @Test
    void whenStringaaabbbbaaabbcccdddddThenResulta3b4a3b2c3d5() {
        String input = "aaabbbbaaabbcccddddd";
        String expected = "a3b4a3b2c3d5";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }
}
