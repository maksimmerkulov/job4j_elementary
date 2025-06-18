package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code FactorialTest} предназначен для проверки метода вычисления факториала
 * в классе {@link Factorial}.
 *
 * <p>Этот класс тестирует метод {@link Factorial#calculate(int)}, который вычисляет факториал числа.
 * Факториал числа - это произведение всех положительных целых чисел, меньших или равных данному числу.
 * Например, факториал числа {@code 5} (обозначается {@code 5!}) равен {@code 5 * 4 * 3 * 2 * 1 = 120}.</p>
 *
 * <p><b>Тесты включают следующие проверки:</b></p>
 * <ul>
 *     <li>Вычисление факториала для числа {@code 5} (ожидаемый результат: {@code 120})</li>
 *     <li>Вычисление факториала для числа {@code 0} (ожидаемый результат: {@code 1})</li>
 *     <li>Вычисление факториала для числа {@code 1} (ожидаемый результат: {@code 1})</li>
 *     <li>Вычисление факториала для числа {@code 3} (ожидаемый результат: {@code 6})</li>
 *     <li>Вычисление факториала для числа {@code 7} (ожидаемый результат: {@code 5040})</li>
 * </ul>
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