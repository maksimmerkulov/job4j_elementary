package ru.job4j.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Тест-класс {@code MaxTest} для класса {@link Max}.
 * <p>
 * Проверяются методы нахождения максимального числа среди 2, 3 и 4 значений.
 * </p>
 * <ul>
 *     <li>{@link #whenMaxOfTwoThenCorrect()} – тестирование метода
 *     {@link Max#max(double, double)} для двух чисел.</li>
 *     <li>{@link #whenMaxOfThreeThenCorrect()} – тестирование метода
 *     {@link Max#max(double, double, double)} для трех чисел.</li>
 *     <li>{@link #whenMaxOfFourThenCorrect()} – тестирование метода
 *     {@link Max#max(double, double, double, double)} для четырех чисел.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-05
 */
class MaxTest {

    /**
     * Допустимая погрешность для сравнения чисел с плавающей точкой.
     * <p>
     * Помогает обеспечить стабильность утверждений при сравнении значений типа double.
     * </p>
     */
    private static final double DELTA = 0.0001;

    /**
     * Экземпляр класса для тестирования.
     * <p>
     * Используется для вызова перегруженных методов {@code max()}.
     * </p>
     */
    private final Max max = new Max();

    /**
     * Тест метода {@link Max#max(double, double)}.
     * <p>
     * Проверяется, что правильно определяется максимальное значение среди двух чисел.
     * </p>
     */
    @Test
    void whenMaxOfTwoThenCorrect() {
        assertEquals(5.0, max.max(3.0, 5.0), DELTA);
        assertEquals(10.0, max.max(10.0, 7.0), DELTA);
        assertEquals(0.0, max.max(-5.0, 0.0), DELTA);
        assertEquals(4.0, max.max(4.0, 4.0), DELTA);
    }

    /**
     * Тест метода {@link Max#max(double, double, double)}.
     * <p>
     * Проверяется, что правильно определяется максимальное значение среди трех чисел.
     * </p>
     */
    @Test
    void whenMaxOfThreeThenCorrect() {
        assertEquals(7.0, max.max(3.0, 5.0, 7.0), DELTA);
        assertEquals(12.0, max.max(12.0, 8.0, 10.0), DELTA);
        assertEquals(0.0, max.max(-1.0, -3.0, 0.0), DELTA);
        assertEquals(4.0, max.max(4.0, 4.0, 4.0), DELTA);
    }

    /**
     * Тест метода {@link Max#max(double, double, double, double)}.
     * <p>
     * Проверяется, что правильно определяется максимальное значение среди четырех чисел.
     * </p>
     */
    @Test
    void whenMaxOfFourThenCorrect() {
        assertEquals(9.0, max.max(3.0, 5.0, 7.0, 9.0), DELTA);
        assertEquals(15.0, max.max(12.0, 8.0, 10.0, 15.0), DELTA);
        assertEquals(1.0, max.max(0.0, -2.0, -5.0, 1.0), DELTA);
        assertEquals(6.0, max.max(6.0, 6.0, 6.0, 6.0), DELTA);
    }
}