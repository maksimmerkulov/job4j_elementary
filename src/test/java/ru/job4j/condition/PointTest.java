package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Тест-класс {@code PointTest} предназначен для тестирования методов класса {@link Point}.
 * В частности, для проверки метода {@link Point#distance(Point)} для вычисления Евклидова расстояния
 * между двумя точками и метода {@link Point#distance3d(Point)} для вычисления расстояния между
 * точками в трехмерном пространстве.
 * <p>
 * Для тестирования используются точки с различными координатами, а результаты сравниваются с ожидаемыми значениями.
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.3
 * @since 2025-04-05
 */
class PointTest {

    /**
     * Тест проверяет расстояние между точками (0,0) и (2,0).
     * Ожидаемое значение: 2.0.
     */
    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
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

    /**
     * Тест проверяет расстояние между точками (0, 0) и (0, 0).
     * Ожидаемое значение: 0.0.
     */
    @Test
    void whenPoints00And00Then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Тест проверяет расстояние между точками с отрицательными координатами (-3, -3) и (-6, -7).
     * Ожидаемое значение: 5.0.
     */
    @Test
    void whenPointsMinus3Minus3AndMinus6Minus7Then5() {
        Point a = new Point(-3, -3);
        Point b = new Point(-6, -7);
        double expected = 5.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Тест проверяет расстояние между точками (1, 2, 3) и (4, 5, 6).
     * Ожидаемое значение: 5.2.
     */
    @Test
    void whenPoints123And456Then5Dot2() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double expected = 5.2;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Тест проверяет расстояние между точками (1, 1, 1) и (1, 1, 1).
     * Ожидаемое значение: 0.0.
     */
    @Test
    void whenPoints111And111Then0() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(1, 1, 1);
        double expected = 0.0;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Тест проверяет расстояние между точками (0, 0, 0) и (3, 4, 12).
     * Ожидаемое значение: 13.0.
     */
    @Test
    void whenPoints000And3412Then13() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 4, 12);
        double expected = 13.0;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}