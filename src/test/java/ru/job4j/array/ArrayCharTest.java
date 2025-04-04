package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code ArrayCharTest} проверяет работу метода {@link ArrayChar#startsWith(char[], char[])}
 * класса {@link ArrayChar}.
 *
 * <p>Метод {@link ArrayChar#startsWith(char[], char[])} определяет, начинается ли массив символов {@code word}
 * с указанного префикса {@code prefix}.
 * В тестах проверяется корректность работы метода на различных входных данных.</p>
 *
 * <p>Примеры тестируемых случаев:</p>
 * <ul>
 *     <li>Слово "Hello" начинается с префикса "He" → {@code true}.</li>
 *     <li>Слово "Hello" не начинается с префикса "Hi" → {@code false}.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-28
 */
public class ArrayCharTest {

    /**
     * Проверяет, что метод {@link ArrayChar#startsWith(char[], char[])}
     * корректно определяет начало слова "Hello" с префиксом "He".
     *
     * <p>Ожидаемый результат: {@code true}.</p>
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isTrue();
    }

    /**
     * Проверяет, что метод {@link ArrayChar#startsWith(char[], char[])}
     * корректно определяет, что слово "Hello" не начинается с префикса "Hi".
     *
     * <p>Ожидаемый результат: {@code false}.</p>
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isFalse();
    }
}