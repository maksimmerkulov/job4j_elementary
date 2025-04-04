package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code PrimeNumberTest} предназначен для проверки метода {@link PrimeNumber#calc(int)}
 * в классе {@link PrimeNumber}.
 *
 * <p>Метод {@link PrimeNumber#calc(int)} подсчитывает количество простых чисел в диапазоне
 * от 2 до {@code finish} включительно.</p>
 *
 * <p>В тестах покрываются следующие случаи:</p>
 * <ul>
 *     <li>Маленькие диапазоны ({@code 2}, {@code 5}, {@code 11}) с известным количеством простых чисел.</li>
 *     <li>Средние значения, например {@code 25}, где количество простых чисел увеличивается.</li>
 *     <li>Большие значения, например {@code 49}, где проверяется правильность подсчета на длинном отрезке.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-20
 */
class PrimeNumberTest {

    /**
     * Проверяет подсчет простых чисел в диапазоне до 5.
     * Ожидаемое количество: 3 (простые числа: 2, 3, 5).
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
     * Ожидаемое количество: 5 (простые числа: 2, 3, 5, 7, 11).
     */
    @Test
    void when11Then5() {
        int finish = 11;
        int expected = 5;
        int result = PrimeNumber.calc(finish);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет минимальный диапазон с единственным простым числом (2).
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
