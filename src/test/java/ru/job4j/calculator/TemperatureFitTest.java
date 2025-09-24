package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

/**
 * Класс {@code TemperatureFitTest} предназначен для проверки методов
 * {@link TemperatureFit#idealTemperatureForFruits(int)}
 * и {@link TemperatureFit#idealTemperatureForMeat(int)}
 * в классе {@link TemperatureFit}.
 *
 * <p>Проверяются корректные расчеты оптимальных температур хранения
 * продуктов.</p>
 *
 * <p><b>Примеры тестирования:</b></p>
 * <pre>{@code
 * int input = 10;
 * double expected = 8.0;
 * double output = TemperatureFit.idealTemperatureForFruits(input);
 * assertThat(output).isEqualTo(expected, withPrecision(0.01));
 *
 * int input = 10;
 * double expected = 5.0;
 * double output = TemperatureFit.idealTemperatureForMeat(input);
 * assertThat(output).isEqualTo(expected, withPrecision(0.01));
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class TemperatureFitTest {

    /**
     * Проверка метода {@link TemperatureFit#idealTemperatureForFruits(int)}
     * для комнаты с температурой 10°C.
     *
     * <p>Ожидаемый результат: идеальная температура для фруктов 8°C.</p>
     */
    @Test
    void whenRoomTemperature10ThenFruits8() {
        int input = 10;
        double expected = 8.0;
        double output = TemperatureFit.idealTemperatureForFruits(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Проверка метода {@link TemperatureFit#idealTemperatureForMeat(int)}
     * для комнаты с температурой 10°C.
     *
     * <p>Ожидаемый результат: идеальная температура для мяса 5°C.</p>
     */
    @Test
    void whenRoomTemperature10ThenMeat5() {
        int input = 10;
        double expected = 5.0;
        double output = TemperatureFit.idealTemperatureForMeat(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
