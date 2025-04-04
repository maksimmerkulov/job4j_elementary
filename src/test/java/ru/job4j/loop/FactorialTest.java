package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code FactorialTest} предназначен для проверки метода вычисления факториала
 * в классе {@link Factorial}.
 * <p>
 * Этот класс тестирует метод {@link Factorial#calculate(int)}, который вычисляет факториал числа.
 * Факториал числа - это произведение всех положительных целых чисел, меньших или равных данному числу.
 * Например, факториал числа 5 (обозначается 5!) равен 5 * 4 * 3 * 2 * 1 = 120.
 * </p>
 *
 * <p>Тесты включают следующие проверки:</p>
 * <ul>
 *     <li>Вычисление факториала для числа 5 (ожидаемый результат: 120)</li>
 *     <li>Вычисление факториала для числа 0 (ожидаемый результат: 1)</li>
 *     <li>Вычисление факториала для числа 1 (ожидаемый результат: 1)</li>
 *     <li>Вычисление факториала для числа 3 (ожидаемый результат: 6)</li>
 *     <li>Вычисление факториала для числа 7 (ожидаемый результат: 5040)</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-20
 */
class FactorialTest {

    /**
     * Проверка метода {@link Factorial#calculate(int)} для числа 5.
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
     * Проверка метода {@link Factorial#calculate(int)} для числа 0.
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
     * Проверка метода {@link Factorial#calculate(int)} для числа 1.
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
     * Проверка метода {@link Factorial#calculate(int)} для числа 3.
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
     * Проверка метода {@link Factorial#calculate(int)} для числа 7.
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
