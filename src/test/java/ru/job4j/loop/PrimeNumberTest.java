package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code PrimeNumberTest} проверяет метод {@link PrimeNumber#calc(int)}
 * класса {@link PrimeNumber}.
 *
 * <p>Метод {@link PrimeNumber#calc(int)} подсчитывает количество простых чисел
 * в диапазоне от 2 до {@code finish} включительно.</p>
 *
 * <p>Тесты проверяют разные диапазоны чисел:</p>
 * <ul>
 *     <li>Малые: 2, 5, 11</li>
 *     <li>Средние: 25</li>
 *     <li>Большие: 49</li>
 * </ul>
 *
 * <p><b>Примеры тестирования:</b></p>
 * <pre>{@code
 * int finish = 5;
 * int expected = 3;
 * int result = PrimeNumber.calc(finish);
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class PrimeNumberTest {

    /**
     * Проверяет подсчет простых чисел в диапазоне до 5.
     * Ожидаемое количество: 3 (2, 3, 5).
     */
    @Test
    void when5Then3() {
        int finish = 5;
        int expected = 3;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет подсчет простых чисел в диапазоне до 11.
     * Ожидаемое количество: 5 (2, 3, 5, 7, 11).
     */
    @Test
    void when11Then5() {
        int finish = 11;
        int expected = 5;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет подсчет простых чисел в минимальном диапазоне (2).
     * Ожидаемое количество: 1.
     */
    @Test
    void when2Then1() {
        int finish = 2;
        int expected = 1;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет подсчет простых чисел в диапазоне до 25.
     * Ожидаемое количество: 9.
     */
    @Test
    void when25Then9() {
        int finish = 25;
        int expected = 9;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет подсчет простых чисел в диапазоне до 49.
     * Ожидаемое количество: 15.
     */
    @Test
    void when49Then15() {
        int finish = 49;
        int expected = 15;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }
}
