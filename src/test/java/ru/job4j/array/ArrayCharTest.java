package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code ArrayCharTest} проверяет работу метода {@link ArrayChar#startsWith(char[], char[])}
 * класса {@link ArrayChar}.
 *
 * <p>Метод {@link ArrayChar#startsWith(char[], char[])} определяет, начинается ли массив символов {@code word}
 * с указанного префикса {@code prefix}.</p>
 *
 * <p><b>Примеры тестируемых случаев:</b></p>
 * <ul>
 *     <li>Слово "Hello" начинается с префикса "He" → {@code true}.</li>
 *     <li>Слово "Hello" не начинается с префикса "Hi" → {@code false}.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * char[] word = {'H', 'e', 'l', 'l', 'o'};
 * char[] prefix = {'H', 'e'};
 * boolean result = ArrayChar.startsWith(word, prefix);
 * assertThat(result).isTrue();
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class ArrayCharTest {

    /**
     * Тест проверяет, что метод {@link ArrayChar#startsWith(char[], char[])}
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
     * Тест проверяет, что метод {@link ArrayChar#startsWith(char[], char[])}
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