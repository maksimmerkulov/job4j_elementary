package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Тест-класс {@code PointTest} предназначен для тестирования метода {@link Point#distance(Point)}
 * класса {@link Point}, который вычисляет Евклидово расстояние между точками.
 * <p>
 * Для тестирования используются точки с различными координатами,
 * а результаты сравниваются с ожидаемыми значениями.
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-04-03
 */
class PointTest {

    /**
     * Тест проверяет расстояние между точками (0,0) и (2,0).
     * Ожидаемое значение: 2.0.
     */
    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Тест проверяет расстояние между точками (-1,-1) и (1,1).
     * Ожидаемое значение: 2.83.
     */
    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double expected = 2.83;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Тест проверяет расстояние между точками (-2,-2) и (2,2).
     * Ожидаемое значение: 5.66.
     */
    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double expected = 5.66;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}