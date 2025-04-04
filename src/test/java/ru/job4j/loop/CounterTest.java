package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Тестовый класс {@code CounterTest} для проверки методов суммирования чисел в классе {@link Counter}.
 *
 * <p>Проверяются методы:</p>
 * <ul>
 *     <li>{@link Counter#sum(int, int)} — вычисляет сумму всех чисел в заданном диапазоне.</li>
 *     <li>{@link Counter#sumByEven(int, int)} — вычисляет сумму всех четных чисел в диапазоне.</li>
 * </ul>
 *
 * <p>Тесты покрывают различные граничные случаи, включая отрицательные значения и неупорядоченные границы.</p>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-02-20
 */
class CounterTest {

    /**
     * Проверяет вычисление суммы чисел от 0 до 10.
     * Ожидаемый результат: 55.
     */
    @Test
    void whenSumFrom0To10Then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Проверяет вычисление суммы чисел от 3 до 8.
     * Ожидаемый результат: 33.
     */
    @Test
    void whenSumFrom3To8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Проверяет вычисление суммы чисел в случае, если начальное и конечное число равны 1.
     * Ожидаемый результат: 1.
     */
    @Test
    void whenSumFrom1To1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Проверяет вычисление суммы чисел от -5 до 10.
     * Ожидаемый результат: 40.
     */
    @Test
    void whenSumFromMinus5To10Then40() {
        int start = -5;
        int finish = 10;
        int expected = 40;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Проверяет случай, когда начальное число больше конечного (10 > 1).
     * Ожидаемый результат: 0.
     */
    @Test
    void whenStartGreaterThanFinishThen0() {
        int start = 10;
        int finish = 1;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    /**
     * Проверяет вычисление суммы четных чисел от 0 до 10.
     * Ожидаемый результат: 30.
     */
    @Test
    void whenSumEvenNumbersFromZeroToTenThenThirty() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет вычисление суммы четных чисел от 3 до 8.
     * Ожидаемый результат: 18.
     */
    @Test
    void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет вычисление суммы четных чисел в случае, если диапазон состоит из одного нечетного числа (1).
     * Ожидаемый результат: 0.
     */
    @Test
    void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет вычисление суммы четных чисел от -5 до 10.
     * Ожидаемый результат: 24.
     */
    @Test
    void whenSumEvenNumbersFromMinusFiveToTenThenTwentyFour() {
        int start = -5;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет случай, когда начальное число больше конечного (10 > 1).
     * Ожидаемый результат: 0.
     */
    @Test
    void whenSumEvenNumbersFromTenToOneThenZero() {
        int start = 10;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}