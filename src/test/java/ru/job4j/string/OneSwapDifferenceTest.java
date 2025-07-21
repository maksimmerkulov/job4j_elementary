package ru.job4j.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Класс {@code OneSwapDifferenceTest} содержит модульные тесты
 * для метода {@link OneSwapDifference#canTransform(String, String)}.
 *
 * <p>Проверяются различные граничные и типовые случаи: успешная перестановка,
 * отсутствие различий, больше двух отличий, разная длина строк и пустые строки.</p>
 *
 * <p><b>Цель тестирования:</b> проверить, способен ли метод корректно определить,
 * можно ли преобразовать первое слово во второе посредством одной перестановки двух символов.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * assertTrue(OneSwapDifference.canTransform("converse", "convesre"));
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class OneSwapDifferenceTest {

    /**
     * Проверка, что метод возвращает {@code true},
     * когда ровно два символа нужно поменять местами.
     */
    @Test
    void whenSwapTwoLettersThenTrue() {
        assertTrue(OneSwapDifference.canTransform("converse", "convesre"));
    }

    /**
     * Проверка, что метод возвращает {@code false},
     * если слова идентичны и перестановка не требуется.
     */
    @Test
    void whenWordsAreEqualThenFalse() {
        assertFalse(OneSwapDifference.canTransform("same", "same"));
    }

    /**
     * Проверка, что метод возвращает {@code false},
     * если различий в символах больше двух.
     */
    @Test
    void whenMoreThanTwoDifferencesThenFalse() {
        assertFalse(OneSwapDifference.canTransform("abcde", "edcba"));
    }

    /**
     * Проверка, что метод возвращает {@code false}, если длина слов различается.
     */
    @Test
    void whenDifferentLengthsThenFalse() {
        assertFalse(OneSwapDifference.canTransform("abc", "ab"));
    }

    /**
     * Проверка, что метод возвращает {@code true}, если требуется
     * перестановка символов, расположенных в начале и в конце строки.
     */
    @Test
    void whenSwapNeededAtEdgesThenTrue() {
        assertTrue(OneSwapDifference.canTransform("ab", "ba"));
    }

    /**
     * Проверка, что метод возвращает {@code false}, если найдено только одно различие —
     * одной позиции недостаточно для выполнения перестановки двух символов.
     */
    @Test
    void whenOnlyOneDifferenceThenFalse() {
        assertFalse(OneSwapDifference.canTransform("abcd", "abcf"));
    }

    /**
     * Проверка, что метод возвращает {@code false}, если обе строки пустые.
     */
    @Test
    void whenEmptyStringsThenFalse() {
        assertFalse(OneSwapDifference.canTransform("", ""));
    }
}