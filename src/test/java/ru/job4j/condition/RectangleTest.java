package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength3AndWidth4ThenDiagonal5() {
        double length = 3;
        double width = 4;
        double expected = 5.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength5AndWidth12ThenDiagonal13() {
        double length = 5;
        double width = 12;
        double expected = 13.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength7AndWidth24ThenDiagonal25() {
        double length = 7;
        double width = 24;
        double expected = 25.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
