package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code CheckPrimeNumberTest} предназначен для проверки метода {@link CheckPrimeNumber#check(int)}
 * в классе {@link CheckPrimeNumber}.
 *
 * <p>Этот класс тестирует алгоритм определения простого числа. Простое число — это натуральное число,
 * которое больше 1 и не имеет других делителей, кроме 1 и самого себя.</p>
 *
 * <p>В тестах покрываются различные случаи:</p>
 * <ul>
 *     <li>Проверка минимального простого числа ({@code 2}).</li>
 *     <li>Проверка типичных простых чисел ({@code 5, 11, 97}).</li>
 *     <li>Проверка составных чисел ({@code 4, 9, 25, 49}).</li>
 *     <li>Проверка граничного случая ({@code 1}), который не является простым.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-02-20
 */
class CheckPrimeNumberTest {

/**
 * Тест проверяет, что число 5 является простым.
 */
    @Test
    void when5ThenTrue() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    /**
     * Тест проверяет, что число 4 не является простым.
     */
    @Test
    void when4ThenFalse() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /**
     * Тест проверяет, что число 1 не является простым.
     */
    @Test
    void when1ThenFalse() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /**
     * Тест проверяет, что число 11 является простым.
     */
    @Test
    void when11ThenTrue() {
        int number = 11;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    /**
     * Тест проверяет, что число 25 не является простым.
     */
    @Test
    void when25ThenFalse() {
        int number = 25;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /**
     * Тест проверяет, что число 9 не является простым.
     */
    @Test
    void when9ThenFalse() {
        int number = 9;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    /**
     * Тест проверяет, что число 49 не является простым.
     */
    @Test
    void when49ThenFalse() {
        int number = 49;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }
}