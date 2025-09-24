package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

/**
 * Класс {@code FitTest} предназначен для проверки методов
 * {@link Fit#manWeight(short)} и {@link Fit#womanWeight(short)} в классе
 * {@link Fit}.
 *
 * <p>Проверяет корректность вычислений идеального веса для мужчин и женщин.</p>
 *
 * <p><b>Примеры тестирования:</b></p>
 * <pre>{@code
 * short input = 180;
 * double expected = 92;
 * double output = Fit.manWeight(input);
 * assertThat(output).isEqualTo(expected, withPrecision(0.01));
 *
 * short input = 170;
 * double expected = 69;
 * double output = Fit.womanWeight(input);
 * assertThat(output).isEqualTo(expected, withPrecision(0.01));
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class FitTest {

    /**
     * Тестирует метод {@link Fit#manWeight(short)} для расчета идеального веса
     * для мужчины с ростом 180 см.
     * Ожидаемый результат — 92 кг.
     */
    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Тестирует метод {@link Fit#womanWeight(short)} для расчета идеального
     * веса для женщины с ростом 170 см.
     * Ожидаемый результат — 69 кг.
     */
    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
