package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code FactorialTest} проверяет метод вычисления факториала
 * {@link Factorial#calculate(int)}.
 *
 * <p>Метод вычисляет факториал числа — произведение всех положительных
 * целых чисел, меньших или равных данному числу.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * int number = 5;
 * int expected = 120;
 * int output = Factorial.calculate(number);
 * assertThat(output).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class FactorialTest {

    /**
     * Проверяет {@link Factorial#calculate(int)} для числа 5.
     * Ожидаемый результат: 120.
     */
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int number = 5;
        int expected = 120;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Проверяет {@link Factorial#calculate(int)} для числа 0.
     * Ожидаемый результат: 1.
     */
    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int expected = 1;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Проверяет {@link Factorial#calculate(int)} для числа 1.
     * Ожидаемый результат: 1.
     */
    @Test
    void whenCalculateFactorialForOneThenOne() {
        int number = 1;
        int expected = 1;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Проверяет {@link Factorial#calculate(int)} для числа 3.
     * Ожидаемый результат: 6.
     */
    @Test
    void whenCalculateFactorialForThreeThenSix() {
        int number = 3;
        int expected = 6;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Проверяет {@link Factorial#calculate(int)} для числа 7.
     * Ожидаемый результат: 5040.
     */
    @Test
    void whenCalculateFactorialForSevenThenFiveThousandForty() {
        int number = 7;
        int expected = 5040;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }
}
