package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code SavingsTest} предназначен для проверки метода {@link Savings#years(double, double, double)}
 * в классе {@link Savings}.
 *
 * <p>Этот класс тестирует метод, который рассчитывает количество лет, необходимых для накопления целевой суммы,
 * с учетом ежегодных депозитов и процентной ставки. В тестах учитываются различные значения для целевой суммы,
 * ежегодного депозита и процентной ставки, чтобы проверить корректность работы метода.</p>
 *
 * <p><b>В тестах проверяются следующие случаи:</b></p>
 * <ul>
 *     <li>Когда целевая сумма 500, ежегодный депозит 100, процент 5%. Результат: 5 лет.</li>
 *     <li>Когда целевая сумма 1000, ежегодный депозит 200, процент 10%. Результат: 5 лет.</li>
 *     <li>Когда целевая сумма 1000, ежегодный депозит 100, процент 20%. Результат: 7 лет.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * double goal = 500;
 * double annualDeposit = 100;
 * double percent = 5;
 * int expected = 5;
 * int result = Savings.years(goal, annualDeposit, percent);
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class SavingsTest {

    /**
     * Проверка метода {@link Savings#years(double, double, double)} с целевой суммой 500,
     * ежегодным депозитом 100 и процентной ставкой 5%.
     * Ожидаемый результат: 5 лет.
     */
    @Test
    void whenGoal500Deposit100Percent5ThenYears5() {
        double goal = 500;
        double annualDeposit = 100;
        double percent = 5;
        int expected = 5;
        int result = Savings.years(goal, annualDeposit, percent);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверка метода {@link Savings#years(double, double, double)} с целевой суммой 1000,
     * ежегодным депозитом 200 и процентной ставкой 10%.
     * Ожидаемый результат: 5 лет.
     */
    @Test
    void whenGoal1000Deposit200Percent10ThenYears5() {
        double goal = 1000;
        double annualDeposit = 200;
        double percent = 10;
        int expected = 5;
        int result = Savings.years(goal, annualDeposit, percent);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверка метода {@link Savings#years(double, double, double)} с целевой суммой 1000,
     * ежегодным депозитом 100 и процентной ставкой 20%.
     * Ожидаемый результат: 7 лет.
     */
    @Test
    void whenGoal1000Deposit100Percent20ThenYears7() {
        double goal = 1000;
        double annualDeposit = 100;
        double percent = 20;
        int expected = 7;
        int result = Savings.years(goal, annualDeposit, percent);
        assertThat(result).isEqualTo(expected);
    }
}