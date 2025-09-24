package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code SavingsTest} проверяет метод
 * {@link Savings#years(double, double, double)} класса {@link Savings}.
 *
 * <p>Метод {@link Savings#years(double, double, double)} вычисляет количество
 * лет, необходимых для накопления целевой суммы с учетом ежегодных депозитов
 * и процентов.</p>
 *
 * <p>Тесты проверяют разные сценарии:</p>
 * <ul>
 *     <li>Цель 500, депозит 100, процент 5%. Результат: 5 лет.</li>
 *     <li>Цель 1000, депозит 200, процент 10%. Результат: 5 лет.</li>
 *     <li>Цель 1000, депозит 100, процент 20%. Результат: 7 лет.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * double goal = 500;
 * double deposit = 100;
 * double percent = 5;
 * int expected = 5;
 * int result = Savings.years(goal, deposit, percent);
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class SavingsTest {

    /**
     * Проверяет метод {@link Savings#years(double, double, double)}
     * для цели 500, депозита 100 и процента 5%. Ожидаемый результат: 5 лет.
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
     * Проверяет метод {@link Savings#years(double, double, double)}
     * для цели 1000, депозита 200 и процента 10%. Ожидаемый результат: 5 лет.
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
     * Проверяет метод {@link Savings#years(double, double, double)}
     * для цели 1000, депозита 100 и процента 20%. Ожидаемый результат: 7 лет.
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
