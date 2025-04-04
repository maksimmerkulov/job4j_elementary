package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Тест-класс {@code MaxTest} для класса {@link Max}.
 * <p>
 * Проверяются методы нахождения максимального числа среди 3 и 4 значений.
 * </p>
 * <ul>
 *     <li>{@link #whenMaxOfThreeThenCorrect()} – тестирование метода
 *     {@link Max#max(double, double, double)} для трех чисел.</li>
 *     <li>{@link #whenMaxOfFourThenCorrect()} – тестирование метода
 *     {@link Max#max(double, double, double, double)} для четырех чисел.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-04
 */
class MaxTest {

    /**
     * Тест метода {@link Max#max(double, double, double)} для трех чисел.
     * Проверяется корректность определения максимального значения.
     */
    @Test
    void whenMaxOfThreeThenCorrect() {
        Max max = new Max();
        assertEquals(7, max.max(3, 5, 7));
        assertEquals(12, max.max(12, 8, 10));
        assertEquals(0, max.max(-1, -3, 0));
        assertEquals(4, max.max(4, 4, 4));
    }

    /**
     * Тест метода {@link Max#max(double, double, double, double)} для четырех чисел.
     * Проверяется корректность определения максимального значения.
     */
    @Test
    void whenMaxOfFourThenCorrect() {
        Max max = new Max();
        assertEquals(9, max.max(3, 5, 7, 9));
        assertEquals(15, max.max(12, 8, 10, 15));
        assertEquals(1, max.max(0, -2, -5, 1));
        assertEquals(6, max.max(6, 6, 6, 6));
    }
}
