package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code RollBackArrayTest} предназначен для проверки метода
 * {@link RollBackArray#rollback(int[])} в классе {@link RollBackArray}.
 *
 * <p>Данный класс содержит тесты для проверки работы метода {@link RollBackArray#rollback(int[])}
 * на различных входных данных.</p>
 *
 * <p>Тестируется:</p>
 * <ul>
 *     <li>Пустой массив</li>
 *     <li>Массив из одного элемента</li>
 *     <li>Обычный массив с различными элементами</li>
 *     <li>Массив, состоящий из одинаковых элементов</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-26
 */
public class RollBackArrayTest {

    /**
     * Проверка метода {@link RollBackArray#rollback(int[])} на пустом массиве.
     */
    @Test
    public void whenEmpty() {
        int[] input = new int[] {};
        int[] expected = new int[] {};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверка метода {@link RollBackArray#rollback(int[])} на массиве из одного элемента.
     */
    @Test
    public void whenOne() {
        int[] input = new int[] {1};
        int[] expected = new int[] {1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверка метода {@link RollBackArray#rollback(int[])} на массиве с разными элементами.
     */
    @Test
    public void whenFull() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {4, 3, 2, 1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }

    /**
     * Проверка метода {@link RollBackArray#rollback(int[])} на массиве, состоящем из одинаковых элементов.
     */
    @Test
    public void whenTheSame() {
        int[] input = new int[] {1, 1, 1, 1};
        int[] expected = new int[] {1, 1, 1, 1};
        int[] result = RollBackArray.rollback(input);
        assertThat(result).containsExactly(expected);
    }
}