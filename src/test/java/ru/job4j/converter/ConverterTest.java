package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

/**
 * Tests for the {@link Converter} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class ConverterTest {

    /** Verifies ruble to euro conversion. */
    @Test
    void whenConvert180RblThen2Euro() {
        double input = 180;
        double expected = 2;
        double output = Converter.rubleToEuro(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    /** Verifies ruble to dollar conversion. */
    @Test
    void whenConvert225RblThen3Dollar() {
        double input = 225;
        double expected = 3;
        double output = Converter.rubleToDollar(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }
}
