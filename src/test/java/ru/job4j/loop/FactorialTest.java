package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс для проверки метода вычисления факториала в классе Factorial.
 * <p>
 * Этот класс тестирует метод, который вычисляет факториал числа.
 * Факториал числа - это произведение всех положительных целых чисел, меньших или равных данному числу.
 * Например, факториал числа 5 (обозначается 5!) равен 5 * 4 * 3 * 2 * 1 = 120.
 * </p>
 */
class FactorialTest {
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int number = 5;
        int expected = 120;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int expected = 1;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForOneThenOne() {
        int number = 1;
        int expected = 1;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForThreeThenSix() {
        int number = 3;
        int expected = 6;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForSevenThenFiveThousandForty() {
        int number = 7;
        int expected = 5040;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }
}
