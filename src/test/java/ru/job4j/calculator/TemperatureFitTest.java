package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Тест-класс {@code TemperatureFitTest} предназначен для проверки методов
 * {@link TemperatureFit#idealTemperatureForFruits(int)}
 * и {@link TemperatureFit#idealTemperatureForMeat(int)}
 * в классе {@link TemperatureFit}.
 *
 * <p>
 * Проверяются корректные расчеты оптимальных температур хранения продуктов.
 * </p>
 *
 * <p>Пример использования:</p>
 * <pre>
 *     int roomTemperature = 10;
 *     double fruitsTemp = TemperatureFit.idealTemperatureForFruits(roomTemperature);
 *     double meatTemp = TemperatureFit.idealTemperatureForMeat(roomTemperature);
 *     assertThat(fruitsTemp).isEqualTo(8.0, withPrecision(0.01));
 *     assertThat(meatTemp).isEqualTo(5.0, withPrecision(0.01));
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-14
 */
class TemperatureFitTest {

    /**
     * Тест для метода {@link TemperatureFit#idealTemperatureForFruits(int)}.
     *
     * <p>
     * Проверяется, что при комнатной температуре 10°C идеальная температура для фруктов составляет 8°C.
     * </p>
     */
    @Test
    void whenRoomTemperature10ThenFruits8() {
        int input = 10;
        double expected = 8.0;
        double output = TemperatureFit.idealTemperatureForFruits(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /**
     * Тест для метода {@link TemperatureFit#idealTemperatureForMeat(int)}.
     *
     * <p>
     * Проверяется, что при комнатной температуре 10°C идеальная температура для мяса составляет 5°C.
     * </p>
     */
    @Test
    void whenRoomTemperature10ThenMeat5() {
        int input = 10;
        double expected = 5.0;
        double output = TemperatureFit.idealTemperatureForMeat(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
