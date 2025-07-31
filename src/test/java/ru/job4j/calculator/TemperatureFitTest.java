package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

/**
 * Tests for the {@link TemperatureFit} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class TemperatureFitTest {

    /** Verifies that {@code 10°C} produces {@code 8.0°C} for fruits. */
    @Test
    void whenRoomTemperature10ThenFruits8() {
        int input = 10;
        double expected = 8.0;
        double output = TemperatureFit.idealTemperatureForFruits(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    /** Verifies that {@code 10°C} produces {@code 5.0°C} for meat. */
    @Test
    void whenRoomTemperature10ThenMeat5() {
        int input = 10;
        double expected = 5.0;
        double output = TemperatureFit.idealTemperatureForMeat(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
