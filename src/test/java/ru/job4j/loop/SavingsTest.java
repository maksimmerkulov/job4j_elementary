package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Savings} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class SavingsTest {

    /**
     * Verifies {@link Savings#years(double, double, double)}
     * with {@code 500} goal, {@code 100} deposit and {@code 5%} rate.
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
     * Verifies {@link Savings#years(double, double, double)}
     * with {@code 1000} goal, {@code 200} deposit and {@code 10%} rate.
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
     * Verifies {@link Savings#years(double, double, double)}
     * with {@code 1000} goal, {@code 100} deposit and {@code 20%} rate.
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
