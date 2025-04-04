package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code EndsWithTest} проверяет корректность работы метода
 * {@link EndsWith#endsWith(char[], char[])} в классе {@link EndsWith}.
 *
 * <p>Тесты проверяют поведение метода в разных сценариях, включая случаи,
 * когда массив заканчивается на заданный постфикс и когда нет.</p>
 *
 * <p>Примеры проверок:</p>
 * <pre>
 *     endsWith({'H', 'e', 'l', 'l', 'o'}, {'l', 'o'}) → true
 *     endsWith({'H', 'e', 'l', 'l', 'o'}, {'l', 'a'}) → false
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-27
 */
public class EndsWithTest {

    /**
     * Тест проверяет случай, когда массив заканчивается на переданный постфикс.
     * Ожидается {@code true}.
     */
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isTrue();
    }

    /**
     * Тест проверяет случай, когда массив НЕ заканчивается на переданный постфикс.
     * Ожидается {@code false}.
     */
    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isFalse();
    }
}