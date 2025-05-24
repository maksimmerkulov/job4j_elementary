package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Класс {@code RectangleTest} предназначен для проверки метода
 * {@link Rectangle#diagonal(double, double)} из класса {@link Rectangle}.
 *
 * <p>Метод {@link Rectangle#diagonal(double, double)} вычисляет диагональ прямоугольника
 * по его длине и ширине с использованием теоремы Пифагора.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * double length = 3;
 * double width = 4;
 * double expected = 5.0;
 * double output = Rectangle.diagonal(length, width);
 * assertThat(output).isEqualTo(expected, withPrecision(0.01));
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class RectangleTest {

    /**
     * Тест проверяет, что диагональ прямоугольника со сторонами 3 и 4 равна 5.
     */
    @Test
    void whenLength3AndWidth4ThenDiagonal5() {
        double length = 3;
        double width = 4;
        double expected = 5.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Тест проверяет, что диагональ прямоугольника со сторонами 5 и 12 равна 13.
     */
    @Test
    void whenLength5AndWidth12ThenDiagonal13() {
        double length = 5;
        double width = 12;
        double expected = 13.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Тест проверяет, что диагональ прямоугольника со сторонами 7 и 24 равна 25.
     */
    @Test
    void whenLength7AndWidth24ThenDiagonal25() {
        double length = 7;
        double width = 24;
        double expected = 25.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}